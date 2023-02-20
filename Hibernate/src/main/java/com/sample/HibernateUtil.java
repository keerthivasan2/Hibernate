package com.sample;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
		private static StandardServiceRegistry registry;
		private static SessionFactory factory;
		public static SessionFactory getSessionFactory() {
			registry = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources source = new MetadataSources(registry);
			Metadata metadata = source.getMetadataBuilder().build();
			factory = metadata.getSessionFactoryBuilder().build();
			return factory;
		}
	}


