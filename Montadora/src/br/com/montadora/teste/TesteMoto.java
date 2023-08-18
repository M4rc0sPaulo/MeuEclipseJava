package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Moto;

public class TesteMoto {

	public static void main(String[] args) {

		Moto moto = new Moto();
		moto.setModelo(JOptionPane.showInputDialog("Digite o modelo da moto: "));
		// Double.parseDouble()
		moto.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: ")));
		// Integer.parseInt()
		moto.setQuantidadeAdesivos(Integer.parseInt(JOptionPane.showInputDialog("Digite quantos adesivos tem: ")));
		
		System.out.println(moto.mostrarAtributos());

	}

}
