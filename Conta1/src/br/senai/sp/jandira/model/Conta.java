package br.senai.sp.jandira.model;

public class Conta {
	public String tipo;
	private double saldo;
	public String numero;
	public String titular;
	public boolean ativa;
	public double chequeEspecial;
	
	public void depositar(double valorDeposito) {

		if (valorDeposito > 0) {
			
			saldo += valorDeposito;
			
		} else {
			System.out.println("Valor inv�lido");
		}
	}
	
	public void sacar(double valorDoSaque) {

		if ( (saldo + chequeEspecial) >= valorDoSaque) {
			
			saldo -= valorDoSaque;
			
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	public double getSaldo() {
		return saldo;
		
	}
	
	public void transferir() {

	}
	
	public void mostrarSaldoDaConta() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Saldo + limite: " + (saldo + chequeEspecial));
	}

}
