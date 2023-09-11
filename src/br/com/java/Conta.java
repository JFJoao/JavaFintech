package br.com.java;

/** 
 * Classe que abstrai uma conta Bancária. (sobrecarga de metodo, default + args)
 * @author João Felipe
 * @version 1.0
 */

public class Conta {
	
	Cliente cliente = new Cliente();
	/**
	 * Número da conta
	 */
	private int numero;
	/**
	 * Número da agência
	 */
	private int agencia;
	/**
	 * Saldo da Conta
	 */
	private double saldo;
	
	private String nome;
	
	private int idade;
	
	public Conta() {
		
	}
	
	public Conta(int numero, int agencia, double saldo, String nome, int idade) {
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setSaldo(saldo);
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Deposita um valor do Saldo da Conta
	 * @param valor que sera sacado da Conta
	 * @see retirar
	 */
	
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor que sera sacado da Conta
	 * @see depositar
	 */
	
	public void retirar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Define o nome do cliente
	 * @param nome
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Define a idade do cliente
	 * @param nome
	 */
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/**
	 * Exibe a idade do cliente
	 * @param nome
	 */
	
	public int getIdade() {
		return idade;
	}
	
	/**
	 * Exibe a idade do cliente
	 * @param nome
	 */
	
	public String getNome() {
		return nome;
}
}