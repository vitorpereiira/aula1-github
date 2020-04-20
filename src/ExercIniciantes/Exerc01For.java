package ExercIniciantes;

import java.util.Scanner;

public class Exerc01For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um numero qualquer -> ");
		x = leia.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println("Os numeros impar abaixo do numero digitado sao ->"+i);

	}

}

	}
}
