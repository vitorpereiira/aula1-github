package Orientacao01;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;


public class Exerc01 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		Retangulo x;
		x = new Retangulo();
		
		
		System.out.println("Digite as medidas do retangulo largura x altura: ");
		x.largura = leia.nextDouble();
		x.altura = leia.nextDouble();
		
		double areaX = x.area();
		double perimetroX = x.perimetro();
		double diagonalX = x.diagonal();
		
		System.out.printf("AREA -> %.2f%n",areaX);
		System.out.printf("PERIMETRO -> %.2f%n",perimetroX);
		System.out.printf("DIAGONAL -> %.2f%n",diagonalX);
		
		
		leia.close();

	}

}
