package com.bolsaideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsaideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "/index", "/", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", "Hola SPRING FRAMEWORK");
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setApellido("Teolotitla");
		usuario.setNombre("Diego");
		usuario.setEmail("diego@hotmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil de usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Usuarios");
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuario(){
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Diego", "Teolotitla", "diego@hotmail.com"));
		usuarios.add(new Usuario("Armando", "Teolotitla", "armando@gmail.com"));
		usuarios.add(new Usuario("Rodrigo", "Teolotitla", "rodrigo@outlook.com"));
		return usuarios;
	}
}
