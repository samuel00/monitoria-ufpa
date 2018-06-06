package br.com.sls.monitoria.modelo;

public class CartaoRefeicao {
	
	private String numeracao;
	
	private String nome;
	
	private String senha;
	
	private double saldo;
	
	public CartaoRefeicao() {
		this.numeracao = "123456";
		this.nome = "CARD RV";
		this.senha = "cbsi2018";
		this.saldo = 1000;
	}

	public String getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
