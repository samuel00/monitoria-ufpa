package br.com.sls.monitoria.modelo;

public class Pessoa {
	
	private String nome;
	
	private String cpf;
	
	private CartaoDeCredito cartaoDeCredito;
	
	public Pessoa(String nome, String cpf, CartaoDeCredito cartaoDeCredito) {
		this.nome = nome;
		this.cpf = cpf;
		this.cartaoDeCredito = cartaoDeCredito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public CartaoDeCredito getCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}
	
	
}
