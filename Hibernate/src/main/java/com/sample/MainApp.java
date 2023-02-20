package com.sample;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

public class MainApp {
		
		public static void main(String[] args) {
			org.hibernate.Transaction txn;
			try(Session session = HibernateUtil.getSessionFactory().openSession()){
				txn = session.beginTransaction();
				Department dept = new Department(1203,"Training");
				Employee e1 = new Employee(1042,"Keerthivasan",dept);
				Employee e2 = new Employee(1046,"Naveen",dept);
				Employee e3 = new Employee(1055,"Kannadasan",dept);
				Set<Employee> s1 = new HashSet<Employee>();
				s1.add(e1);
				s1.add(e2);
				s1.add(e3);
				dept.setEmp(s1);
				session.save(dept);
				session.save(e1);
				session.save(e2);
				session.save(e3);
				txn.commit();
				session.close();
			}

		}

	}


