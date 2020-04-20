package entities;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		double a = (largura * altura);
		return a;
	}
	public double perimetro() {
		double b = (largura + altura) * 2;
		return b;
	}
	
	public double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}
}
