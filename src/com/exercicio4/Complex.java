package com.exercicio4;

public class Complex {
	
	private double real;
	private double imaginario;
	
// CONSTRUCTORS
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
	
// GENERAL METHODS
	
	// Módulo
	public double getModule() {
		return Math.hypot(real, imaginario);
	}

	// Ângulo
    public double getAngulo() {
    	return Math.atan2(imaginario, real);
    }
	
    // Inverso aditivo
    public Complex getInversoAditivo() {
        return new Complex(real, -imaginario);
    }
	
    // Soma
    public Complex soma(Complex b) {
        Complex a = this; 
        double real = a.real + b.real;
        double imaginario = a.imaginario + b.imaginario;
        return new Complex(real, imaginario);
    }

    // Subtracao
    public Complex subtracao(Complex b) {
        Complex a = this;
        double real = a.real - b.real;
        double imaginario = a.imaginario - b.imaginario;
        return new Complex(real, imaginario);
    }

    // Multiplicacao
    public Complex multiplicacao(Complex b) {
        Complex a = this;
        double real = a.real * b.real - a.imaginario * b.imaginario;
        double imaginario = a.real * b.imaginario + a.imaginario * b.real;
        return new Complex(real, imaginario);
    }
    
    // Divide um complexo ao quadrado de forma invertida
    public Complex divideInvertido() {
        double divideInvertido = real*real + imaginario*imaginario;
        return new Complex(real / divideInvertido, -imaginario / divideInvertido);
    }
    // Divisao
    public Complex divisao(Complex b) {
        Complex a = this;
        return a.multiplicacao(b.divideInvertido());
    }
	
	// To String
    public String toString() {
        if (imaginario == 0) return real + "";
        if (real == 0) return imaginario + "i";
        if (imaginario <  0) return real + " - " + (-imaginario) + "i";
        return real + " + " + imaginario + "i";
    }
	
	
//	 GETTER and SETTERS
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginario() {
		return imaginario;
	}

	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}
	
	
	// Main
	public static void main(String[] args) {
		Complex x = new Complex(2,5);
		Complex y = new Complex(1,-2);
		Complex resultado = x.multiplicacao(y);
		System.out.println(resultado.getReal());
		System.out.println(resultado.getImaginario());
	}
}
