package br.com.sls.monitoria.principal;

import br.com.sls.monitoria.modelo.SmartDevice;
import br.com.sls.monitoria.modelo.SmartGlass;
import br.com.sls.monitoria.modelo.SmartPhone;
import br.com.sls.monitoria.modelo.SmartWatch;

public class TestaHeranca {

	public static void main(String[] args) {
		SmartDevice smartPhone = new SmartPhone();
		smartPhone.setNome("Samsung S7");

		SmartDevice smartGlass = new SmartGlass();
		smartGlass.setNome("Recon Jet");

		SmartDevice smartWatch = new SmartWatch();
		smartWatch.setNome("Amzifit 2");

		System.out.println("Nome do dispositivo: " + smartPhone.getNome() + " - Forma de carregamento :"
				+ smartPhone.exibeFormadeRecarga() + " - Sistema Operaciona" + smartPhone.exibeSistemaOperacional());

		System.out.println("Nome do dispositivo: " + smartGlass.getNome() + " - Forma de carregamento :"
				+ smartGlass.exibeFormadeRecarga() + " - Sistema Operaciona" + smartGlass.exibeSistemaOperacional());

		System.out.println("Nome do dispositivo: " + smartWatch.getNome() + " - Forma de carregamento :"
				+ smartWatch.exibeFormadeRecarga() + " - Sistema Operaciona" + smartWatch.exibeSistemaOperacional());
	}

}
