package br.com.sls.monitoria.modelo;

public abstract class SmartDevice {
	
	protected String nome;
	
	protected String marca;
	
	protected String identificacao;
	
	public abstract String exibeSistemaOperacional();
	
	public final String exibeFormadeRecarga(){
		return "Carregamento USB";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	
	

}
