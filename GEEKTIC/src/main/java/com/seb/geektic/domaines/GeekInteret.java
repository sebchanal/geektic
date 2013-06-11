package com.seb.geektic.domaines;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class GeekInteret {

	@Id
	@SequenceGenerator(name="GeekInteretSEQUENCE", sequenceName="GeekInteret_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "GeekInteretSEQUENCE")
	private long id;
	
	private long idGeek;
	private long idInteret;
	
	public long getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public long getIdGeek(){
		return idGeek;
	}
	public void setIdGeek(long idgeek){
		this.idGeek = idgeek;
	}

	
	public long getIdInteret(){
		return idInteret;
	}
	public void setIdInteret(long idinteret){
		this.idInteret = idinteret;
	}
}
