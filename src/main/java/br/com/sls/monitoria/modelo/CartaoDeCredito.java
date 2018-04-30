package br.com.sls.monitoria.modelo;

public class CartaoDeCredito {

	private String descricao;

	private String bandeira;

	private double saldoCredito;

	private Double saldoDebito;

	private String senha;

	public CartaoDeCredito(String descricao, String bandeira) {
		this.descricao = descricao;
		this.bandeira = bandeira;
		this.saldoCredito = 1000.00;
		this.saldoDebito = 500.000;
		this.senha = "cbsi";
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public double getSaldoCredito() {
		return saldoCredito;
	}

	public Double getSaldoDebito() {
		return saldoDebito;
	}	

	public String getSenha() {
		return senha;
	}

	public String realizarCompraCredito(Produto produto, String senha) {
		if (senha.equals(this.senha)) {
			if (produto.getPreco() <= this.saldoCredito) {
				this.saldoCredito = this.saldoCredito - produto.getPreco();
				return "Compra do " + produto.getDescricao() + " foi realizada com sucesso \n Saldo Crédito Atual: " + this.getSaldoCredito();
			} else {
				return "Você não possui saldo na funcao crédito para comprar o " + produto.getDescricao();
			}
		} else {
			return "Senha inválida";
		}
	}

	public void atualizarSaldoCredito(Double valor) {
		this.saldoCredito = valor;
	}

	public void atualizarSaldoDebito(Double valor) {
		this.saldoDebito = valor;
	}

}
