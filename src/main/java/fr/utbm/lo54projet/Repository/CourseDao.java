package fr.utbm.lo54projet.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.utbm.lo54projet.Entity.Course;

public interface CourseDao extends JpaRepository<Course, String> {

	List<Course> findAll();

	List<Course> findByTitleLike(String Name);
}
