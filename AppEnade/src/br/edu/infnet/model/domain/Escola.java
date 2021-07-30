package br.edu.infnet.model.domain;

import java.util.List;

import br.edu.infnet.interfaces.ICadastravel;

public class Escola implements ICadastravel {

	private String razaoSocial;
	private Contato contato;
	private List<Funcionario> funcionarios;

	@Override
	public void impressaoCadastral() {
		System.out.println("Sou uma escola!!!");
	}
	
	@Override
	public String toString() {
		return razaoSocial +";"+ contato.toString() +";"+ funcionarios.size();
	}
	
	public void showApresentacao() {
		for(Funcionario func : funcionarios) {
			System.out.println(func.obterApresentacao());
		}
	}
	
	public float calcularGastoTotal() {
		
		float valor = 0;
		
		for(Funcionario func : funcionarios) {
			valor = valor + func.calcularSalarioLiquido();  
		}
		
		return valor;
	}
	
	public float calcularGastoTotal(boolean professor) {
		
		if(professor) {
			
			float valor = 0;
			
			for(Funcionario func : funcionarios) {
				if(func instanceof Professor) {
					valor = valor + func.calcularSalarioLiquido();
				}
			}
			
			return valor;
			
		} else {
			return calcularGastoTotal();
		}
	}

	public void impressao() {
		System.out.println(razaoSocial +" - "+ funcionarios.size() +" - "+ calcularGastoTotal());
	}
	
	public void impressao(boolean analitico) {
		impressao();
		
		if(analitico) {
			for(Funcionario func : funcionarios) {
				System.out.println(func.getNome() +" - "+ func.calcularSalarioLiquido());
			}
		}
	}

	public Escola(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}