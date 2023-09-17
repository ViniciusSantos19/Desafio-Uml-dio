package com.vinicius;

import com.vinicius.equipamento.UnboxingLg;
import com.vinicius.internet.InternetExplorer;
import com.vinicius.iphone.Iphone;
import com.vinicius.musica.Ipod;

public class Principal {
	public static void main(String[] args) {
		Iphone iphone = new Iphone(new Ipod(), new InternetExplorer(), new UnboxingLg());
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioDeVoz();
		iphone.pagina();
		iphone.adicionarNovaPagina();
		iphone.atualizarPagina();
		iphone.tocar();
		iphone.pausar();
		iphone.passarMusica();
	}
}
