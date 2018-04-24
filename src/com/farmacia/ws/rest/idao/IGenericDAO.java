package com.farmacia.ws.rest.idao;

import java.io.Serializable;

public interface IGenericDAO<T> {
	public T recuperar(Serializable id);
}
