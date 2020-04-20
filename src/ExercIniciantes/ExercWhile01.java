package ExercIniciantes;

import java.util.Scanner;

public class ExercWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int senha;
		Scanner leia = new Scanner (System.in);

		System.out.println("Digite a senha: ");
		senha = leia.nextInt();
		while (senha != 2002) {
			System.out.println("Senha Invalida.");
			senha = leia.nextInt();
		}
		System.out.println("Acesso Permitido.");
		
		leia.close();
	}

}
