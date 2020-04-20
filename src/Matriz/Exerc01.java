package Matriz;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um numero inteiro qualquer: ");
		int m = leia.nextInt();
		System.out.print("Digite outro numero inteiro qualquer: ");
		int n = leia.nextInt();

		System.out.print("Digite os numeros da Matriz !");

		int[][] vet = new int[m][n];

		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet[i].length; j++) {
				vet[i][j] = leia.nextInt();
			}
		}

		System.out.println("Digite um numero igual a um numero anterior.");
		int x = leia.nextInt();

		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet[i].length; j++) {
				if (vet[i][j] == x) {
					System.out.println("Posicao " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + vet[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + vet[i - 1][j]);
					}
					if (j < vet[i].length - 1) {
						System.out.println("Direita: " + vet[i][j + 1]);
					}
					if (i < vet.length - 1) {
						System.out.println("Abaixo: " + vet[i + 1][j]);
					}
				}
			}
		}

		leia.close();

	}

}
