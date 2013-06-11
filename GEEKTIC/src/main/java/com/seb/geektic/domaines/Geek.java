package com.seb.geektic.domaines;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Geek {
	
	@Id
	@SequenceGenerator(name="GeekSEQUENCE", sequenceName="Geek_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "GeekSEQUENCE")
	private long id;
	private long nbvue;
	private String nom, prenom, mail, pseudo;
	private boolean sexe;
	
	public long getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPseudo(){
		return pseudo;
	}
	public void setPseudo(String pseudo){
		this.pseudo = pseudo;
	}
	public boolean getSexe(){
		return this.sexe;
	}
	public void setSexe(boolean sexe){
		this.sexe = sexe;
	}
	public void setNbvue(long nbvue){
		this.nbvue = nbvue;
	}
	public long getNbvue(){
		return this.nbvue;
	}
}
