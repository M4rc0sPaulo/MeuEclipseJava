package br.com.aulatresprojetopoo.teste;

import javax.swing.JOptionPane;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class TesteDois {

	

	public static void main(String[] args) {
		
		//Integer.parseInt(null)
		Aluno aluno = new Aluno();
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
		aluno.setIdade (Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do aluno: ")));
		
		System.out.println("Nome do Aluno: " + aluno.getNome() + "\nIdade do Aluno: " + aluno.getIdade()
		+ "\nRM do Aluno: " + aluno.getRm());
		
		
		Professor professor = new Professor();
		professor.setNome(JOptionPane.showInputDialog("Digite o nome do professor: "));
		professor.setIdade (Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor: ")));
		professor.setMateria (JOptionPane.showInputDialog("Digite a materia do professor: "));
		professor.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite o salário do professor: ")));;
		
		
		
		System.out
		.println("\nNome do professor: " + professor.getNome() + "\nidade do professor: " + professor.getIdade()
				+ "\nMateria dada: " + professor.getMateria() + "\n Saláro: " + professor.getSalario());
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario: "));
		funcionario.setIdade (Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionario: ")));
		funcionario.setSetor (JOptionPane.showInputDialog("Digite O setor do funcionario: "));
		funcionario.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite o salário do funcionario: ")));
		
		
		
		System.out.println("\nNome do Funcionario: " + funcionario.getNome() + "\nIdade do Funcionario: "
				+ funcionario.getIdade() + "\nSetor do Funcionario: " + funcionario.getSetor() + "\nSalário: "
				+ funcionario.getSalario());
		
		
		
	}

}
