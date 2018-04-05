package br.com.sls.monitoria.principal;

import br.com.sls.monitoria.modelo.CartaoDeCredito;
import br.com.sls.monitoria.modelo.Pessoa;
import br.com.sls.monitoria.modelo.Produto;
import br.com.sls.monitoria.servico.RealizaOperacaoCartaoCreditoServico;

public class MainCartaoDeCredito {
	
	private static RealizaOperacaoCartaoCreditoServico servico = new RealizaOperacaoCartaoCreditoServico();
	
	public static void main(String[] args) {		
		
		Produto livro = new Produto(1, "Livro de Java", 50.00);		
		CartaoDeCredito cartaoDeCredito = new CartaoDeCredito("Ourocard", "Visa");		
		Pessoa pessoa = new Pessoa("Paula", "00022233345", cartaoDeCredito);
		
		
		servico.realizarCompra(pessoa, livro);
	}

}
