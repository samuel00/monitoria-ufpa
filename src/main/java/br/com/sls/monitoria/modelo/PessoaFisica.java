package br.com.sls.monitoria.modelo;

public class PessoaFisica {
	
	private String nome;
	
	private String cpf;
	
	private CartaoRefeicao cartaoRefeicao;
	
	public PessoaFisica(String nome, String cpf, CartaoRefeicao cartaoRefeicao) {
		this.nome = nome;
		this.cpf = cpf;
		this.cartaoRefeicao = cartaoRefeicao;
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

	public CartaoRefeicao getCartaoRefeicao() {
		return cartaoRefeicao;
	}

	public void setCartaoRefeicao(CartaoRefeicao cartaoRefeicao) {
		this.cartaoRefeicao = cartaoRefeicao;
	}
	
	

}
