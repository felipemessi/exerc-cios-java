package com.exercicio5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Datas {

	// TODO Auto-generated method stub
	// [x] Represente uma data usando três atributos: o dia, o mês, e o ano;
	// [ ] Sua classe deve ter um construtor que inicializa os três atributos e verifica a validade dos valores fornecidos;
	// [x] Forneça um construtor sem parâmetros que inicializa a data com a data atual fornecida
	//		pelo Sistema Operacional (Usar: https://goo.gl/LMRXik);
	// [x] Forneça um método set() um get() para cada atributo;
	// [x] Forneça o método toString() para retornar uma representação da data como string.
	//		Considere que a data deve ser formatada mostrando o dia, o mês e o ano separados por
	//		barra (/);
	// [ ] Forneça uma operação para avançar uma data para o dia seguinte;
	// [ ] Escreva um aplicativo de teste que demonstra as capacidades da classe;
	// [ ] Garanta que uma instância desta classe sempre esteja em um estado consistente.

	private int dia;
	private int mes;
	private int ano;
	
//	CONSTRUCTORS
	public Datas(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	 
	public Datas() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		Date date = calendar.getTime();
		this.dia = calendar.get(Calendar.DATE);
		this.mes = calendar.get(Calendar.MONTH)+ 1;
		this.ano = calendar.get(Calendar.YEAR);
	}

//	GENERAL METHODS
	 
	public String toString() {
		 return String.valueOf(this.dia)+ '/' + String.valueOf(this.mes) + '/' + String.valueOf(this.ano);
		 
	 } 
	 
	 
//	GETTER and SETTERS
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}	
	
//	MAIN	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
