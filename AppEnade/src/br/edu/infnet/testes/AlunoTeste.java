package br.edu.infnet.testes;

import br.edu.infnet.model.domain.Aluno;
import br.edu.infnet.model.domain.Contato;

public class AlunoTeste {

	public static void main(String[] args) {
		
		Contato contatoJose = new Contato();
		contatoJose.setEmail("jose@jose.com");
		contatoJose.setEndereco("endereco do jose");
		contatoJose.setTelefone("21987987987");		
		Aluno jose = new Aluno();
		jose.setCpf("123123");
		jose.setNome("jose silva");
		jose.setContato(contatoJose);
		System.out.println(jose);
		
		Contato contatoMaria = new Contato();
		contatoMaria.setEmail("maria@maria.com");
		contatoMaria.setEndereco("maria home");
		contatoMaria.setTelefone("2789789987");		
		Aluno maria = new Aluno(); 
		maria.setCpf("2342342");
		maria.setNome("Maria silva");
		maria.setContato(contatoMaria);
		System.out.println(maria);
	}
}