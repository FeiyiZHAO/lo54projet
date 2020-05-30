package fr.utbm.lo54projet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.utbm.lo54projet.Entity.Location;
import fr.utbm.lo54projet.Service.LocationService;

@RestController
@RequestMapping("location")
public class LocationController {
	@Autowired
	LocationService locationService;
	
	@RequestMapping("allLocations")
	public List<Location> getAllLocation(){
		return locationService.getLocation();
	}
}
