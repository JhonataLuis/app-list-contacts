package net.javaguides.springboot.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



//ADICIONADO AS DEPENDENCIAS

@Entity
@Table(name = "contacts1")//NOME DA TABELA DO BANCO DE DADOS/COMANDO JPA
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contact_id;
	private String name;
	private String email;
	private String phone;
	private String address;
	
	
	public Contact() {
		
		
	}


	public Contact(int contact_id, String name, String email, String phone, String address) {
		super();
		this.contact_id = contact_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}


	public int getContact_id() {
		return contact_id;
	}


	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
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


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
