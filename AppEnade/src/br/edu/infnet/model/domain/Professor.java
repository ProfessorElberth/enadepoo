package br.edu.infnet.model.domain;

import java.util.List;

import br.edu.infnet.model.auxiliar.Constante;

public class Professor extends Funcionario {

	private List<String> disciplinas;
	
	public Professor(String nome, int idade, List<String> disciplinas) {
		super(nome, idade);
		this.disciplinas = disciplinas;
	}

	@Override
	public String obterApresentacao() {
		return "Sou professor, tenho " + this.getIdade() + "anos e leciono " + disciplinas.size() + " matérias";
	}
	
	@Override
	protected float calcularSalarioLiquido() {
		return super.calcularSalarioLiquido() + (Constante.VL_DISC * disciplinas.size());
	}
	
	public void impressao() {
		super.impressao();
		System.out.println("Quantidade de disciplinas: " + disciplinas.size());
	}

	public List<String> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
	}
}