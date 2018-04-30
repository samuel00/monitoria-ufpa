package br.com.sls.monitoria.principal;

import javax.swing.JOptionPane;

import br.com.sls.monitoria.modelo.CartaoDeCredito;
import br.com.sls.monitoria.modelo.Pessoa;
import br.com.sls.monitoria.modelo.Produto;

public class PrimeiroMain {
	public static void main(String[] args) {
		// 1 PASSO - Declarando os objetos
		Produto livro = new Produto(1, "Livro de Java", 70.00);
		CartaoDeCredito cartaoDeCredito = new CartaoDeCredito("Ourocard", "Visa");
		Pessoa pessoa = new Pessoa("Paula", "00022233345", cartaoDeCredito);

		// Recuperando Modalidade de Pagamento
		int respostaTipoCompra = Integer
				.parseInt(JOptionPane.showInputDialog(" 1 - Funcao Crédito \n 2 - Funcao Débito"));

		// Recuperando Senha
		String senha = JOptionPane.showInputDialog("Digite sua senha");
		String mensagem = "";
		
		// 2 - PASSO - Verificar o comportamento dos objetos
		if (respostaTipoCompra == 1) {
			// Realizando compra no crédito
			mensagem = pessoa.getCartaoDeCredito().realizarCompraCredito(livro, senha);
		} else {
			// Realizando compra no débito

		}

		JOptionPane.showMessageDialog(null, mensagem);
	}
}
