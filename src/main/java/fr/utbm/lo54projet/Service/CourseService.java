package fr.utbm.lo54projet.Service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.utbm.lo54projet.Entity.Course;
<<<<<<< HEAD
import fr.utbm.lo54projet.Repository.CourseDao;
=======
import fr.utbm.lo54projet.Repository.CourseRepository;
>>>>>>> c3059727bf17ea75c10c82c4f3c99c057bad82b4

@Service
public class CourseService {

	@Resource
<<<<<<< HEAD
	private CourseDao courseRepository;
=======
	private CourseRepository courseRepository;
>>>>>>> c3059727bf17ea75c10c82c4f3c99c057bad82b4

	@Transactional
	public List<Course> getCourse() {
		return courseRepository.findAll();
	}

	public List<Course> getCourseByNameLike(String Name) {
		return courseRepository.findByTitleLike(Name);
	}

}
