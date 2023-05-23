package Exercicios;

public class ContaBancaria {
	private int numero;
	private double saldo;
	private String titular;
	
	public double deposito(double saldo,double valor) {
		this.saldo = saldo + valor;
		return saldo;
	}
	public double saque(double saldo,double valor) {
		this.saldo = saldo - valor;
		return saldo;
	}
	public void consulta() {
		System.out.println(this.saldo);
	}
}
