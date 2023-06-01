package com.sehent.DI.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sehent.DI.app.models.domain.Factura;

import org.springframework.ui.Model;
//import ch.qos.logback.core.model.Model; 

@Controller
@RequestMapping("/factura")
public class FacturaController{

	@Autowired
	private Factura factura;
	
	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("factura", factura);
		model.addAttribute("titulo", "Ejemplo Factura con inyeccionde dependencia");
		return "factura/ver";
	}
	
}