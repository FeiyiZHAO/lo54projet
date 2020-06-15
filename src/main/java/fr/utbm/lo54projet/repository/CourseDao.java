package fr.utbm.lo54projet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.utbm.lo54projet.entity.Course;
@Repository
public interface CourseDao extends JpaRepository<Course, String> {

	List<Course> findAll();

	List<Course> findByTitleLike(String Name);

}
