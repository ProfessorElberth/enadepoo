package br.edu.infnet.model.domain;

public class Professor extends Funcionario {
	private int qtdeDisciplina;
	
	public void impressao() {
		super.impressao();
		System.out.println("Quantidade de disciplinas: " + qtdeDisciplina);
	}
}
