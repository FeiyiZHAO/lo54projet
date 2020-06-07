package fr.utbm.lo54projet.Service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.utbm.lo54projet.Entity.Location;

import fr.utbm.lo54projet.Repository.LocationDao;

@Service
public class LocationService {

	@Resource
	private LocationDao locationDao;

	@Transactional
	public List<Location> getLocation() {
		return locationDao.findAll();
	}
	
	public Long findId(String locationCity){
		Location l = new Location();
		l = locationDao.findByLocationCity(locationCity);
		return l.getLocationId();
	}
	

}
