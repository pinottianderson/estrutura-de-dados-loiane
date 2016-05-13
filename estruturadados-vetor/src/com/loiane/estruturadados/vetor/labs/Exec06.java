package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exec06 {

	public static void main(String[] args) {
		Lista<Contato> lista = new Lista<Contato>(20);
		Contato contato;
				
		for(int i=0; i<20; i++){
			contato = new Contato("Contato "+i);
			lista.adiciona(contato);
		}
		System.out.println(lista);
		lista.adiciona(0, contato = new Contato("Anderson"));
		System.out.println(lista);
		System.out.println(lista.busca(contato));
		System.out.println(lista.contem(contato));
		System.out.println(lista.obtem(0));
		System.out.println(lista.ultimoIndice(contato));
		System.out.println(lista.tamanho());
		lista.remove(0);
		System.out.println(lista);
		
		

	}

}
