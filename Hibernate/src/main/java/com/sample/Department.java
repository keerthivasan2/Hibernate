package com.sample;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
	@Table(name="department")
	public class Department {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="cart_id")
		private int id;
		private String name;
		@OneToMany(mappedBy = "dept")
		private Set<Employee> employee;
		public Department(int id, String name) {
			super();
			this.id = id;
		this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Set<Employee> getEmp() {
			return employee;
		}
		public void setEmp(Set<Employee> emp) {
			this.employee = emp;
		}
	}

