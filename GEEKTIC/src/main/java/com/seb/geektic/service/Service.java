package com.seb.geektic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import com.seb.geektic.dao.GeekDao;
import com.seb.geektic.dao.GeekInteretDao;
import com.seb.geektic.dao.InteretDao;
import com.seb.geektic.domaines.Geek;
import com.seb.geektic.domaines.GeekInteret;
import com.seb.geektic.domaines.Interet;


@Component
@Transactional
public class Service {

	private GeekDao geekDao;
	private InteretDao interetDao;
	private GeekInteretDao giDao;
	
	public Service(){
		
	}
	
	@Autowired
	public Service(GeekDao dao) {
		this.geekDao = dao;
	}

	public Geek FindGeekById(long id){
		return geekDao.findById(id);
	}
	
	public List<Geek> FindByPseudoSexeInterets(String pseudo, String sexe, String[] interets){
		return geekDao.findByPseudoSexeInterets(pseudo, sexe, interets);
	}
	
	public void AddVue(Geek geek){
		geekDao.persist(geek);
	}
	
	public List<Interet> FindInterets(){
		return interetDao.findInterets();
	}
	
	public List<GeekInteret> FindGeekInteret(){
		return giDao.findGeekInteret();
	}
}