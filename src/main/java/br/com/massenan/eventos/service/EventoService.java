package br.com.massenan.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.massenan.eventos.dao.EventoRepository;
import br.com.massenan.eventos.domain.Evento;

@Service
public class EventoService {

	@Autowired
	private EventoRepository repository;
	
	public List<Evento> loadAll(){
		return repository.findAll();
	}
	
	public void save(Evento evento) {
		repository.save(evento);
	}
}
