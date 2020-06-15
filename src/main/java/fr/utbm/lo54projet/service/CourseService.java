package fr.utbm.lo54projet.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.utbm.lo54projet.entity.Course;
import fr.utbm.lo54projet.repository.CourseDao;

@Service
public class CourseService {

	@Resource
	private CourseDao courseRepository;

	@Transactional
	public List<Course> getCourse() {
		return courseRepository.findAll();
	}

	public List<Course> getCourseByNameLike(String Name) {
		return courseRepository.findByTitleLike(Name);
	}

}
