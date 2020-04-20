package Orientacao01;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Exerc03 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Aluno estudante = new Aluno();
		
		System.out.println("Digite o nome do aluno -> ");
		estudante.name = leia.nextLine();
		System.out.println("Digite a primeira nota do aluno -> ");
		estudante.grade1 = leia.nextDouble();
		System.out.println("Digite a segunda nota do aluno -> ");
		estudante.grade2 = leia.nextDouble();
		System.out.println("Digite a terceira nota do aluno -> ");
		estudante.grade3 = leia.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", estudante.finalGrade());
		if (estudante.finalGrade() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", estudante.missingPoints());
		}
		else {
		System.out.println("PASS");
		}
		
		leia.close();
	}

}
