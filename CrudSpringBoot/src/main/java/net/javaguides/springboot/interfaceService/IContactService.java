package net.javaguides.springboot.interfaceService;

import java.util.List;
import java.util.Optional;

import net.javaguides.springboot.modelo.Contact;

public interface IContactService {

	public List<Contact> listar();
	
	public Optional<Contact> listarId(int id);
	
	public int save(Contact c);
	
	public void delete(int id);
}
