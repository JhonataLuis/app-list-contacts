package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.interfaceService.IUsuarioService;
import net.javaguides.springboot.interfaces.IUsuario;
import net.javaguides.springboot.modelo.Usuario;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuario usu;
	
	@Override
	public List<Usuario> listar() {
		
		return (List<Usuario>) usu.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int id) {
		
		
		return usu.findById(id);
	}

	@Override
	public int save(Usuario u) {
		
		int result = 0;
		Usuario usuario = usu.save(u);
		if(usuario.equals(null)) {
			result = 1;
		}
		return result;
		
	}

	@Override
	public void delete(int id) {
		
		usu.deleteById(id);
		
	}

}
