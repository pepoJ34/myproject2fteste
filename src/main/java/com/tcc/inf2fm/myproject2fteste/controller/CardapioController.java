package com.tcc.inf2fm.myproject2fteste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cafeteria/cardapio")
public class CardapioController {

	@GetMapping("/novo-cardapio")
	public String novoCardapio() {
		
		return null;
	}

}
