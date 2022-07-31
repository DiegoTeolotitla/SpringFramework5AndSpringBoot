package com.bolsaideas.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "Formulario usuarios");
		return "form";
	}
	
	@PostMapping("/form")
	public String procesarFormulario(Model model, 
			@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password,
			@RequestParam(name = "email") String email) {
		model.addAttribute("titulo", "Resultado  form");
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		model.addAttribute("email", email);
		
		return "resultado";
	}
}
