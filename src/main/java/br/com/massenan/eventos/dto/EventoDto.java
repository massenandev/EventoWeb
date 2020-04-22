package br.com.massenan.eventos.dto;

import br.com.massenan.eventos.domain.Evento;
import br.com.massenan.eventos.utils.DateUtils;

public class EventoDto {

	private Long id;
	private String nome;
	private String organizacao;
	private String local;
	private String data;
	private String hora;

	public static Evento parse(EventoDto vo) {
		Evento ev = new Evento();
		ev.setId(vo.getId());
		ev.setNome(vo.getNome());
		ev.setOrganizacao(vo.getOrganizacao());
		ev.setLocal(vo.getLocal());
		ev.setData(DateUtils.parseDateTime(DateUtils.buildDate(vo.getData(), vo.getHora())));
		return ev;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrganizacao() {
		return organizacao;
	}

	public void setOrganizacao(String organizacao) {
		this.organizacao = organizacao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

}