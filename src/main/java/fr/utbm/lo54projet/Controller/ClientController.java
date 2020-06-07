package fr.utbm.lo54projet.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.utbm.lo54projet.Entity.Client;
import fr.utbm.lo54projet.Service.ClientService;

@Controller
public class ClientController {
	@Autowired
	ClientService clientService;

	@RequestMapping("client")
	public String getClient(Model model) {
		List<Client> clients = new ArrayList<>();
		clients = clientService.getClient();
		model.addAttribute("clients", clients);
		return "client";
	}
}
