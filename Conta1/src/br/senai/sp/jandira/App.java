package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		Conta contaDaAna = new Conta();
		Conta contaDaMaria = new Conta();
		Conta contaDoJoao;
		contaDoJoao = new Conta();
		
		contaDaAna.titular = "Ana Gomes";
		contaDaAna.numero = "001-98";
		contaDaAna.tipo = "Corrente"; 
		contaDaAna.ativa = true;
		contaDaAna.chequeEspecial = 200;
		contaDaAna.depositar(500);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(700);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.getSaldo();
		
		// Determinar os dados da conta da Maria

		contaDaMaria.numero = "100-85";
		contaDaMaria.titular = "Maria Da Silva";
		contaDaMaria.tipo = "Corrente";
		contaDaMaria.ativa = true;
		contaDaMaria.depositar(600);

		// Determinar os dados da conta do Joao

		contaDoJoao.numero = "200-96";
		contaDoJoao.titular = "Jo�o Almeida";
		contaDoJoao.tipo = "Poupan�a";
		contaDoJoao.ativa = true;
		contaDoJoao.depositar(200);

		// Ver o saldo das contas com o nome
		System.out.println("Titular: " + contaDaMaria.titular);
		contaDaMaria.mostrarSaldoDaConta();
		System.out.println("----------------------------");
		System.out.println("Titular: " + contaDoJoao.titular);
		contaDoJoao.mostrarSaldoDaConta();
		System.out.println("----------------------------");

		// Colocar 100 reais na conta da Maria

		contaDaMaria.depositar(-20);
		contaDaMaria.mostrarSaldoDaConta();
		
		int a = somar(10, 12);
	}
	
	public static int somar(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		return resultado;
	}
}
