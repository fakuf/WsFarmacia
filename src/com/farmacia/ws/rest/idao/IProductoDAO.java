package com.farmacia.ws.rest.idao;

public interface IProductoDAO<Producto> extends IGenericDAO<Producto>{
	/**
	 * Recupera el producto escaneado a traces del codigo
	 * @param codigo
	 * @return
	 */
	public Producto recuperarPorCodigo(String codigo);
}
