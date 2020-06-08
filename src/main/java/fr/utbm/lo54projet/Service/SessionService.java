package fr.utbm.lo54projet.Service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.utbm.lo54projet.Entity.CourseSession;
import fr.utbm.lo54projet.Entity.SessionsResult;
import fr.utbm.lo54projet.Repository.SessionDao;

@Service
public class SessionService {
	@Resource
	SessionDao sessionDao;

	@Transactional
	// 通过下拉列表选择Location，获得Location ID
	public List<CourseSession> getByLocation(Long LocationId) {
		return sessionDao.findByLocationId(LocationId);
	}

	public List<CourseSession> getByDateA(Date d) {
		return sessionDao.findByStartDateAfter(d);
	}

	public List<CourseSession> getByDateB(Date d) {
		return sessionDao.findByStartDateBefore(d);
	}

	public List<CourseSession> getByCourse(String code) {
		return sessionDao.findByCourseCode(code);
	}

	public List<SessionsResult> getSessions(Long locationId, Date sqlDateA, String keyword) {
		List<SessionsResult> views = new ArrayList<>();
		List<Object[]> result = sessionDao.findSessions(locationId, sqlDateA, "%" + keyword + "%");
		for (Object o : result) {
			SessionsResult view = new SessionsResult();
			Object[] rowArray = (Object[]) o;
			view.setCourseCode(((String) rowArray[0]));
			view.setTitle((String) rowArray[1]);
			view.setStartDate((Date) rowArray[2]);
			view.setEndDate((Date) rowArray[3]);
			view.setMax((int) rowArray[4]);
			view.setPourcentage((String) (rowArray[5].toString() + "%"));
			view.setLocationCity((String) rowArray[6]);
			view.setCourseSessionId(((BigInteger) rowArray[7]));
			views.add(view);
		}
		return views;
	}

	public List<SessionsResult> getSessions(Long locationId, String keyword) {
		List<SessionsResult> views = new ArrayList<>();
		List<Object[]> result = sessionDao.findSessions(locationId, "%" + keyword + "%");
		for (Object o : result) {
			SessionsResult view = new SessionsResult();
			Object[] rowArray = (Object[]) o;
			view.setCourseCode(((String) rowArray[0]));
			view.setTitle((String) rowArray[1]);
			view.setStartDate((Date) rowArray[2]);
			view.setEndDate((Date) rowArray[3]);
			view.setMax((int) rowArray[4]);
			view.setPourcentage((String) (rowArray[5].toString() + "%"));
			view.setLocationCity((String) rowArray[6]);
			view.setCourseSessionId(((BigInteger) rowArray[7]));
			views.add(view);
		}
		return views;
	}

	public List<SessionsResult> getSessions(String keyword) {
		List<SessionsResult> views = new ArrayList<>();
		List<Object[]> result = sessionDao.findSessions("%" + keyword + "%");
		for (Object o : result) {
			SessionsResult view = new SessionsResult();
			Object[] rowArray = (Object[]) o;
			view.setCourseCode(((String) rowArray[0]));
			view.setTitle((String) rowArray[1]);
			view.setStartDate((Date) rowArray[2]);
			view.setEndDate((Date) rowArray[3]);
			view.setMax((int) rowArray[4]);
			view.setPourcentage((String) (rowArray[5].toString() + "%"));
			view.setLocationCity((String) rowArray[6]);
			view.setCourseSessionId(((BigInteger) rowArray[7]));
			views.add(view);
		}
		return views;
	}

	public List<SessionsResult> getSessions(Date sqlDateA, String keyword) {
		List<SessionsResult> views = new ArrayList<>();
		List<Object[]> result = sessionDao.findSessions(sqlDateA, "%" + keyword + "%");
		for (Object o : result) {
			SessionsResult view = new SessionsResult();
			Object[] rowArray = (Object[]) o;
			view.setCourseCode(((String) rowArray[0]));
			view.setTitle((String) rowArray[1]);
			view.setStartDate((Date) rowArray[2]);
			view.setEndDate((Date) rowArray[3]);
			view.setMax((int) rowArray[4]);
			view.setPourcentage((String) (rowArray[5].toString() + "%"));
			view.setLocationCity((String) rowArray[6]);
			view.setCourseSessionId(((BigInteger) rowArray[7]));
			views.add(view);
		}
		return views;
	}

	public List<SessionsResult> getSession() {
		List<SessionsResult> views = new ArrayList<>();
		List<Object[]> result = sessionDao.findSessions();
		for (Object o : result) {
			SessionsResult view = new SessionsResult();
			Object[] rowArray = (Object[]) o;
			view.setCourseCode(((String) rowArray[0]));
			view.setTitle((String) rowArray[1]);
			view.setStartDate((Date) rowArray[2]);
			view.setEndDate((Date) rowArray[3]);
			view.setMax((int) rowArray[4]);
			view.setPourcentage("None");
			view.setLocationCity((String) rowArray[5]);
			views.add(view);
		}
		return views;
	}

}
