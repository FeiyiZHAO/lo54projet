package fr.utbm.lo54projet.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@Column(name = "CLIENT_ID")
	private Long clientId;

	@Column(name = "LASTNAME")
	private String lastname;

	@Column(name = "FIRSTNAME")
	private String firstname;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "PHONE")
	private String phone;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "COURSE_SESSION_ID")
	private Long courseSessionId;// fk

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCourseSessionId() {
		return courseSessionId;
	}

	public void setCourseSessionId(Long courseSessionId) {
		this.courseSessionId = courseSessionId;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", lastName=" + lastname + ", firstName=" + firstname + ", adress="
				+ address + ", phone=" + phone + ", email=" + email + ", courseSessionId=" + courseSessionId + "]";
	}

}
