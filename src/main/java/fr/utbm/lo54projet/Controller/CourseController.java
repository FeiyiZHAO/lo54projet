package fr.utbm.lo54projet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.utbm.lo54projet.Entity.Course;
import fr.utbm.lo54projet.Service.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {

	@Autowired
	CourseService courseService;

	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping("getCourse")
	public List<Course> getCourse() {
		return courseService.getCourse();
	}

	@RequestMapping("getCourseTitleLike")
	public List<Course> getCourseTitleLike(String Name) {
		return courseService.getCourseByNameLike("%" + Name + "%");
	}
	//可以通过超链接指向某个课程对应的Session
}
