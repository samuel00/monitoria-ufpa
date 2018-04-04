package br.com.sls.monitoria.modelo;

public class Produto {
	
	private Integer identificador;
	
	private String descricao;
	
	private Double preco;
	
	public Produto(Integer identificador, String descricao, Double preco) {
		this.identificador = identificador;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Integer getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	

}
