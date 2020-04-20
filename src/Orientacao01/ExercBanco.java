package Orientacao01;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class ExercBanco {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		Banco banco;
		
		
		
		System.out.println("Dados para cadastro da conta. ");
		System.out.print("Digite o numero da conta ->");
		int conta = leia.nextInt();
		System.out.print("Digite o nome do cliente ->");
		leia.nextLine();
		String nome = leia.nextLine();
		System.out.print("Vai realizar um deposito (s/n)? " );
		char resposta = leia.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Digite o valor do deposito inicial ->");
			double depositoInicial = leia.nextDouble();
			banco = new Banco(nome, conta, depositoInicial);
		}
		else {
			banco = new Banco(nome, conta);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Digite um valor para deposito: ");
		double valorDeposito = leia.nextDouble();
		banco.deposito(valorDeposito);
		System.out.println("Dados atualizado da conta: ");
		System.out.println(banco);
		
		
		System.out.println();
		System.out.print("Digite um valor para saque: ");
		double valorSaque = leia.nextDouble();
		banco.saque(valorSaque);
		System.out.println("Dados atualizado da conta: ");
		System.out.println(banco);
		
		
		
		
		
		
		
		
		leia.close();

	}

}
