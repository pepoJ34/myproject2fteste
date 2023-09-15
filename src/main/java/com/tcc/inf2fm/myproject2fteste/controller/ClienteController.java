package com.tcc.inf2fm.myproject2fteste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ecotech/cliente")
public class ClienteController {

	@GetMapping("/novo-cliente")
	public String novoCliente() {
		
		return "RegistrarCliente";
	}

}
