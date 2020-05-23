package br.usjt.PrevisaoDoTempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.usjt.PrevisaoDoTempo.model.Previsao;
import br.usjt.PrevisaoDoTempo.repository.TempoRepository;



@Service
public class PrevisaoService {
	@Autowired
	private TempoRepository previsaoRepo;
	
	public List<Previsao> listaPrevisaoTempo(){
		return previsaoRepo.findAll();
	}
	
	/*
	 * @PostMapping("/alunos") public String salvar(Aluno aluno) { //salvando com o
	 * service alunosService.salvar(aluno); return "redirect:/alunos"; }
	 */

}
