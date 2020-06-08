package fr.utbm.lo54projet.Entity;

import java.math.BigInteger;
import java.sql.Date;

public class SessionsResult {
	private String courseCode;
	private String title;
	private Date startDate;
	private Date endDate;
	private int max;
	private String locationCity;
	private String pourcentage;
	private BigInteger courseSessionId;
	
	public SessionsResult() {
	}


	public SessionsResult(String courseCode, String title, Date startDate, Date endDate, int max, String locationCity,
			String pourcentage, BigInteger courseSessionId) {
		super();
		this.courseCode = courseCode;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.max = max;
		this.locationCity = locationCity;
		this.pourcentage = pourcentage;
		this.courseSessionId = courseSessionId;
	}


	public BigInteger getCourseSessionId() {
		return courseSessionId;
	}


	public void setCourseSessionId(BigInteger courseSessionId) {
		this.courseSessionId = courseSessionId;
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

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public String getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(String pourcentage) {
		this.pourcentage = pourcentage;
	}

	@Override
	public String toString() {
		return "SessionsResult [courseCode=" + courseCode + ", title=" + title + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", max=" + max + ", locationCity=" + locationCity + ", pourcentage="
				+ pourcentage + "]";
	}

}
