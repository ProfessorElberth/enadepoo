package br.edu.infnet.model.domain;

import br.edu.infnet.model.auxiliar.Constante;

public class Professor extends Funcionario {
	private int qtdeDisciplina;
	
	@Override
	protected float calcularSalarioLiquido() {
		return super.calcularSalarioLiquido() + (Constante.VL_DISC * qtdeDisciplina);
	}
	
	public void impressao() {
		super.impressao();
		System.out.println("Quantidade de disciplinas: " + qtdeDisciplina);
	}

	public int getQtdeDisciplina() {
		return qtdeDisciplina;
	}

	public void setQtdeDisciplina(int qtdeDisciplina) {
		this.qtdeDisciplina = qtdeDisciplina;
	}
}