package br.com.sls.monitoria.servico;

import javax.swing.JOptionPane;

import br.com.sls.monitoria.modelo.Pessoa;
import br.com.sls.monitoria.modelo.Produto;

public class RealizaOperacaoCartaoCreditoServico {

	private final static Integer MODALIDADE_CREDITO = 1;
	private final static Integer MODALIDADE_DEBITO = 2;

	public void realizarCompra(Pessoa pessoa, Produto produto) {
		int respostaModalidadePagamento = getModalidadePagamento();
		if (respostaModalidadePagamento == MODALIDADE_CREDITO) {
			realizarCompraCredito(produto, pessoa);
		} else if (respostaModalidadePagamento == MODALIDADE_DEBITO) {
			realizarCompraDebito(produto, pessoa);
		} else {
			JOptionPane.showMessageDialog(null, "Modalidade de Pagamento Inválida");
		}
	}

	private void realizarCompraCredito(Produto produto, Pessoa pessoa) {
		String senhaDigitada = getsenhaCliente();
		if (senhaValida(pessoa, senhaDigitada)) {
			if (produto.getPreco() <= pessoa.getCartaoDeCredito().getSaldoCredito()) {
				pessoa.getCartaoDeCredito()
						.atualizarSaldoCredito(pessoa.getCartaoDeCredito().getSaldoCredito() - produto.getPreco());
				JOptionPane.showMessageDialog(null,
						"Compra do " + produto.getDescricao() + " foi realizada com sucesso \n Saldo Crédito Atual: "
								+ pessoa.getCartaoDeCredito().getSaldoCredito());
			} else {
				JOptionPane.showMessageDialog(null,
						"Você não possui saldo na funcao crédito para comprar o " + produto.getDescricao());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Senha inválida");
		}
	}

	private void realizarCompraDebito(Produto produto, Pessoa pessoa) {
		String senhaDigitada = getsenhaCliente();
		if (senhaValida(pessoa, senhaDigitada)) {
			if (produto.getPreco() <= pessoa.getCartaoDeCredito().getSaldoDebito()) {
				pessoa.getCartaoDeCredito()
						.atualizarSaldoDebito(pessoa.getCartaoDeCredito().getSaldoDebito() - produto.getPreco());
				JOptionPane.showMessageDialog(null,
						"Compra do " + produto.getDescricao() + " foi realizada com sucesso \n Saldo Débito Atual: "
								+ pessoa.getCartaoDeCredito().getSaldoDebito());
			} else {
				JOptionPane.showMessageDialog(null,
						"Você não possui saldo na funcao débito para comprar o " + produto.getDescricao());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Senha inválida");
		}
	}

	private boolean senhaValida(Pessoa pessoa, String senha) {
		return senha.equals(pessoa.getCartaoDeCredito().getSenha());
	}

	private String getsenhaCliente() {
		return JOptionPane.showInputDialog("Digite sua senha");
	}

	private int getModalidadePagamento() {
		return Integer.parseInt(JOptionPane.showInputDialog(" 1 - Funcao Crédito \n 2 - Funcao Débito"));
	}

}
