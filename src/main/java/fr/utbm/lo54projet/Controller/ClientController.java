package fr.utbm.lo54projet.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import fr.utbm.lo54projet.Entity.Client;
import fr.utbm.lo54projet.Entity.SessionsResult;
import fr.utbm.lo54projet.Repository.ClientDao;
import fr.utbm.lo54projet.Service.ClientService;

@Controller
public class ClientController {
	@Autowired
	ClientService clientService;

	@RequestMapping("registre")
	public ModelAndView registre() {
		ModelAndView mv = new ModelAndView("/registre");
		List<Client> client = clientService.getClient();
		mv.addObject("clientList", client);
		return mv;
	}
	
	@RequestMapping("update")
    public ModelAndView update(){
		ModelAndView mv = new ModelAndView("/update");
		List<Client> client = clientService.getClient();
		mv.addObject("clientList", client);
		return mv;
   }
	
}
