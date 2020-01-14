package cv.cdfortes.minhasfinancas.service;

import cv.cdfortes.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsario(Usuario usuario);
	
	void validarEmail(String email);

}
