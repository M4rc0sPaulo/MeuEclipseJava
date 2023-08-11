package br.com.zoologico.teste;

import br.com.zoologico.model.Mamifero;
import br.com.zoologico.model.Reptil;

public class Teste {

	public static void main(String[] args) {

		Mamifero mamifero = new Mamifero();

		mamifero.setNome("Toby");
		mamifero.setPeso(2.5);
		mamifero.setTempoGestacao(9);
		
		System.out.println("Nome do Animal: " + mamifero.getNome() + 
				"\npeso do Mamifero: " + mamifero.getPeso() + 
				"\nTempo de gestação: " + mamifero.getTempoGestacao() );
		
		//instancia de Réptil
		
		Reptil reptil =  new Reptil();
		
		reptil.setNome("Tartaruga");
		reptil.setPeso(70.50);
		reptil.setCorPrincipalPele("marrom");
		
		System.out.println("Nome do reptil: " + reptil.getNome() +
				"\nPeso do reptil: " + reptil.getPeso()+
				"\nCor principal de pele: " + reptil.getCorPrincipalPele());

	}
	

}
