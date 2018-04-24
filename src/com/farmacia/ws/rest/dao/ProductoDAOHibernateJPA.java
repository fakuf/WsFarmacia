package com.farmacia.ws.rest.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.farmacia.ws.rest.idao.IProductoDAO;

public class ProductoDAOHibernateJPA<Producto> extends GenericDAOHibernateJPA<Producto> implements IProductoDAO<Producto> {

	@Override
	public Producto recuperarPorCodigo(String codigo) {
		try {
			
			Query consulta = EMF.getInstance().get().createEntityManager().
			createQuery("select p from Producto p where p.codigo = ?");
			consulta.setParameter(1, codigo);
			Producto resultado = (Producto)consulta.getSingleResult();
			return resultado;
		}catch(Exception e) {
			throw e;
		}
	}

}
