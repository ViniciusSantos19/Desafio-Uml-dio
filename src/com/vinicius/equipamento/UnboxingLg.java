package com.vinicius.equipamento;

public class UnboxingLg implements AparelhoTelefone{

	@Override
	public void ligar() {
		System.out.println("ligando...");
		
	}

	@Override
	public void atender() {
		System.out.println("atendendo...");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("iniciando correio de voz");
	}

}
