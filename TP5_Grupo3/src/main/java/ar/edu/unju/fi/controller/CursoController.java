package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.unju.fi.util.ListaCurso;


@Controller
public class CursoController {

	@GetMapping("/agenda")
	public String getListaCursosAgenda(Model model) {
		ListaCurso listaCursos = new ListaCurso();
		model.addAttribute("cursos", listaCursos.getCursos());
		return "agenda";
	}
	
	@GetMapping("/curso/listaCursos")
	public String getListaCursos(Model model) {
		ListaCurso listaCursos = new ListaCurso();
		model.addAttribute("cursos", listaCursos.getCursos());
		return "lista_cursos";
	}
}
