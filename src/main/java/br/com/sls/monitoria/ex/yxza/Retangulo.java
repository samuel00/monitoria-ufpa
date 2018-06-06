package br.com.sls.monitoria.ex.yxza;

public class Retangulo implements FormaGeometrica{
	
	protected int base;
	
	protected int altura;

	public void calcularArea() {
		System.out.println("Área do Retangulo: " + (base * altura));		
	}

	public void calcularComprimento() {
		System.out.println("Comprimento do Retangulo: " + (base + altura));		
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
