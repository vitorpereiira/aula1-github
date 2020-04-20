package Vetor;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Exerc01 {

	public static void main(String[] args)  throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Hotel[] vetor = new Hotel[10];

		System.out.println("Quantos quartos serao alugados ?");
		int n = leia.nextInt();

		for (int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Hospede #" + i + ":");
			System.out.print("Nome: ");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.print("Email: ");
			String email = leia.nextLine();
			System.out.print("Numero do quarto: ");
			int quarto = leia.nextInt();
			vetor[quarto] = new Hotel(nome, email);
		}

		System.out.println();
		System.out.println("Quarto ocupado por: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}

		leia.close();
	}
}
