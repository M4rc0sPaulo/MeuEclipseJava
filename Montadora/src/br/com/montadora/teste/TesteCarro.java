package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
		//Double.parseDouble()
		carro.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: ")));
		//Integer.parseInt()
		carro.setQuantidadePortas(Integer.parseInt(JOptionPane.showInputDialog("Digite quantas portas tem: ")));
		
		System.out.println(carro.mostrarAtributos());
		
		
	}

}
