package br.usjt.PrevisaoDoTempo.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.usjt.PrevisaoDoTempo.model.Previsao;

import br.usjt.PrevisaoDoTempo.model.repository.TempoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrevisaoTempoController {
	@Autowired
	private TempoRepository previsaoRepo;
	@GetMapping("/previsaoTempo")
	public ModelAndView listarPrevisaoTempo() {
		ModelAndView mv = new ModelAndView("lista_Previsao_Tempo");
		List<Previsao> previsaoTempo = previsaoRepo.findAll();
		mv.addObject("previsaoTempo", previsaoTempo);
		return mv;
	}
}
