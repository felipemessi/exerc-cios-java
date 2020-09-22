package com.exercicio2;

public class Invoice {
	// TODO 
	// [x] uma fatura deve incluir as seguintes informações como atributos:
	// 		[x] o número do item faturado;
	//	    [x] a descrição do item;
	//	    [x] a quantidade comprada do item;
	//	    [x] o preço unitário do item.
	// [x] Sua classe deve ter um construtor que inicialize os quatro atributos. 
	// [x] Se a quantidade não for positiva, ela deve ser configurada como 0. 
	// [x] Forneça um método set e um método get() para cada variável de instância.
	// [x] forneça um método chamado getInvoiceAmount() que calcula o valor da fatura
	//		(isso é, multiplica a quantidade pelo preço por item) e depois retorna o 
	//		valor como um double.
	// [ ] Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.
	private int numItem;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Invoice(int numItem, String descricao, int quantidade, double preco) {
		this.numItem = numItem;
		this.descricao = descricao;
		if (quantidade < 0) {
			this.quantidade = 0;
		}else {
			this.quantidade = quantidade;
		}
		if (preco < 0.0) {
			this.preco = 0.0;
		}else {
			this.preco = preco;
		}
	}
	
	public double getInvoiceAmount() {
		return this.quantidade * this.preco;
	}
	
	public int getNumItem() {
		return numItem;
	}
	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public static void main(String[] args) {
		Invoice fatura = new Invoice(1, "tenis nike", 2, 200.0);
		
		System.out.printf("O valor da fatura é R$ %.2f.",fatura.getInvoiceAmount());
	}
}
