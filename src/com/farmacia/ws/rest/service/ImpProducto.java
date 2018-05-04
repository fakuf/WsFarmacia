package com.farmacia.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.farmacia.ws.rest.dao.FactoryDAO;
import com.farmacia.ws.rest.idao.IProductoDAO;
import com.farmacia.ws.rest.iservice.IProducto;
import com.farmacia.ws.rest.model.Producto;
@Path("/farmaciaTamagno")
public class ImpProducto implements IProducto{
	
	@Override
	@GET
	@Path("/recuperarPorCodigo")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Integer recuperarPorCodigo(@QueryParam("codigo") String codigo) {
		try {
			return (FactoryDAO.getProductoDAO().recuperarPorCodigo(codigo)).getStock();
		}catch(Exception e) {
			
			return null;
		}
	}

	@Override
	@GET
	@Path("/initialize")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Integer initialize() {
		try {
			IProductoDAO productoDAO = FactoryDAO.getProductoDAO();
			Producto p = new Producto();
			p.setCodigo("FAKU");
			p.setNombre("RIVOTRIL");
			p.setStock(50);
			productoDAO.alta(p);
			Producto p2 = new Producto();
			p2.setCodigo("CHACA");
			p2.setNombre("CAFEINA");
			p2.setStock(50);
			productoDAO.alta(p2);
			return 1;
		}catch(Exception e) {
			return 0;
		}
	}

}
