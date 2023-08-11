package br.com.aulatresprojetoum.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		//Integer.parseInt()
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		//Converter um item de caixa de texto para um inteiro
		//Double.parseDouble(nome)
		double Salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
		
		System.out.println("Seu nome é " + nome);
		System.out.println(nome + " tem " + idade + " anos");
		System.out.println("O salário de " + nome + " é " + Salario);
		
	}

}
