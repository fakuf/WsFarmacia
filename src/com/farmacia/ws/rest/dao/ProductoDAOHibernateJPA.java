package com.farmacia.ws.rest.dao;

import javax.persistence.Query;

import com.farmacia.ws.rest.idao.IProductoDAO;
import com.farmacia.ws.rest.model.Producto;

public class ProductoDAOHibernateJPA extends GenericDAOHibernateJPA<Producto> implements IProductoDAO {

	@Override
	public Producto recuperarPorCodigo(String codigo) {
		try {
			
			Query consulta = EMF.getEMF().createEntityManager().
			createQuery("select p from Producto p where p.codigo = :codigo");
			consulta.setParameter("codigo", codigo);
			Producto resultado = (Producto)consulta.getSingleResult();
			return resultado;
		}catch(Exception e) {
			throw e;
		}
	}

}
