package br.edu.infnet.model.domain;

public class Aluno {

	private String nome;
	private String cpf;
	private Contato contato;
	
	@Override
	public String toString() {
		return nome +" - "+ contato.getEmail();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
}