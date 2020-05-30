package br.usjt.PrevisaoDoTempo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="diadasemana")
public class DiaDaSemana implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private Long id;
    
	private String diadasemana;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diadasemana == null) ? 0 : diadasemana.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiaDaSemana other = (DiaDaSemana) obj;
		if (diadasemana == null) {
			if (other.diadasemana != null)
				return false;
		} else if (!diadasemana.equals(other.diadasemana))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
