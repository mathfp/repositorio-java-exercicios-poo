package br.udemy.ex5;

public class ContaBancaria {
	
	private int nroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int nroConta, String nomeTitular, double depositoInicial) {
		this.nroConta = nroConta;
		this.nomeTitular = nomeTitular;
		depositar(depositoInicial);
	}

	public ContaBancaria(int nroConta, String nomeTitular) {
		this.nroConta = nroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5;
	}
	
	public int getNroConta() {
		return nroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Account "+getNroConta() +", Holder: "+ getNomeTitular() +", Balance: $ "+ String.format("%.2f",getSaldo());
	}
}
