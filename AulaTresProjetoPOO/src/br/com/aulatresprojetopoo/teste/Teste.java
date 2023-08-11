package br.com.aulatresprojetopoo.teste;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Joel");
		aluno.setIdade(15);
		aluno.setRm(2663597);

		System.out.println("Nome do Aluno: " + aluno.getNome() + "\nIdade do Aluno: " + aluno.getIdade()
				+ "\nRM do Aluno: " + aluno.getRm());

		Professor professor = new Professor();
		professor.setNome("Clodoaldo");
		professor.setIdade(45);
		professor.setMateria("Matemática");
		professor.setSalario(3.000);

		System.out
				.println("\nNome do professor: " + professor.getNome() + "\nidade do professor: " + professor.getIdade()
						+ "\nMateria dada: " + professor.getMateria() + "\n Saláro: " + professor.getSalario());

		Funcionario funcionario = new Funcionario();

		funcionario.setNome("Elizabeth");
		funcionario.setIdade(35);
		funcionario.setSetor("RH");
		funcionario.setSalario(1.000);

		System.out.println("\nNome do Funcionario: " + funcionario.getNome() + "\nIdade do Funcionario: "
				+ funcionario.getIdade() + "\nSetor do Funcionario: " + funcionario.getSetor() + "\nSalário: "
				+ funcionario.getSalario());

	}

}
