package fr.utbm.lo54projet.Service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.utbm.lo54projet.Entity.Client;
import fr.utbm.lo54projet.Repository.ClientDao;

@Service
public class ClientService {

	@Resource
	private ClientDao clientRepository;

	@Transactional
	public List<Client> getClient() {
		return clientRepository.findAll();
	}

	public Optional<Client> getClientById(Long clientId) {
		return clientRepository.findById(clientId);
		}
	
	public List<Client> getCourseByFirstNameLike(String firstname) {
		return clientRepository.findByFirstNameLike(firstname);
	}

	public List<Client> getCourseByLastNameLike(String lastname) {
		return clientRepository.findByLastNameLike(lastname);
	}
	
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}
	
	public Client updateClient(Client client) {
		return clientRepository.save(client);
	}
	
    public void deleteClient(Long clientId) {
    	clientRepository.deleteById(clientId);
    }
	
}
