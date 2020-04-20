package Orientacao01;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Exemplo03b {

	public static void main(String[] args) {
		
		
			
			Locale.setDefault(Locale.US);
			Scanner leia = new Scanner (System.in);
			Calculator calc = new Calculator();
			
			System.out.println("Digite o RAIO: ");
			double raio = leia.nextDouble();
			
			double c = calc.circuferencia(raio);
			
			double v = calc.volume(raio);
			
			System.out.printf("Circuferencia: %.2f%n", c);
			System.out.printf("Volume: %.2f%n", v);
			System.out.printf("valor de PI: %.2f%n", calc.PI);
			
			leia.close();

	}

}
