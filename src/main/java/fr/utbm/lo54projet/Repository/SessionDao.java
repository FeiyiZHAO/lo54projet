package fr.utbm.lo54projet.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.utbm.lo54projet.Entity.CourseSession;

public interface SessionDao extends JpaRepository<CourseSession, Long> {

	List<CourseSession> findAll();

	List<CourseSession> findByStartDateAfter(Date startDate);

	List<CourseSession> findByStartDateBefore(Date startDate);

	List<CourseSession> findByLocationId(Long locationId);

	List<CourseSession> findByCourseCode(String courseCode);

	@Query(value = "select s.COURSE_CODE,c.TITLE," + "s.START_DATE," + "s.END_DATE," + "s.MAX,"
			+ "count(cl.COURSE_SESSION_ID)/s.MAX*100," + "l.LOCATION_CITY"
			+ " from location l, course c inner join course_session s" + " on s.COURSE_CODE=c.COURSE_CODE"
			+ " left join client cl" + " on cl.COURSE_SESSION_ID = s.COURSE_SESSION_ID"
			+ " wherel.LOCATION_ID=s.LOCATION_ID and s.LOCATION_ID=?1 and s.START_DATE>?2 and c.TITLE like ?3"
			+ " group by s.COURSE_CODE,c.TITLE,s.START_DATE,s.END_DATE,s.MAX,l.LOCATION_CITY", nativeQuery = true)
	List<Object[]> findSessions(Long locationId, Date sqlDateA, String keyword);

	@Query(value = "select s.COURSE_CODE,c.TITLE," + "s.START_DATE," + "s.END_DATE," + "s.MAX,"
			+ "count(cl.COURSE_SESSION_ID)/s.MAX*100," + "l.LOCATION_CITY"
			+ " from location l, course c inner join course_session s" + " on s.COURSE_CODE=c.COURSE_CODE"
			+ " left join client cl" + " on cl.COURSE_SESSION_ID = s.COURSE_SESSION_ID"
			+ " where l.LOCATION_ID=s.LOCATION_ID and s.LOCATION_ID=?1 and c.TITLE like ?2"
			+ " group by s.COURSE_CODE,c.TITLE,s.START_DATE,s.END_DATE,s.MAX,l.LOCATION_CITY", nativeQuery = true)
	List<Object[]> findSessions(Long locationId, String keyword);

	@Query(value = "select s.COURSE_CODE,c.TITLE," + "s.START_DATE," + "s.END_DATE," + "s.MAX,"
			+ "count(cl.COURSE_SESSION_ID)/s.MAX*100," + "l.LOCATION_CITY"
			+ " from location l, course c inner join course_session s" + " on s.COURSE_CODE=c.COURSE_CODE"
			+ " left join client cl" + " on cl.COURSE_SESSION_ID = s.COURSE_SESSION_ID"
			+ " where l.LOCATION_ID=s.LOCATION_ID and c.TITLE like ?1"
			+ " group by s.COURSE_CODE,c.TITLE,s.START_DATE,s.END_DATE,s.MAX,l.LOCATION_CITY", nativeQuery = true)
	List<Object[]> findSessions(String keyword);

	@Query(value = "select s.COURSE_CODE,c.TITLE," + "s.START_DATE," + "s.END_DATE," + "s.MAX,"
			+ "count(cl.COURSE_SESSION_ID)/s.MAX*100," + "l.LOCATION_CITY"
			+ " from location l, course c inner join course_session s" + " on s.COURSE_CODE=c.COURSE_CODE"
			+ " left join client cl" + " on cl.COURSE_SESSION_ID = s.COURSE_SESSION_ID"
			+ " where l.LOCATION_ID=s.LOCATION_ID and s.START_DATE>?1 and c.TITLE like ?2"
			+ " group by s.COURSE_CODE,c.TITLE,s.START_DATE,s.END_DATE,s.MAX,l.LOCATION_CITY", nativeQuery = true)
	List<Object[]> findSessions(Date sqlDateA, String keyword);

	@Query(value = "select s.COURSE_CODE,c.TITLE," + "s.START_DATE," + "s.END_DATE," + "s.MAX," + "l.LOCATION_CITY"
			+ " from client cl, course c inner join course_session s" + " on s.COURSE_CODE=c.COURSE_CODE"
			+ " inner join location l" + " on l.LOCATION_ID=s.LOCATION_ID", nativeQuery = true)
	List<Object[]> findSessions();
}