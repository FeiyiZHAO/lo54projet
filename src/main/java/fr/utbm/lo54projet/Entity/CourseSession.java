package fr.utbm.lo54projet.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CourseSession {

	@Id
	@Column(name = "COURSE_SESSION_ID")
	private Long courseSessionId;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "MAX")
	private int max;

	@Column(name = "COURSE_CODE")
	private String courseCode;

	@Column(name = "LOCATION_ID")
	private Long locationId;

	public Long getCourseSessionId() {
		return courseSessionId;
	}

	public void setCourseSessionId(Long courseSessionId) {
		this.courseSessionId = courseSessionId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "CourseSession [courseSessionId=" + courseSessionId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", max=" + max + ", courseCode=" + courseCode + ", locationId=" + locationId + "]";
	}
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COURSE_CODE",insertable=false,updatable=false)
    @JsonIgnore
    @NotFound(action = NotFoundAction.IGNORE)
	private Course course;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOCATION_ID",insertable=false,updatable=false)
    @JsonIgnore
    @NotFound(action = NotFoundAction.IGNORE)
	private Location location;
}
