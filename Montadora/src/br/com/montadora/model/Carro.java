package br.com.montadora.model;

public class Carro extends Veículo{
	
	private int QuantidadePortas;

	public int getQuantidadePortas() {
		return QuantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		QuantidadePortas = quantidadePortas;
	}	
	public String mostrarAtributos() {
		return "CARRO" +
		"\n====================" +
		"\nModelo: " + getModelo() +
		"\nPeso: " + getPeso() +
		"\nQuantidade de Portas: " + getQuantidadePortas();
	}
	
}
