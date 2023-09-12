package br.com.java;

public class TesteConta {
	
	public static void main(String[] args) {
		Main contaCorrente	= new Main();
		Main contaPoupanca = new Main();
		Main contaInvestimento = new Main();
		
		contaCorrente.setNumero(11);
		contaCorrente.setNome("Joao Felipe CC");
		contaCorrente.setIdade(34);
		contaCorrente.setAgencia(1111);
		contaCorrente.depositar(250);
		
		contaPoupanca.setNumero(22);
		contaPoupanca.setNome("Joao Felipe CP");
		contaPoupanca.setIdade(34);
		contaPoupanca.setAgencia(1221);
		contaPoupanca.depositar(500);
		
		contaInvestimento.setNumero(33);
		contaInvestimento.setNome("Joao Felipe CI");
		contaInvestimento.setIdade(34);
		contaInvestimento.setAgencia(1331);
		contaInvestimento.depositar(800);
		
		System.out.println("Nome: " + contaCorrente.getNome());
		System.out.println("Idade: " + contaCorrente.getIdade());
		System.out.println("Conta: " + contaCorrente.getNumero());
		System.out.println("Saldo: " + contaCorrente.getSaldo());
		
	}

}
