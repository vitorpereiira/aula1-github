package Orientacao01;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Exerc02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Salario salario = new Salario();

		System.out.println("Entre com os dados do colaborador ->");
		System.out.println("Nome: ");
		salario.nome = leia.nextLine();
		System.out.print("Salario Bruto: ");
		salario.bruto = leia.nextDouble();
		System.out.print("Imposto: ");
		salario.imposto = leia.nextDouble();

		System.out.println();
		System.out.println("informações do colaborador:" + salario);

		System.out.println();
		System.out.println("Entre com a porcentagem dada para aumento: ");
		double porcentagem = leia.nextDouble();
		salario.increaseSalary(porcentagem);

		System.out.println();
		System.out.println("Salario atualizado: " + salario);

		leia.close();
	}

}
