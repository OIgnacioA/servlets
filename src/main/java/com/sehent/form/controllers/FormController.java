package com.sehent.form.controllers;




@Controller
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "formulario Usuarios");
		return "form";
	}
	
	
	
	@PostMapping("/form")
	public String procesar(Model model,  
			@RequestParam(name= "username") String username,
			@RequestParam String password, 
			@RequestParam String email) {	
		
		model.addAttribute("titulo", "Resultado del form");
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		model.addAttribute("email", email);
		
		
		
		
		return "resultado";
	}
	
	
	
	
	
}
