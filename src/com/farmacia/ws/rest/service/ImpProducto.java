package com.farmacia.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.farmacia.ws.rest.dao.FactoryDAO;
import com.farmacia.ws.rest.iservice.IProducto;
@Path("/farmaciaTamagno")
public class ImpProducto implements IProducto{
	
	@Override
	@GET
	@Path("/recuperarPorCodigo")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Integer recuperarPorCodigo(String codigo) {
		try {
			return (FactoryDAO.getProductoDAO().recuperarPorCodigo(codigo)).getStock();
		}catch(Exception e) {
			
			return null;
		}
	}

}
