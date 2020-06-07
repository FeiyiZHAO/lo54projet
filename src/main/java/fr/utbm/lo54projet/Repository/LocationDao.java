package fr.utbm.lo54projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.utbm.lo54projet.Entity.Location;

import java.util.List;

public interface LocationDao extends JpaRepository<Location, Long>{
	
	List<Location> findAll();

    Location findByLocationCity(String LocationCity);
}
