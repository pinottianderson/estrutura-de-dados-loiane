package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	private T[] elementos; 
	private int tamanho;

	//Solução mais elegante que a debaixo
	public Lista(int capacidade){
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse){
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	// 0 1 2 3 4 5 6 = tamanho é 5
	// B C E F G + +
	//
	public boolean adiciona(int posicao, T elemento){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		this.aumentaCapacidade();
		//mover todos os elementos
		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[])new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//Exercício 04
	public Object obtem(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		} 
		return this.elementos[posicao];
	}
	
	public int busca(T elemento){
		for (int i=0; i<this.tamanho; i++){
			if (this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	/* Esta opção não é ideal, pois ela é uma cópia do método busca.
	 * Com isso, caso seja necessário alguma manutenção neste código,
	 * deverá ser feita nos dois métodos, neste e no método busca.
	 * O mais indicado são os métodos abaixo, feitos pela Loiane. 
	 */
	public boolean contem(T elemento){
		for (int i=0; i<this.tamanho; i++){
			if (this.elementos[i].equals(elemento)){
				return true;
			}
		}
		return false;
	}
	
	public boolean contemLoiane(T elemento){
		return busca(elemento)> -1;
	}
	
	public boolean contemLoiane2(T elemento){
		int pos = busca(elemento);
		if(pos > -1){
			return true;
		}else{
			return false;
		}
	}
	
	/* Lembrando que é decrescente, pois busca o último índice.
	 * Ficou exatamente igual ao método feito pela Loiane. 
	*/
	public int ultimoIndice(T elemento){
		for(int i = this.tamanho-1; i>=0; i-- ){ 
			if(elemento.equals(this.elementos[i])){
				return i;
			}
		}		
		return -1;
	}
	
	// B D E F F -> posição a ser removida é 1 (G)
	// 0 1 2 3 4 -> tamanho é 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]
	// vetor[3] = vetor[4]
	public void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i=posicao; i<this.tamanho-1; i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	//Exercício 03
	public void remove(T elemento){
		int pos = busca(elemento);
		if(pos > -1){
			remove(pos);
		}
	}
	
	//Exercício 05
	public void limpa(){
		for(int i=0; i<this.elementos.length; i++){
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	public int tamanho(){
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}


}
