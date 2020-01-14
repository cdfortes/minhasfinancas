package cv.cdfortes.minhasfinancas.service.impl;

import cv.cdfortes.minhasfinancas.model.entity.Usuario;
import cv.cdfortes.minhasfinancas.model.repository.UsuarioRepository;
import cv.cdfortes.minhasfinancas.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepository repository;

	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		// TODO Auto-generated method stub

	}

}
