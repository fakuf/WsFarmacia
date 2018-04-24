package com.farmacia.ws.rest.dao;

import java.io.Serializable;

import com.farmacia.ws.rest.idao.IGenericDAO;

public class GenericDAOHibernateJPA<T> implements IGenericDAO<T> {
	protected Class<T> persistentClass;
	
	public T recuperar(Serializable id) {
		try {
			T entity =
			EMF.getInstance().get().createEntityManager().find(this.getPersistentClass(), id);
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
