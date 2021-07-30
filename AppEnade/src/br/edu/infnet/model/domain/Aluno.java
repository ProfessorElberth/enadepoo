package br.edu.infnet.model.domain;

import br.edu.infnet.interfaces.ICadastravel;

public class Aluno implements ICadastravel {

	private String nome;
	private String cpf;
	private Contato contato;
	
	@Override
	public void impressaoCadastral() {
		System.out.println("Sou um aluno!!!");
	}

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