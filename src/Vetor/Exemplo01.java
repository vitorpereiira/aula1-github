package Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o numero de pessoas para entrar com a altura ->");
		int n = leia.nextInt();
		
		double[] vect = new double [n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite a altura das pessoas ->");
			vect[i] = leia.nextDouble();
		}
		
		double sum = 0.0;
			for (int i=0; i<n; i++) {
				sum += vect[i];
			}
		double media = sum / n;
		
		System.out.printf("A media de altura -> %.2f%n", media);
		
		
		
		
		leia.close();

	}

}
