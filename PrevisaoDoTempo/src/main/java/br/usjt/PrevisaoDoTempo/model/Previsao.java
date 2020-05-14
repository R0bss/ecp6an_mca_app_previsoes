package br.usjt.PrevisaoDoTempo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;



@Entity @AllArgsConstructor @NoArgsConstructor 

public class Previsao implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    
	private String diadasemana;
    private double temperaturamax;
    private double temperaturamin;
    private double umidaderelativa;
    private String descricao;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiadasemana() {
		return diadasemana;
	}
	public void setDiadasemana(String diadasemana) {
		this.diadasemana = diadasemana;
	}
	public double getTemperaturamax() {
		return temperaturamax;
	}
	public void setTemperaturamax(double temperaturamax) {
		this.temperaturamax = temperaturamax;
	}
	public double getTemperaturamin() {
		return temperaturamin;
	}
	public void setTemperaturamin(double temperaturamin) {
		this.temperaturamin = temperaturamin;
	}
	public double getUmidaderelativa() {
		return umidaderelativa;
	}
	public void setUmidaderelativa(double umidaderelativa) {
		this.umidaderelativa = umidaderelativa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
  }