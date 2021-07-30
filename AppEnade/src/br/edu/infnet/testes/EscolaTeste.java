package br.edu.infnet.testes;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.model.domain.Contato;
import br.edu.infnet.model.domain.Coordenador;
import br.edu.infnet.model.domain.Escola;
import br.edu.infnet.model.domain.Funcionario;
import br.edu.infnet.model.domain.Professor;

public class EscolaTeste {

	public static void main(String[] args) {
		
		//caso1: criar uma coleção de funcionarios para a escola infnet
		List<Funcionario> funcsEscolaInfnet = new ArrayList<Funcionario>();
		
		//caso2: criar uma coleção de funcionarios para o instituto infnet
		List<Funcionario> funcsInstitutoInfnet = new ArrayList<Funcionario>();
		
		//caso3: criar um professor
		List<String> disciplinas = new ArrayList<String>();
		disciplinas.add("Java Web");
		disciplinas.add("UML");
		disciplinas.add("POO");
		
		Professor profJose = new Professor("Jose", 42, disciplinas);		
		profJose.setSalarioBase(999);
		profJose.setDoutorado(false);

		//caso4: criar um coordenador
		Coordenador coordMaria = new Coordenador("Maria", 24, "computação");		
		coordMaria.setSalarioBase(1234);
		coordMaria.setDoutorado(true);
		
		//caso5: criar a escola infnet
		funcsEscolaInfnet.add(profJose);
		funcsEscolaInfnet.add(coordMaria);
		
		Contato contatoEscolaInfnet = new Contato();
		contatoEscolaInfnet.setEmail("escola@infnet.edu");
		contatoEscolaInfnet.setEndereco("Rua Sao Jose, 90");
		contatoEscolaInfnet.setTelefone("21 1231-1231");				
		Escola escolaInfnet = new Escola("Escola Infnet");
		escolaInfnet.setContato(contatoEscolaInfnet);
		escolaInfnet.setFuncionarios(funcsEscolaInfnet);
		escolaInfnet.impressao(true);
		escolaInfnet.showApresentacao();
		
		//caso6: criar o instituto infnet
		funcsInstitutoInfnet.add(coordMaria);
		
		Contato contatoInstitutoInfnet = new Contato();
		contatoInstitutoInfnet.setEmail("instituto @infnet.edu");
		contatoInstitutoInfnet.setEndereco("Rua SJ, 90");
		contatoInstitutoInfnet.setTelefone("21 987987987");				
		Escola institutoInfnet = new Escola("Instituto Infnet");
		institutoInfnet.setContato(contatoInstitutoInfnet);
		institutoInfnet.setFuncionarios(funcsInstitutoInfnet);
		institutoInfnet.impressao(true);
		institutoInfnet.showApresentacao();
	}
}