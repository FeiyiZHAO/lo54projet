package fr.utbm.lo54projet.Controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.NotNull;

import fr.utbm.lo54projet.Entity.CourseSession;
import fr.utbm.lo54projet.Service.SessionService;


@RestController
@RequestMapping("session")
public class SessionController {
	
	@Autowired
	SessionService sessionService;
	
	@RequestMapping("dateA")
	public List<CourseSession> getSessionByDateA(Date a){
		return sessionService.getByDateA(a);
	}
	
	@RequestMapping("dateB")
	public List<CourseSession> getSessionByDateB(Date b){
		return sessionService.getByDateB(b);
	}
	
	//根据LOCATION ID查询
	@RequestMapping("location")
	public List<CourseSession> getSessionByLocation(Long ID){
		return sessionService.getByLocation(ID);
	}
	
	//查看某个COURSE的所有SESSIONS，via Course CODE
	@RequestMapping("allsessions")
	public List<CourseSession> getSessionByCourse(@NotNull String code){
		return sessionService.getByCourse(code);
	}
}
