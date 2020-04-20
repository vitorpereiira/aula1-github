package Orientacao01;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo03 {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o RAIO: ");
		double raio = leia.nextDouble();
		
		double c = circuferencia(raio);
		
		double v = volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("valor de PI: %.2f%n", PI);
		
		leia.close();
		
	}
	
	public static double circuferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
		
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}

}


