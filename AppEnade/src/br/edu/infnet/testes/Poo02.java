package br.edu.infnet.testes;

import br.edu.infnet.model.domain.Coordenador;
import br.edu.infnet.model.domain.Professor;

public class Poo02 {

	public static void main(String[] args) {
		
		Professor profJose = new Professor();		
		profJose.setNome("Jose");
		profJose.setIdade(42);
		profJose.setSalarioBase(999);
		profJose.setDoutorado(false);
		profJose.setQtdeDisciplina(3);		
		profJose.exibir();

		Coordenador coordMaria = new Coordenador();		
		coordMaria.setNome("Maria");
		coordMaria.setIdade(24);
		coordMaria.setSalarioBase(1234);
		coordMaria.setDoutorado(true);
		coordMaria.setCurso("computação");		
		coordMaria.exibir();
	}
}