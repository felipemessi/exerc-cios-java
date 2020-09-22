package com.exercicio3;

public class Empregado {

	// TODO Auto-generated method stub
	// [x] que inclui as três informações a seguir como atributos:
	// 		[x] um primeiro nome
	//	    [x] um sobrenome; e
	//	    [x] um salário mensal.
	// [x] Sua classe deve ter um construtor que inicializa os três atributos. 
	// [x] Forneça um método set() e get() para cada atributo.
	// [x] Se o salário mensal não for positivo, configure-o como 0.0.
	// [ ] Escreva um aplicativo de teste que demonstra as capacidades da classe.
	// [x] Crie duas instâncias da classe e exiba o salário anual de cada instância
	// [x] Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado

	private String nome;
	private String sobrenome;
	private double salario;
	
	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (salario < 0.00) {
			this.salario = 0.00;
		}else {
			this.salario = salario;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static void main(String[] args) {
		Empregado felipe = new Empregado ("Felipe", "Braga", 2500.00);
		Empregado thamara = new Empregado ("Thamara", "Carvalho", 3500.00);
		
		System.out.println("Antes do aumento do salário:");
		
		System.out.printf("\nSalário do Felipe: R$ %.2f.\n", felipe.salario);
		System.out.printf("Salário da Thamara: R$ %.2f.\n\n", thamara.salario);
		
		felipe.setSalario(felipe.getSalario()*1.1);
		thamara.setSalario(thamara.getSalario()*1.1);
		
		System.out.println("Depois do aumento do salário:");
		
		System.out.printf("\nSalário do Felipe: R$ %.2f.\n", felipe.salario);
		System.out.printf("Salário da Thamara: R$ %.2f.\n", thamara.salario);
	}
}
