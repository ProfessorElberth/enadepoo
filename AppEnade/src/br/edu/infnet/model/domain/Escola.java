package br.edu.infnet.model.domain;

public class Escola {

	private String razaoSocial;
	private Contato contato;

	@Override
	public String toString() {
		return razaoSocial +";"+ contato.toString();
	}
	
	public Escola(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
}