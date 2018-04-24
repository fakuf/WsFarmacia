package com.farmacia.ws.rest.dao;

import com.farmacia.ws.rest.idao.IProductoDAO;
import com.farmacia.ws.rest.model.Producto;

public class FactoryDAO {

	public static IProductoDAO<Producto> getProductoDAO() {
		return new ProductoDAOHibernateJPA<Producto>();
	}
}
