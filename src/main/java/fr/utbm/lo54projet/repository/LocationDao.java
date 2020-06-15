package fr.utbm.lo54projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.utbm.lo54projet.entity.Location;

import java.util.List;
@Repository
public interface LocationDao extends JpaRepository<Location, Long>{
	
	List<Location> findAll();

    Location findByLocationCity(String LocationCity);
}
