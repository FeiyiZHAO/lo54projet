package fr.utbm.lo54projet.Service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.utbm.lo54projet.Entity.Course;
import fr.utbm.lo54projet.Repository.CourseRepository;

@Service
public class CourseService {

	@Resource
	private CourseRepository courseRepository;

	@Transactional
	public List<Course> getCourse() {
		return courseRepository.findAll();
	}

	public List<Course> getCourseByNameLike(String Name) {
		return courseRepository.findByTitleLike(Name);
	}

}
