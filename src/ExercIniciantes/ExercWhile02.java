package ExercIniciantes;

import java.util.Scanner;

public class ExercWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nao entendi a proposta do exercicio.
		
		Scanner leia = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = leia.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = leia.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		leia.close();
	}

}
