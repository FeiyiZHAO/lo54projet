package fr.utbm.lo54projet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.utbm.lo54projet.Entity.CourseSession;

@RestController
@RequestMapping("")
public class DefaultView {

	@Autowired
	SessionController sc;
	CourseController cc;

	@RequestMapping("")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("/accueil");
		List<CourseSession> cslist = sc.getAllSessions();
		mv.addObject("sessionList", cslist);
		return mv;
	}
}