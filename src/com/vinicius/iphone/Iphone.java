package com.vinicius.iphone;

import com.vinicius.equipamento.AparelhoTelefone;
import com.vinicius.internet.NavegadorInternet;
import com.vinicius.musica.ReprodutorMusica;

public class Iphone {
	private ReprodutorMusica reprodutorDeMusica;
	private NavegadorInternet navegador;
	private AparelhoTelefone aparelhoTelefone;
	
	public Iphone(ReprodutorMusica reprodutorDeMusica, NavegadorInternet navegador, AparelhoTelefone aparelhoTelefone) {
		super();
		this.reprodutorDeMusica = reprodutorDeMusica;
		this.navegador = navegador;
		this.aparelhoTelefone = aparelhoTelefone;
	}

	public void ligar() {
		this.aparelhoTelefone.ligar();
	}
	
	public void atender() {
		this.aparelhoTelefone.atender();
	}
	
	public void iniciarCorreioDeVoz() {
		this.aparelhoTelefone.iniciarCorreioDeVoz();
	}
	
	public void tocar() {
		this.reprodutorDeMusica.tocar();
	}
	
	public void pausar() {
		this.reprodutorDeMusica.pausar();
	}
	
	public void passarMusica() {
		this.reprodutorDeMusica.passarMusica();
	}
	
	public void pagina() {
		this.navegador.pagina();
	}
	
	public void adicionarNovaPagina() {
		this.navegador.adicionarNovaPagina();
	}
	
	public void atualizarPagina() {
		this.navegador.atualizarPagina();
	}
	
	
}
