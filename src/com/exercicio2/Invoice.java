package com.exercicio2;

public class Invoice {

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
