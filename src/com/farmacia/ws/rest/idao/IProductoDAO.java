package com.farmacia.ws.rest.idao;

import com.farmacia.ws.rest.model.Producto;

public interface IProductoDAO extends IGenericDAO<Producto>{
	/**
	 * Recupera el producto escaneado a traces del codigo
	 * @param codigo
	 * @return
	 */
	public Producto recuperarPorCodigo(String codigo);
}
