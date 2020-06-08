package fr.utbm.lo54projet.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import fr.utbm.lo54projet.Entity.Client;
import fr.utbm.lo54projet.Repository.ClientDao;

@Service
public class ClientService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Resource
	private ClientDao clientDao;

	@Transactional
	public List<Client> getClient() {
		return clientDao.findAll();
	}

	public Optional<Client> getClientById(Long clientId) {
		return clientDao.findById(clientId);
	}
	
	public Client saveClient(Client client) {
		return clientDao.save(client);
	}
	
	public Client updateClient(Client client) {
		return clientDao.save(client);
	}
	
    public void deleteClient(Long clientId) {
    	clientDao.deleteById(clientId);
    }
	
}
