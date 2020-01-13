package cv.cdfortes.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cv.cdfortes.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
