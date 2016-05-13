package com.loiane.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.teste.Contato;

public class Exec07 {

	public static void main(String[] args) {
		ArrayList<Contato> lista = new ArrayList<Contato>();
		Contato contato;
				
		for(int i=0; i<20; i++){
			contato = new Contato("Contato "+i);
			lista.add(contato);
		}	
		System.out.println(lista);
		lista.add(0, new Contato("Anderson"));
		System.out.println(lista);
		System.out.println(lista.get(1));
		lista.remove(0);
		System.out.println(lista);
		System.out.println(lista.size());
	}

}
