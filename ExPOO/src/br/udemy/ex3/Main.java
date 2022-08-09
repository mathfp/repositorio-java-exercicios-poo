package br.udemy.ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entrada:");
		
		aluno.setName(teclado.nextLine());
		aluno.setGrade1(teclado.nextDouble());
		aluno.setGrade2(teclado.nextDouble());
		aluno.setGrade3(teclado.nextDouble());
		
		System.out.println("");
		System.out.println("Saída:");
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", aluno.getFinalGrade()));
		System.out.println(aluno.situacaoAluno());
		
		if (aluno.retornaMissing() != 0) {
			System.out.println("MISSING " + String.format("%.2f", aluno.retornaMissing()) + " POINTS");
		}

		
		teclado.close();
	}

}
