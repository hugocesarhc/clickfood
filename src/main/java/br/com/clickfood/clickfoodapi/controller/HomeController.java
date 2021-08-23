package br.com.clickfood.clickfoodapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/sobre")
	public String sobre() {
		return "sobre";
	}

	@RequestMapping("/dica")
	public String dica() {
		return "dica";
	}

}
