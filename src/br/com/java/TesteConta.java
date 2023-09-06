package br.com.java;

public class TesteConta {
	
	public static void main(String[] args) {
		Conta contaCorrente	= new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 32000.18;
		contaCorrente.cliente.nome = "Joao Felipe";
		contaCorrente.cliente.idade = 34;
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 16800.74;
		contaCorrente.cliente.nome = "Joao Felipe";
		contaCorrente.cliente.idade = 34;
				
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 625000.92;
		contaCorrente.cliente.nome = "Joao Felipe";
		contaCorrente.cliente.idade = 34;
		
		System.out.println("Nome:" + contaCorrente.cliente.nome);
		System.out.println("Idade:" + contaCorrente.cliente.idade);
		System.out.println("Conta:" + contaCorrente.numero);
		System.out.println("Saldo:" + contaCorrente.saldo);
		
	}

}
