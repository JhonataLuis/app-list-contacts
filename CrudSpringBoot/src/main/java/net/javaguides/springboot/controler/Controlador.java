package net.javaguides.springboot.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.interfaceService.IContactService;
import net.javaguides.springboot.modelo.Contact;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IContactService service;

	//AÇÃO NO CONTROLADOR PARA LISTAR O DADOS DO BANCO DE DADOS
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Contact> contact = service.listar();
		model.addAttribute("contacts", contact);
		return "index";
	}
	
	//AÇÃO PARA CADASTRAR UM NOVO CONTATO NO BANCO DE DADOS
	@GetMapping("/new")
	public String cadastrar(Model model) {
		
		model.addAttribute("contact", new Contact());
		return "form";
	}
	
	//MÉTODO PARA SALVAR UM NOVO DADO NO BANCO
	@PostMapping("/save")
	public String save(@Validated Contact c, Model model) {
		
		service.save(c);
		return "redirect:/listar";
	}
	
	//AÇÃO PARA EDITAR UM ITEM DO BANCO DE DADOS
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<Contact> contact = service.listarId(id);
		model.addAttribute("contact", contact);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}
