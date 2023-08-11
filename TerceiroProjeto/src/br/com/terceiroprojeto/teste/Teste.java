package br.com.terceiroprojeto.teste;

public class Teste {

	public static void main(String[] args) {
		//Conversão de Valores
		String Teste = "37";
		String TesteDois = "20";
		String TesteResultado = Teste + TesteDois;
		System.out.println(TesteResultado);
		
		
		//Converter
		String TesteTres = "38";
		String	TesteQuatro = "90";
		int TesteTresConvertido = Integer.parseInt(TesteTres);
		int TesteQuatroConvertido = Integer.parseInt(TesteQuatro);
		int TesteResultadoDois = TesteTresConvertido + TesteQuatroConvertido;
		
	System.out.println("A soma de " + TesteTres + " com " + TesteQuatro + " Será " + TesteResultadoDois + ":D");
	
	}

}
