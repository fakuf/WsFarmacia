package com.farmacia.ws.rest.dao;

import com.farmacia.ws.rest.idao.IProductoDAO;

public class FactoryDAO {

	public static IProductoDAO getProductoDAO() {
		return new ProductoDAOHibernateJPA();
	}
}
