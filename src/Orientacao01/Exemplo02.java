package Orientacao01;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Exemplo02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		Produto produto = new Produto();
		System.out.println("Entre com os dados do produto ->");
		System.out.println("Nome: ");
		produto.nome = leia.nextLine();
		System.out.print("Preco: ");
		produto.preco = leia.nextDouble();
		System.out.print("Quantidade em stock: ");
		produto.quantidade = leia.nextInt();
		
		System.out.println();
		System.out.println("informações do produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produtos para ser adicionado no estoque: ");
		int quantity = leia.nextInt();
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados do estoque: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produtos para serem removidos no estoque: ");
		quantity = leia.nextInt();
		produto.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados do estoque: " + produto);

	}

}
