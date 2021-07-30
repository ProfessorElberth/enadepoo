package br.edu.infnet.model.domain;

public abstract class Funcionario {
	private String nome;
	private int idade;
	protected float salarioBase;
	protected boolean doutorado;
	
	public Funcionario(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	public abstract String obterApresentacao();
	
	protected float calcularSalarioLiquido(){
		return doutorado ? salarioBase*2 : salarioBase;
	}
	
	public void exibir(){
		System.out.println("Funcionário do mês!!!");
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		System.out.println("Salário líquido: " + calcularSalarioLiquido());
	}
	
	public void impressao() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Doutorado: " + doutorado);
		System.out.println("Salário base: " + salarioBase);
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public boolean isDoutorado() {
		return doutorado;
	}

	public void setDoutorado(boolean doutorado) {
		this.doutorado = doutorado;
	}
}