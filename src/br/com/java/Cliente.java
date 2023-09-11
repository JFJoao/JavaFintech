package br.com.java;

public class Cliente {
	
	private String nome;
	private int idade;
	
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
