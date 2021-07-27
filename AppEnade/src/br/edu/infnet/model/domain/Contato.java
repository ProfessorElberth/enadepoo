package br.edu.infnet.model.domain;

public class Contato {
	private String email;
	private String telefone;
	private String endereco;
	
	@Override
	public String toString() {
		return email +";"+ telefone +";"+ endereco;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
