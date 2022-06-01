package net.javaguides.springboot.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "usuario")//NOME DA TABELA DO BANCO DE DADOS/COMANDO JPA
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codUsu;
	private String firstName;
	private String lastName;
	private int idade;
	
	public Usuario() {
	
	}

	public Usuario(int codUsu, String firstName, String lastName, int idade) {
		super();
		this.codUsu = codUsu;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idade = idade;
	}

	public int getCodUsu() {
		return codUsu;
	}

	public void setCodUsu(int codUsu) {
		this.codUsu = codUsu;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
