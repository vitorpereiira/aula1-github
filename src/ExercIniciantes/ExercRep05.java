package ExercIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class ExercRep05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
	 double cod, cod1 = 4.00, cod2 = 4.50, cod3 = 5.00, cod4 = 2.00, cod5 = 1.50;
	 int qnt;
	 Scanner leia = new Scanner (System.in);
	 
	 System.out.println("Digite o codigo do produto consumido ->");
	 cod = leia.nextDouble();
	 
	 System.out.println("Digite a quantidade do produto consumido ->");
	 qnt = leia.nextInt();
	 
	 if (cod == 1) {
		 cod = cod1 * qnt;
		 System.out.printf("Valor total R$ %.2f%n", cod);
	 } else { 
		 if (cod == 2) {
			 cod = cod2 *qnt;
			 System.out.printf("Valor total R$ %.2f%n", cod);
		 } else {
			 if (cod == 3) {
				 cod = cod3 * qnt;
				 System.out.printf("Valor total R$ %.2f%n", cod);
			 } else {
				 if (cod == 4) {
					 cod = cod4 * qnt;
					 System.out.printf("Valor total R$ %.2f%n", cod);
				 } else {
					 if (cod == 5) {
						 cod = cod5 * qnt;
						 System.out.printf("Valor total R$ %.2f%n", cod);
					 }
				 }
			 }
		 }
		 
	 }
	 

	}

}
