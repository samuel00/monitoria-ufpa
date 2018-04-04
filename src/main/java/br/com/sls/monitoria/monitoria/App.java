package br.com.sls.monitoria.monitoria;

import javax.swing.JOptionPane;

import br.com.sls.monitoria.modelo.CartaoDeCredito;
import br.com.sls.monitoria.modelo.Pessoa;
import br.com.sls.monitoria.modelo.Produto;

public class App {
	public static void main(String[] args) {
		Produto livro = new Produto(1, "Livro de Java", 2000.00);
		
		CartaoDeCredito cartaoDeCredito = new CartaoDeCredito("Ourocard", "Visa");
		
		Pessoa pessoa = new Pessoa("Paula", "00022233345", cartaoDeCredito);
		
		int respostaTipoCompra = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Funcao Crédito \n 2 - Funcao Débito"));
		String senha = JOptionPane.showInputDialog("Digite sua senha");
		String mensagem = "";
		
		if (respostaTipoCompra == 1){
			mensagem = pessoa.getCartaoDeCredito().realizarCompraCredito(livro, senha);
		}else{
			mensagem = pessoa.getCartaoDeCredito().realizarCompraDebito(livro, senha);
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
