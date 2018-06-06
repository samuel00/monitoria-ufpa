package br.com.sls.monitoria.exercicio;

public class Circulo {
	
	protected int raio;

	public void calcularArea() {
		System.out.println("Área do Circulo: " + (2 * Math.PI * raio));
	}

	public void calcularVolume() {
		System.out.println("Comprimento do Circulo: " + (Math.PI * raio*raio));
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	
}
