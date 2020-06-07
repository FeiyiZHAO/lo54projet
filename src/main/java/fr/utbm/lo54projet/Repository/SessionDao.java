package fr.utbm.lo54projet.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.utbm.lo54projet.Entity.CourseSession;

public interface SessionDao extends JpaRepository<CourseSession, Long> {

	List<CourseSession> findAll();

	List<CourseSession> findByStartDateAfter(Date startDate);

	List<CourseSession> findByStartDateBefore(Date startDate);

	List<CourseSession> findByLocationId(Long locationId);

	List<CourseSession> findByCourseCode(String courseCode);

}