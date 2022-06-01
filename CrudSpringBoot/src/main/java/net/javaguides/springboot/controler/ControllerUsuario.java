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

import net.javaguides.springboot.interfaceService.IUsuarioService;
import net.javaguides.springboot.modelo.Usuario;

@Controller
@RequestMapping
public class ControllerUsuario {

	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/listarUsuario")
	public String listar(Model model) {
		
		List<Usuario> usuario = service.listar();
		model.addAttribute("usuarios", usuario);
		return "listUsu";
	}
	
	@GetMapping("/newUsuario")
	public String cadastrar(Model model) {
		
		model.addAttribute("newusuario", new Usuario());
		return "form_usuario";
	}
	
	//AÇÃO PARA SALVAR UM USUARIO
	@PostMapping("/saveUsuario")
	public String save(@Validated Usuario u, Model model) {
		
		service.save(u);
		
		return "redirect:/listarUsuario";
	}
	
	@GetMapping("/editarUsuario/{id}")
	public String editarUsu(@PathVariable int id, Model model) {
		
		Optional<Usuario> usuario = service.listarId(id);
		model.addAttribute("newusuario", usuario);
		return "form_usuario";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUsu(@PathVariable int id, Model model) {
		
		service.delete(id);
		
		return "redirect:/listarUsuario";
	}
}
