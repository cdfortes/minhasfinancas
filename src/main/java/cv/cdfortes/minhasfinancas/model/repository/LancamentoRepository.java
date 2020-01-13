package cv.cdfortes.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cv.cdfortes.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
