package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		Conta contaDaMaria = new Conta();
		Conta contaDoJoao;
		contaDoJoao = new Conta();

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
	}
}
