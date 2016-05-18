package com.loiane.estruturadados.vetor.labs;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exec06Loiane {

	public static void main(String[] args) {

		//Criação das variáveis
		Scanner scan = new Scanner(System.in);

		//Criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<Contato>(20);

		//Criar e adicionar 30 contatos
		//criarContatosDinamicamente(5, lista);

		//Criar um menu para que o usuário escolha as opções
		int opcao = 1;

		while(opcao != 0){
			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				obtemContatoPosicao(scan, lista);
				break;
			case 4:
				obtemContato(scan, lista);
				break;
			case 5:
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6:
				pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirPorContato(scan, lista);
				break;
			case 9:

				break;
			case 10:

				break;
			case 11:

				break;
			default:
				break;
			}

		}
		System.out.println("Usuário digitou 0, programa terminou.");
	}
	
	private static int obterOpcaoMenu(Scanner scan){
		boolean entradaValida = false;
		int opcao = 0;
		String entrada;
		
		while (!entradaValida){
			System.out.println("Digite a opção desejada:");
			System.out.println("0: Sair");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Busca contato de uma posição específica");
			System.out.println("4: Busca contato");
			System.out.println("5: Consulta último índice do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Remove por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contato do vetor");
			System.out.println("11: Imprime vetor");
			
			try{
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao >= 0 && opcao <= 11){
					entradaValida = true;
				}else{
					throw new Exception();
				}
				
			} catch (Exception e){
				System.out.println("Entrada inválida, digite novamente.\n\n");
			}			
		}		
		return opcao;
	}
	
	private static int leInformacaoInt(String msg, Scanner scan){
		boolean entradaValida = false;
		int num = 0;
		
		while(!entradaValida){
			try {
				System.out.println(msg);
				String entrada = scan.nextLine();
				
				num = Integer.parseInt(entrada);
				
				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente.\n\n");
			}			
		}		
		return num;
	}
	
	private static String leInformacao(String msg, Scanner scan){
		System.out.println(msg);
		String entrada = scan.nextLine();
		
		return entrada;
	}
	
	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista){
		System.out.println("Criando um contato - entre com as informações:");
		String nome = leInformacao("Entre com o nome:", scan);

		Contato contato = new Contato(nome);
		lista.adiciona(contato);
		System.out.println("Contato Adicionado com Sucesso!");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista){
		System.out.println("Criando um contato - entre com as informações:");
		String nome = leInformacao("Entre com o nome:", scan);

		Contato contato = new Contato(nome);

		int pos = leInformacaoInt("Entre com a posição desejada:", scan);

		try {
			lista.adiciona(pos, contato);
			System.out.println("Contato Adicionado com Sucesso!");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida. Não adicionado!");
		}
	}
	
	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição:", scan);

		try {

			Contato contato = lista.obtem(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}		
	}
	
	private static void obtemContato(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição:", scan);

		try {

			Contato contato = lista.obtem(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado.");
			pos = lista.busca(contato);

			System.out.println("Contato encontrado na posição "+ pos);

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}
	
	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição:", scan);

		try {

			Contato contato = lista.obtem(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado.");
			pos = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posição "+ pos);

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}
	
	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição:", scan);

		try {

			Contato contato = lista.obtem(pos);

			boolean existe =  lista.contem(contato);
			
			if(existe){
				System.out.println("Contato existe, seguem dados:");
				System.out.println(contato);
			} else{
				System.out.println("Contato não existe");
			}
			
		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}
	
	//Melhorar método - fazer busca pela posição e caso seja o contato desejado, então exclui, do contrário volta ao menu
	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição a ser removida:", scan);

		try {

			lista.remove(pos);
			System.out.println("Contato excluído");
			
		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}
	
	private static void excluirPorContato(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição a ser removida:", scan);

		try {
			
			Contato contato = lista.obtem(pos);

			lista.remove(contato);
			System.out.println("Contato excluído");
			
		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
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
