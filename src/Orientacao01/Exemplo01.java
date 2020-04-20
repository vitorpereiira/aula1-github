package Orientacao01;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Exemplo01 {

	// Programa p/ ler os dados de dois triangulos e verificar qual deles tem a
	// maior area.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entre com com as medidas do triangulo X ->");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();

		System.out.println("Entre com com as medidas do triangulo Y ->");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("A area do triangulo X %.4f%n", areaX);
		System.out.printf("A area do triangulo Y %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Area maior X");
		} else {
			System.out.println("Area maior Y");

			leia.close();
		}

	}

}
