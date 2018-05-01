package br.com.sls.monitoria.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.sls.monitoria.modelo.CartaoRefeicao;
import br.com.sls.monitoria.modelo.Mercadoria;
import br.com.sls.monitoria.modelo.PessoaFisica;

public class TestaCriacaoDeObjetos {

	public static void main(String[] args) {
		// 01 Criar no pacote modelo uma classe chamada CartaoRefeicao
		// 02 Criar no pacote modelo uma classe chamada PessoaFisica que vai
		// utilizar o cartao
		// 03 Criar no pacote modelo uma classe chamada Mercadoria

		// Obs 01 A classe CartaoRefeicao Deve ter como atributos privados
		// numeracao, nome, senha, saldo
		// Obs 02 A classe CartaoRefeicao Deve ter como metodos publicos os
		// metodos para acessar os seus atributos

		// Obs 03 A classe PessoaFisica Deve ter como atributos privados nome,
		// cpf, cartaoRefeicao
		// Obs 04 A classe PessoaFisica Deve ter como metodos publicos os
		// metodos para acessar os seus atributos

		// Obs 05 A classe Mercadoria deve ter como atributos privados preco e
		// descricao
		// Obs 06 A classe Mercadoria Deve ter como metodos publicos os metodos
		// para acessar os seus atributos

		/*
		 * Tarefa 01 - Implementar um programa que possa realizar a compra de
		 * TRÊS mercadorias atraves do cartao refeicao de uma pessoa física. O
		 * processo de compra deve solicitar o numero do cartao, a senha do
		 * cartao, o valor da mercadoria e verificar se a pessoa possui saldo
		 * suficiente para realizar a compra, caso nao possua saldo o programa
		 * deve exibir uma mensagem informando saldo insuficiente.
		 * 
		 * No final do processo deve aparecer uma mensagem informando o nome e
		 * cpf da pessoa assim como o saldo atual do cartao.
		 */

		/** Comece aqui sua classe Principal */

		// Bloco que cadastra o cartao
		CartaoRefeicao cartaoRefeicao = new CartaoRefeicao();

		// Bloco que cadastra a pessoa
		PessoaFisica pessoaFisica = new PessoaFisica("Samuel Santana", "93277456514", cartaoRefeicao);

		// Variaveis controladoras
		boolean pararMercadoria = false;
		double totalDaCompra = 0;
		boolean senhaInvalida = true;
		List<Mercadoria> mercadorias = new ArrayList<Mercadoria>();

		// Bloco que cadastra as mercadorias
		while (!pararMercadoria) {
			Mercadoria mercadoria = new Mercadoria();

			String descricao = JOptionPane.showInputDialog("Informe o NOME da mercadoria");
			String preco = JOptionPane.showInputDialog("Informe o PRECO da mercadoria");
			if (descricao == null || preco == null) {
				pararMercadoria = true;
			} else {
				mercadoria.setDescricao(descricao);
				mercadoria.setPreco(Double.parseDouble(preco));
				mercadorias.add(mercadoria);
			}

		}

		// Bloco que realiza a compra
		while (senhaInvalida) {
			String senha = JOptionPane.showInputDialog("Digite a Senha");
			
			//IF que valida a senha
			if (senha.equals(pessoaFisica.getCartaoRefeicao().getSenha())) {
				senhaInvalida = false;
				
				//Calcula o total da compra
				for (Mercadoria mercadoria : mercadorias) {
					totalDaCompra += mercadoria.getPreco();
				}
				
				//IF que verifica se existe saldo suficiente para compra
				if (totalDaCompra <= pessoaFisica.getCartaoRefeicao().getSaldo()) {
					pessoaFisica.getCartaoRefeicao()
							.setSaldo(pessoaFisica.getCartaoRefeicao().getSaldo() - totalDaCompra);
					JOptionPane.showMessageDialog(null,
							"Compra realizada com sucesso!\nNome: " + pessoaFisica.getNome() + "\nCpf: "
									+ pessoaFisica.getCpf() + "\nSaldo Atual: R$"
									+ pessoaFisica.getCartaoRefeicao().getSaldo());
					
				} else {//Else do IF que verifica se existe saldo suficiente para compra
					JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
				}
				
			} else { //Else do IF que valida a senha
				JOptionPane.showMessageDialog(null, "Senha Inválida");
			}
		}

	}

}
