package com.vinicius.musica;

public class Ipod implements ReprodutorMusica{

	@Override
	public void tocar() {
		System.out.println("tocando música");
		
	}

	@Override
	public void pausar() {
		System.out.println("pausando música");
	}

	@Override
	public void passarMusica() {
		System.out.println("pŕoxima música");
	}

}
