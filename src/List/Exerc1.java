package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Colab;

public class Exerc1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		List<Colab> list = new ArrayList<>();

		// PART 1 - LEITURA DE DADOS (CADASTRO)

		System.out.print("Quantos funcionarios serao registrados ? ");
		int n = leia.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ": ");
			System.out.print("Id: ");
			int id = leia.nextInt();
			System.out.print("Nome: ");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.print("Salario: ");
			double salario = leia.nextDouble();
			list.add(new Colab(id, nome, salario));
		}

		// PART 2 - AUMENTO DO SALARIO DO FUNCIONARIO:

		System.out.println();
		System.out.print("Digite o ID do funcionario que tera aumento salarial: ");
		int id = leia.nextInt();
		Colab emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este ID nao existe!");
		} else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = leia.nextDouble();
			emp.increaseSalario(porcentagem);
		}

		// PART 3 - LISTA DE FUNCIONARIOS:

		System.out.println();
		System.out.println("Lista de funcionarios:");
		for (Colab obj : list) {
			System.out.println(obj);
		}

		leia.close();

	}

}
