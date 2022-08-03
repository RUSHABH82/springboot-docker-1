package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_tbl")
public class Person {
	@Id
	@GeneratedValue
	private Long sl_id;
	private String name;
	private String email;

	public Long getSl_id() {
		return sl_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [sl_id=" + sl_id + ", name=" + name + ", email=" + email + "]";
	}

	public Person(Long sl_id, String name, String email) {
		super();
		this.sl_id = sl_id;
		this.name = name;
		this.email = email;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
