package br.edu.infnet.testes;

import br.edu.infnet.model.domain.Contato;
import br.edu.infnet.model.domain.Escola;

public class EscolaTeste {

	public static void main(String[] args) {
		
		Contato contatoEscolaInfnet = new Contato();
		contatoEscolaInfnet.setEmail("escola@infnet.edu");
		contatoEscolaInfnet.setEndereco("Rua Sao Jose, 90");
		contatoEscolaInfnet.setTelefone("21 1231-1231");		
		Escola escolaInfnet = new Escola("Escola Infnet");
		escolaInfnet.setContato(contatoEscolaInfnet);		
		System.out.println(escolaInfnet);
		
		Contato contatoInstitutoInfnet = new Contato();
		contatoInstitutoInfnet.setEmail("instituto @infnet.edu");
		contatoInstitutoInfnet.setEndereco("Rua SJ, 90");
		contatoInstitutoInfnet.setTelefone("21 987987987");		
		Escola institutoInfnet = new Escola("Instituto Infnet");
		institutoInfnet.setContato(contatoInstitutoInfnet);
		System.out.println(institutoInfnet);
	}
}