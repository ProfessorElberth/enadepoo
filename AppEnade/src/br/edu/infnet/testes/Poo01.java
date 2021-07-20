package br.edu.infnet.testes;

import java.util.Arrays;

public class Poo01 {
	
	private static String nome;
	private static int idade;
	private static float salarioBase;
	private static boolean doutorado;
	private static String curso;
	private static int qtdeDisciplina;
	private static float salarioLiquido;
	
	private static final float VL_DISC = 100;
	private static final float VL_CURSO = 1000;
	private static final String[] CURSOS = new String[] {"COMPUTAÇÃO", "ENGENHARIA", "SISTEMAS"};	

	public static void main(String[] args) {
		nome = "Jose";
		idade = 42;
		salarioBase = 999;
		doutorado = false;
		qtdeDisciplina = 3;
		
		salarioLiquido = (doutorado ? salarioBase*2 : salarioBase) + 
				(VL_DISC * qtdeDisciplina); 
		
		System.out.printf("Professor %s - %d - R$%.2f\n", 
				nome, idade, salarioLiquido);

		nome = "Maria";
		idade = 24;
		salarioBase = 1234;
		doutorado = true;
		curso = "computação";
		
		salarioLiquido = (doutorado ? salarioBase*2 : salarioBase) + 
				(Arrays.asList(CURSOS).contains(curso.toUpperCase()) ? VL_CURSO : 0); 
		
		System.out.printf("Coordenador %s - %d - R$%.2f\n", 
				nome, idade, salarioLiquido);

		nome = "Thamy";
		idade = 18;
		salarioBase = 234;
		doutorado = true;
		qtdeDisciplina = 10;
		
		salarioLiquido = (doutorado ? salarioBase*2 : salarioBase) + 
				(VL_DISC * qtdeDisciplina); 
		
		System.out.printf("Professor %s - %d - R$%.2f\n", 
				nome, idade, salarioLiquido);

		nome = "Will I Am";
		idade = 36;
		salarioBase = 3210;
		doutorado = false;
		curso = "turismo";
		
		salarioLiquido = (doutorado ? salarioBase*2 : salarioBase) + 
				(Arrays.asList(CURSOS).contains(curso.toUpperCase()) ? VL_CURSO : 0); 
		
		System.out.printf("Coordenador %s - %d - R$%.2f\n", 
				nome, idade, salarioLiquido);
	}
}