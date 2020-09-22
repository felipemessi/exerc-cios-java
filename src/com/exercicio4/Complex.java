package com.exercicio4;

public class Complex {
	
	// TODO Auto-generated method stub
	// [x] Escolha uma representação para os números complexos, usando a forma retangular ou a forma polar;
	// [x] Forneça três construtores que permitam que objetos dessa classe sejam inicializados ao serem alocados na memória:
	// 		[x] um construtor sem parâmetros que inicializa o objeto como zero;
	//	    [x] um construtor com um parâmetro representando a parte real e a parte imaginária será zero; e
	//	    [x] um construtor com dois parâmetros representando as partes real e imaginária respectivamente.
	// [ ] Defina operações para obter a parte real, a parte imaginária, o módulo (valor absoluto) e o ângulo de um número complexo;
	// [ ] Forneça a operação para determinar o inverso aditivo de um número complexo;
	// [ ] Forneça as operações aritméticas básicas com números complexos: adição, subtração, multiplicação e divisão;
	// [ ] Defina a operação toString() para converter um número complexo em String. Utilize o formato (a,b), 
	//		onde a é a parte real e b é a parte imaginária; e
	// [ ] Escreva um aplicativo de teste que demonstra as capacidades da classe Complex, 
	//  	executando todas as operações implementadas.
	
	private double real;
	private double imaginario;
	
	public Complex() {
		this.real = 0.0;
		this.imaginario = 0.0;
	}
	
	public Complex(double real) {
		this.real = real;
		this.imaginario = 0.0;
	}
	
	public Complex(double real, double imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
