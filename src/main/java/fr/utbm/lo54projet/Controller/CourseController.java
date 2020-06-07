package fr.utbm.lo54projet.Controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.utbm.lo54projet.Entity.Course;
import fr.utbm.lo54projet.Service.CourseService;

@Controller
public class CourseController {

	@Autowired
	CourseService courseService;

	/**
	 * 
	 * 
	 * @return
	 */

	@RequestMapping("course")
    public String getCourse(Model model) {
		List<Course> courses = new ArrayList<>();
        courses = courseService.getCourse();
        model.addAttribute("courses",courses);
        return "course";
    }

/*
 *  filter by keyword containing
 *  
	@RequestMapping("course")
	public String getCourse(HttpServletRequest request,@RequestParam("keyword") String k,Model model) {
		k= request.getParameter("keyword");
		List<Course> courses = new ArrayList<>();
        courses = courseService.getCourseByNameLike("%" + k + "%");
        model.addAttribute("courses",courses);
		return "course";
	}
*/
}
