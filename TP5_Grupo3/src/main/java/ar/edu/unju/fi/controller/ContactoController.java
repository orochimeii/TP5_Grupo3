package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactoController {
	@GetMapping("/contacto")
	public String getIndexPage(Model model) {
		return "contacto";
	}
}
