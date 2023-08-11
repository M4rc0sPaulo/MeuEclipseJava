package br.com.aulatresprojetotres.teste;

import javax.swing.JOptionPane;

public class Teste {

	/*EXERCÍCIO:
	 * Criar um projeto chamado AulaTresProjetoTres.
	 * Criar uma lógica que pegue a idade de uma variavel idadePai e idadeFilho, fazer a média e exibir que se a 
	 * media > 50, com certeza o filho é maior de idade, se não, exibir a mensagem: Talvez o filho é menor de idade
	 * 
	 * 
	 */
	public static void main(String[] args) {
		double idadePai = Integer.parseInt(JOptionPane.showInputDialog("Digite idade do pai: "));
		double idadeFilho = Integer.parseInt(JOptionPane.showInputDialog("Digite idade do filho: "));
		double media =  (idadePai + idadeFilho) /2;
		
		
		if (media > 50) {
			System.out.println("Com certeza o filho é maior de idade!");
		}
		else {
			System.out.println("Talvez o filho é menor de idade!");
		}

	}

}
