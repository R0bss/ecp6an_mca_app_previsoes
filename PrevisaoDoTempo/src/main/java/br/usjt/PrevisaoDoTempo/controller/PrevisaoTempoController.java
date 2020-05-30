package br.usjt.PrevisaoDoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.usjt.PrevisaoDoTempo.model.Previsao;

import br.usjt.PrevisaoDoTempo.service.PrevisaoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrevisaoTempoController {
	@Autowired
	private PrevisaoService previsaoService;
	@GetMapping("/previsaoTempo")
	public ModelAndView listarPrevisaoTempo() {
		ModelAndView mv = new ModelAndView("lista_Previsao_Tempo");
		List<Previsao> previsaoTempo = previsaoService.listaPrevisaoTempo();
		mv.addObject("previsaoTempo", previsaoTempo);
		return mv;
	}
}
