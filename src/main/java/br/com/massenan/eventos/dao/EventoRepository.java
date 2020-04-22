package br.com.massenan.eventos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.massenan.eventos.domain.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
	
	
}
