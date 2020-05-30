package fr.utbm.lo54projet.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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

}
