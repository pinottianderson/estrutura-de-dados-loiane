package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

public class Exec02 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("A");
		lista.adiciona("C");
		
		System.out.println(lista.ultimoIndice("d"));
		

	}

}
