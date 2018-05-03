package com.farmacia.ws.rest.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EMF {
    private static final EntityManagerFactory em = Persistence.createEntityManagerFactory("farmacia");
    
    public static EntityManagerFactory getEMF() {
    	return em;
    }
}


