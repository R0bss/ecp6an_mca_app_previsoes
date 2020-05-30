package br.usjt.PrevisaoDoTempo.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.PrevisaoDoTempo.model.DiaDaSemana;
import br.usjt.PrevisaoDoTempo.model.Previsao;

import br.usjt.PrevisaoDoTempo.repository.JPAUtil;

public class CriarPrevisao {
	public static void main(String[] args) {
	EntityManager manager = JPAUtil.getEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	transaction.begin();
	
	DiaDaSemana u = new DiaDaSemana();
	u.setDiadasemana("Segunda-Feira");
	manager.persist(u);
	
	Previsao p = new Previsao();
	
	p.setTemperaturamax(17.4);
	p.setTemperaturamin(17.6);
	p.setUmidaderelativa(1022);
	p.setDescricao("Sky is clear");
	p.setDatahora("15/05/2020 18:30");
	//p.setLatitude(-23.5489);
	//p.setLongitude(-46.6388);
	p.setDiadasemana(u);
	
	manager.persist(p);
	transaction.commit();
	manager.close();
	JPAUtil.close();

	}
}
