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
	private ClientDao clientDao;

	@Transactional
	public List<Client> getClient() {
		return clientDao.findAll();
	}

	public Optional<Client> getClientById(Long clientId) {
		return clientDao.findById(clientId);
	}
	
	public void saveClient(Client client) {
		clientDao.save(client);
	}
	
	public Client updateClient(Client client) {
		return clientDao.save(client);
	}
	
	
    public void deleteClient(Long clientId) {
    	clientDao.deleteById(clientId);
    }
	
}
