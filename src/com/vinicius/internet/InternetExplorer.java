package com.vinicius.internet;

public class InternetExplorer implements NavegadorInternet{

	@Override
	public void pagina() {
		System.out.println("pagina aberta");
		
	}

	@Override
	public void adicionarNovaPagina() {
		System.out.println("abrindo nova página");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("atualizando página");
	}

}
