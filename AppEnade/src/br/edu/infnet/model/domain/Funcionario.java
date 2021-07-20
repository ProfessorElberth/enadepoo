package br.edu.infnet.model.domain;

public class Funcionario {
	private String nome;
	private int idade;
	protected float salarioBase;
	protected boolean doutorado;
	
	private float calcularSalarioLiquido(){
		return doutorado ? salarioBase*2 : salarioBase;
	}
	
	protected void exibir(){
		System.out.println("Funcion�rio do m�s!!!");
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		System.out.println("Sal�rio l�quido: " + calcularSalarioLiquido());
	}
	
	public void impressao() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Doutorado: " + doutorado);
		System.out.println("Sal�rio base: " + salarioBase);
	}
}