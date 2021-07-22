package br.edu.infnet.model.domain;

import java.util.Arrays;

import br.edu.infnet.model.auxiliar.Constante;

public class Coordenador extends Funcionario {
	private String curso;
	
	@Override
	protected float calcularSalarioLiquido() {
		return super.calcularSalarioLiquido() + 
				(Arrays.asList(Constante.CURSOS).contains(curso.toUpperCase()) ? Constante.VL_CURSO : 0);
	}

	public void impressao() {
		super.impressao();
		System.out.println("Curso: " + curso);
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}