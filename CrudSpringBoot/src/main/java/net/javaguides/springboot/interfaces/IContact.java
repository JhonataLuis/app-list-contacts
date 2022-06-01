package net.javaguides.springboot.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.modelo.Contact;

@Repository
public interface IContact extends CrudRepository<Contact, Integer>{

}
