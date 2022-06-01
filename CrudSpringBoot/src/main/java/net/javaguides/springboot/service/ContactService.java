package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.interfaceService.IContactService;
import net.javaguides.springboot.interfaces.IContact;
import net.javaguides.springboot.modelo.Contact;

@Service
public class ContactService implements IContactService{

	@Autowired
	private IContact data;
	
	//MÉTODO DAO PARA LISTAR OS DADOS DO BANCO DE DADOS
	@Override
	public List<Contact> listar() {
		
		return (List<Contact>) data.findAll();
	}

	//MÉTODO PARA EDITAR UM REGISTRO DO BANCO DE DADOS
	@Override
	public Optional<Contact> listarId(int id) {
		
		return data.findById(id);
	}
	
	//MÉTODO PARA SALVAR UM REGISTRO NO BANCO DE DADOS
	@Override
	public int save(Contact c) {
		
		int result = 0;
		Contact contact = data.save(c);
		if(contact.equals(null)) {
			result = 1;
		}
		return result;
	}

	//MÉTODO PARA EXCLUIR UM REGISTRO NO BANCO DE DADOS
	@Override
	public void delete(int id) {
		
		data.deleteById(id);
		
	}

}
