package ExercIniciantes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exerc05 {
	
		public static void calEstoque( ) {
			
			int cod1, num1, cod2, num2;
			float vu1, vu2, total, soma1, soma2;

			Scanner leia = new Scanner(System.in);

			System.out.println("Primeira peca a comprar.\n");
			System.out.println("Digite o codigo da peca: ");
			cod1 = leia.nextInt();

			System.out.println("Digite o numero de pecas: ");
			num1 = leia.nextInt();

			System.out.println("Digite o valor de cada peca: ");
			vu1 = leia.nextFloat();

			soma1 = num1 * vu1;

			System.out.println("Segunda peca a comprar. \n");
			System.out.println("Digite o codigo da peca: ");
			cod2 = leia.nextInt();

			System.out.println("Digite o numero de pecas: ");
			num2 = leia.nextInt();

			System.out.println("Digite o valor de cada peca: ");
			vu2 = leia.nextFloat();

			soma2 = num2 * vu2;
			
			total = vu1 + vu2;
			
			System.out.printf("Total a pagar R$ %.2f%n", total);
			
			leia.close();
			
			
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JOptionPane.showConfirmDialog(null, "Antes de chamar o metodo.");
		
		calEstoque();

		

	
	}

}
