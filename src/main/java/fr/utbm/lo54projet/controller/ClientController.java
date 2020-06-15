package fr.utbm.lo54projet.controller;

import java.math.BigInteger;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.utbm.lo54projet.entity.Client;
import fr.utbm.lo54projet.entity.CourseSession;
import fr.utbm.lo54projet.service.ClientService;
import fr.utbm.lo54projet.service.SessionService;

@Controller
public class ClientController {
	@Autowired
	ClientService clientService;
	@Autowired
	SessionService sessionService;

	@RequestMapping("registre")
	public String setSessionId(HttpServletRequest request, @RequestParam("sessionId") BigInteger sessionId,Model model) {
		BigInteger b = new BigInteger(request.getParameter("sessionId"));
		sessionId = b;
		CourseSession cs = sessionService.findBycourseSessionId(b);
		String cc = cs.getCourseCode();
		model.addAttribute("sessionId", b);
		model.addAttribute("sessionNom", cc);
		return "registre";
	}
	
	
	@RequestMapping("success")
	public String getClient(HttpServletRequest request,
			@RequestParam("sessionId") BigInteger sessionId,
			@RequestParam("lastname") String lastname,
			@RequestParam("firstname") String firstname,
			@RequestParam("phone") String phone,
			@RequestParam("address") String adress,
			@RequestParam("email") String email,Model model) {
		BigInteger b = new BigInteger(request.getParameter("sessionId"));
		sessionId = b;
		lastname = request.getParameter("lastname");
		firstname = request.getParameter("firstname");
		phone = request.getParameter("phone");
		adress = request.getParameter("address");
		email = request.getParameter("email");
		Client c = new Client(lastname,firstname,phone,adress,email,sessionId);
		clientService.saveClient(c);
		model.addAttribute("lastname", lastname);
		return "success";
	}
	
}
