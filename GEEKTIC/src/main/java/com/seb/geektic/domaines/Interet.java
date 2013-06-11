package com.seb.geektic.domaines;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Interet {
	@Id
	@SequenceGenerator(name="InteretSEQUENCE", sequenceName="Interet_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "InteretSEQUENCE")
	private long id;
	private String Libelle;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	
}
