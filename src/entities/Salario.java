package entities;

public class Salario {
	
	public String nome;
	public double bruto;
	public double imposto;
	
	public double novoSalario() {
		return bruto - imposto;
		}
		public void increaseSalary(double porcentagem) {
		bruto += bruto * porcentagem / 100.0;
		}
		public String toString() {
		return nome + ", R$ " + String.format("%.3f", novoSalario());

	
	
}
}
