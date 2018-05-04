package com.farmacia.ws.rest.idao;

import java.io.Serializable;

public interface IGenericDAO<T> {
	public T recuperar(Serializable id) throws Exception;
	T modificar(T entity) throws Exception;
	T alta(T entity) throws Exception;
}
