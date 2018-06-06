package br.com.sls.monitoria.modelo;

public class TestaOperacaoMatematica {
	
	public static void main(String[] args) {
		Subtracao subtracao = new Subtracao();
		realizarOperacao(subtracao);
	}
	
	public static void realizarOperacao(Subtracao subtracao){
		int a = 5;
		int b = 3;
		System.out.println(subtracao.calcular(a, b));
	}
	
	/*public static void realizarOperacao(IOperacaoMatematica operacaoMatematica){
	int a = 5;
	int b = 3;
	System.out.println(operacaoMatematica.calcular(a, b));
}*/

}
