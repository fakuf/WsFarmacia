package com.farmacia.ws.rest.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.farmacia.ws.rest.idao.IGenericDAO;

public class GenericDAOHibernateJPA<T> implements IGenericDAO<T> {
	protected Class<T> persistentClass;
	@PersistenceContext(unitName="farmacia") EntityManager entityManager;
	public T recuperar(Serializable id) throws Exception {
		try {
			T entity =
			EMF.getEMF().createEntityManager().find(this.getPersistentClass(), id);
			return entity;
		} catch (Exception e) {
			throw e;
		}	
	}

	public T modificar(T entity) throws Exception {
		try {
			return EMF.getEMF().createEntityManager().merge(entity);
		} catch (Exception e) {
			throw e;
		}	
	}

	public T alta(T entity) throws Exception {
		try {
			EMF.getEMF().createEntityManager().persist(entity);
			return entity;
		} catch (Exception e) {
			throw e;
		}	
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

}
