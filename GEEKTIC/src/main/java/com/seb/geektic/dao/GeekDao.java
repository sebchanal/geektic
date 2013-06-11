package com.seb.geektic.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import com.seb.geektic.domaines.Geek;

@Component
public class GeekDao {
	
	@PersistenceContext
	private EntityManager em;

	public GeekDao() {

	}

	public GeekDao(EntityManager em) {
		this.em = em;
	}

	public Geek findById(long id) {
		return em.find(Geek.class, id);
	}
	
	public List<Geek> findByPseudoSexeInterets(String pseudo, String sexe,
			String[] listinterets) {
		String jpql = "SELECT DISTINCT g FROM Geek g WHERE lower(g.pseudo) LIKE :pseudo";
		ArrayList<Long> ArrayInterets = new ArrayList<>();
		
		if (listinterets != null)
			for(int i = 0; i<listinterets.length; i++)
				ArrayInterets.add(Long.parseLong(listinterets[i]));
		
		switch (sexe) {
		case "tous":
			if (ArrayInterets.size() > 0){
				jpql += " AND g.id IN (SELECT DISTINCT gi.idGeek FROM GeekInteret gi WHERE gi.idInteret IN (:interets))";
				return em.createQuery(jpql, Geek.class)
						.setParameter("pseudo", "%" + pseudo.toLowerCase() + "%")
						.setParameter("interets", ArrayInterets)
						.getResultList();
			}
			return em.createQuery(jpql, Geek.class)
					.setParameter("pseudo", "%" + pseudo.toLowerCase() + "%")
					.getResultList();
		}
		jpql += " AND g.sexe = :sexe";
		if (ArrayInterets.size() > 0)
		{
			jpql += " AND g.id IN (SELECT DISTINCT gi.idGeek FROM GeekInteret gi WHERE gi.idInteret IN (:interets))";
			return em.createQuery(jpql, Geek.class)
					.setParameter("pseudo", "%" + pseudo.toLowerCase() + "%")
					.setParameter("sexe", Boolean.parseBoolean(sexe))
					.setParameter("interets", ArrayInterets)
					.getResultList();
		}
		return em.createQuery(jpql, Geek.class)
				.setParameter("pseudo", "%" + pseudo.toLowerCase() + "%")
				.setParameter("sexe", Boolean.parseBoolean(sexe))
				.getResultList();
	}

	public void persist(Geek geek) {
		em.persist(geek);
	}
}
