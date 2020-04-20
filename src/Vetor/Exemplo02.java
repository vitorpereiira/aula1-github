package Vetor;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoV;

public class Exemplo02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o numero de objetos ->");
		int n = leia.nextInt();
		
		ProdutoV[] vect = new ProdutoV[n];
		
		for (int i=0; i<vect.length; i++) {
			leia.nextLine();
			System.out.println("Digite o nome do produto");
			String nome = leia.nextLine();
			System.out.println("Digite o preco do produto");
			double preco = leia.nextDouble();
			vect[i] = new ProdutoV(nome, preco);
			
		}
		
		double sum = 0.0;
			for (int i=0; i<vect.length; i++) {
				sum += vect[i].getPreco();
			}
		double media = sum / vect.length;
		
		System.out.printf("A media de preco dos produtos = %.2f%n", media);
		
		
		
		
		
		
		leia.close();

	}

}
