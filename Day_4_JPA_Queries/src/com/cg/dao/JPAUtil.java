package com.cg.dao;

import javax.naming.spi.DirectoryManager;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil 
{
	private static KeyManagerFactory factory;
	private static DirectoryManager em;
	
	static
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static KeyManager getEntityManager()
	{
		if(em == null || !em.isOpen())
		{
			em = factory.createEntityManager();		
		}
	    return em;
	}

}