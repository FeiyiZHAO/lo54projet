package fr.utbm.lo54projet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@Column(name = "COURSE_CODE")
	private String courseCode;

	@Column(name = "TITLE")
	private String title;

	public Course(String cc, String t) {
		super();
		courseCode = cc;
		title = t;
	}

	public Course() {
	}

	public Course(Course c) {
		super();
		courseCode = c.courseCode;
		title = c.title;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", title=" + title + "]";
	}

}
