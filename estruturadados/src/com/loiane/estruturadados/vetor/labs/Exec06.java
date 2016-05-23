package com.loiane.estruturadados.vetor.labs;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exec06 {

	public static void main(String[] args) {
		
		//Cria��o das vari�veis
		Scanner scan = new Scanner(System.in);
		
		//Criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<Contato>(20);
		
		//Criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);
				
		//1 - Criar um menu para que o usu�rio escolha as op��es
		
		
	}
	
	private static int obterOpcaoMenu(Scanner scan){
		
		boolean entradaValida = false;
		
		while (!entradaValida){
			System.out.println("Digite a op��o desejada:");
			System.out.println("0: Sair");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posi��o espec�fica");
			System.out.println("3: Busca contato de uma posi��o espec�fica");
			System.out.println("4: Busca contato");
			System.out.println("5: Consulta �ltimo �ndica do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Remove por posi��o");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contato do vetor");
			System.out.println("11: Imprime vetor");
			
			String entrada = scan.nextLine();
			int opcao = Integer.parseInt(entrada);
		}
		
		return 0;
	}
	
	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){

		Contato contato;
	
		for(int i=1; i<=quantidade; i++){
			contato = new Contato();
			contato.setNome("Contato "+i);
			
			lista.adiciona(contato);
		}
		
	}

}
