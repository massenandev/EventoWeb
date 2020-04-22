package br.com.massenan.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.massenan.eventos.dto.EventoDto;
import br.com.massenan.eventos.service.EventoService;

@Controller
public class EventoController {

	@Autowired
	private EventoService eventoService;
	
	public String dataLocal;
	
	@GetMapping("/")
	public String load(Model model, EventoDto evento) {
		model.addAttribute("eventos", eventoService.loadAll());
		model.addAttribute("evento", new EventoDto());
		return "eventos";
	}

	@PostMapping("/cadastrar")
	public String create(Model model, @ModelAttribute EventoDto eventoDto) {
		model.addAttribute("evento", new EventoDto());
		eventoService.save(EventoDto.parse(eventoDto));
		model.addAttribute("eventos", eventoService.loadAll());
		return "eventos";
	}

}
