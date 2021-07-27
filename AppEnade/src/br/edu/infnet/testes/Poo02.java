package br.edu.infnet.testes;

import br.edu.infnet.model.domain.Coordenador;
import br.edu.infnet.model.domain.Professor;

public class Poo02 {

	public static void main(String[] args) {
		
		Professor profJose = new Professor("Jose", 42, 3);		
		profJose.setSalarioBase(999);
		profJose.setDoutorado(false);
		profJose.exibir();

		Coordenador coordMaria = new Coordenador("Maria", 24, "computação");		
		coordMaria.setSalarioBase(1234);
		coordMaria.setDoutorado(true);
		coordMaria.exibir();
	}
}