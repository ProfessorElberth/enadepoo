package br.edu.infnet.testes;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.interfaces.ICadastravel;
import br.edu.infnet.model.domain.Aluno;
import br.edu.infnet.model.domain.Coordenador;
import br.edu.infnet.model.domain.Escola;

public class GestaoCadastralTeste {

	public static void main(String[] args) {
		
		List<ICadastravel> lista = new ArrayList<ICadastravel>();		
		
		Aluno aluno = new Aluno();
		
		Coordenador coordenador = new Coordenador("Elberth", 42, "Computação");
		
		Escola escola = new Escola("Instituto Infnet");
		
		lista.add(aluno);
		lista.add(coordenador);
		lista.add(escola);
		
		for(ICadastravel cad : lista) {
			cad.impressaoCadastral();
		}
	}
}