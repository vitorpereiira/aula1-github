package entities;

public class Banco {

	private String nome;
	private int conta;
	private double saldo;

	public Banco(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}

	public Banco(String nome, int conta, double depositoInicial) {
		this.nome = nome;
		this.conta = conta;
		deposito(depositoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double montante) {
		saldo += montante;
	}

	public void saque(double montante) {
		saldo -= montante + 5.0;
	}
	
	public String toString() {
		return "Conta: "
				+ conta
				+ ", Nome: "
				+ nome
				+ ", Saldo: R$ "
				+ String.format("%.2f", saldo);
	}

}
