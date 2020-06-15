package fr.utbm.lo54projet.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.utbm.lo54projet.entity.Client;
@Repository
public interface ClientDao extends JpaRepository<Client, Long>{
	
	List<Client> findAll();

	Optional<Client> findById(Long clientId);
	
}
