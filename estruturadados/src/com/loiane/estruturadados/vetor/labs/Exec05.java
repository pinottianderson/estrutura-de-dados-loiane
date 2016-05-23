package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exec05 {

	public static void main(String[] args) {
		Lista<Contato> lista = new Lista<Contato>(20);
		Contato contato;
				
		for(int i=0; i<20; i++){
			contato = new Contato("Contato "+i);
			lista.adiciona(contato);
		}
		System.out.println(lista);
		lista.limpa();
		System.out.println(lista);

	}

}
