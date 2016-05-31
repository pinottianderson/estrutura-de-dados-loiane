package com.loiane.estruturadados.pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
	
	public Pilha(){
		super();
	}
	
	public Pilha(int capacidade){
		super(capacidade);
	}
	
	public void empilha(T elemento){
		super.adiciona(elemento);		
	}
	
	public T topo(){
		if (this.estaVazia()){
			return null;
		}else{
			return this.elementos[this.tamanho-1];
		}
	}
	
	public T desempilha(){
		if (this.estaVazia()){
			return null;
		}else{
			T elemento = this.elementos[this.tamanho-1];
			this.tamanho--;
			
			return elemento;
		}
	}
	

}
