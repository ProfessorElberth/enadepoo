package br.edu.infnet.model.domain;

public class Coordenador extends Funcionario {
	private String curso;

	public void impressao() {
		super.impressao();
		System.out.println("Curso: " + curso);
	}
}