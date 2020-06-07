package fr.utbm.lo54projet.Service;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.utbm.lo54projet.Entity.CourseSession;
import fr.utbm.lo54projet.Repository.SessionDao;

@Service
public class SessionService {

	@Resource
	SessionDao sessionDao;

	@Transactional
	public List<CourseSession> getSession() {
		return sessionDao.findAll();
	}

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

	// 查询每个Course的所有Session
	public List<CourseSession> getByCourse(String code) {
		return sessionDao.findByCourseCode(code);
	}
}
