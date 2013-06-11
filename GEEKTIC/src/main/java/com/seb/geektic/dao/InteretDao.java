package com.seb.geektic.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import com.seb.geektic.domaines.Interet;

@Component
public class InteretDao {
	@PersistenceContext
	private EntityManager em;

	public InteretDao() {
	}

	public InteretDao(EntityManager em) {
		this.em = em;
	}

	public void persist(Interet interet) {
		em.persist(interet);
	}

	public Interet findById(Long id) {
		return em.find(Interet.class, id);
	}

	public List<Interet> findInterets(){
		String jpql="SELECT i FROM Interet i";
		return em.createQuery(jpql, Interet.class)
				.getResultList();
	}
}
