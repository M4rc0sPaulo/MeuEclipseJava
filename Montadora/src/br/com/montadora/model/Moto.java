package br.com.montadora.model;

public class Moto extends Veículo {

	private int QuantidadeAdesivos;

	public int getQuantidadeAdesivos() {
		return QuantidadeAdesivos;
	}

	public void setQuantidadeAdesivos(int quantidadeAdesivos) {
		QuantidadeAdesivos = quantidadeAdesivos;
	}
	public String mostrarAtributos() {
		return "MOTO" +
		"\n====================" +
		"\nModelo: " + getModelo() +
		"\nPeso: " + getPeso() +
		"\nQuantidade de Adesivos: " + getQuantidadeAdesivos()
		;
	}
	
}
