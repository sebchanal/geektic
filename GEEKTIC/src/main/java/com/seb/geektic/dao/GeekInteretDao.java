package com.seb.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import com.seb.geektic.domaines.GeekInteret;

@Component
public class GeekInteretDao {
	@PersistenceContext
	private EntityManager em;
	
	public GeekInteretDao(){
		
	}
	
	public GeekInteretDao(EntityManager em) {
		this.em = em;
	}

	public List<GeekInteret> findGeekInteret(){
		String jpql="SELECT gi FROM GeekInteret gi";
		return em.createQuery(jpql, GeekInteret.class).getResultList();
	}
}
