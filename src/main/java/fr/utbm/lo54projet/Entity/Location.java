package fr.utbm.lo54projet.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Location {

	@Id
	@Column(name = "LOCATION_ID")
	private Long locationId;

	@Column(name = "LOCATION_CITY")
	private String locationCity;

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationCity=" + locationCity + "]";
	}
	

}
