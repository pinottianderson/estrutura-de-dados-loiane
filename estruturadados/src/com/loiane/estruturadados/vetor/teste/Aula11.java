package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<String> vetor = new Lista<String>(1);
		
		vetor.adiciona("Anderson");
		vetor.adiciona("Anderson");
		vetor.remove(0);
		System.out.println(vetor);
	}

}