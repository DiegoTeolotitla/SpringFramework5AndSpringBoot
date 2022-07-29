package com.bolsaideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsaideas.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {

	// Inyeccion por atributo
	@Autowired
	@Qualifier("miServicioComplejo")
	private IServicio servicio;

	// Inyeccion por setter
	/*
	 * @Autowired public void setServicio(IServicio servicio) { this.servicio =
	 * servicio; }
	 */
	// Inyección por constructor, puede o no llevar el @Autowired
	// ya que implicitamente spring inyecta por constructor
	/*
	 * @Autowired public IndexController(IServicio servicio) { this.servicio =
	 * servicio; }
	 */
	@GetMapping({ "/index", "/", "" })
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

}
