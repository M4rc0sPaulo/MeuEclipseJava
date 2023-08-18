package br.com.construtora.teste;

import javax.swing.JOptionPane;

import br.com.construtora.model.Casa;
import br.com.construtora.model.Residencia;

public class Teste {

	public static void main(String[] args) {

		Residencia residencia = new Residencia();
		Casa casa = new Casa();
		
		residencia.setMetrosQuadrados(Double.parseDouble(JOptionPane.showInputDialog("Digite quantos metros quadrados tem a sua casa: ")));
		casa.setTamanhoPortaMetrosQuadrados(Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho da sua porta em metros quadrados: ")));
		
		
		System.out.println("CONSTRUTORA");
		System.out.println("============================");
		System.out.println("\nMetros quadrados da residência: " + residencia.getMetrosQuadrados() + "m2");
		System.out.println("\nTamanho da porta em Metros Quadrados: " + casa.getTamanhoPortaMetrosQuadrados()+ "m2");
		
	}

}
