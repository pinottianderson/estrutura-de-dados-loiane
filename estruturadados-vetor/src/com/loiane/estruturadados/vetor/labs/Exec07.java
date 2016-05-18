package com.loiane.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.loiane.estruturadados.vetor.teste.Contato;

public class Exec07 extends Exec06Loiane {

	public static void main(String[] args) {

		//Criação das variáveis
		Scanner scan = new Scanner(System.in);

		//Criar vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList<Contato>(20);

		//Criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);

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
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;
			default:
				break;
			}

		}
		System.out.println("Usuário digitou 0, programa terminou.");
	}

	protected static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista){
		System.out.println("Criando um contato - entre com as informações:");
		String nome = leInformacao("Entre com o nome:", scan);

		Contato contato = new Contato(nome);
		lista.add(contato);
		System.out.println("Contato Adicionado com Sucesso!");
		System.out.println(contato);
	}

	protected static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista){
		System.out.println("Criando um contato - entre com as informações:");
		String nome = leInformacao("Entre com o nome:", scan);

		Contato contato = new Contato(nome);

		int pos = leInformacaoInt("Entre com a posição desejada:", scan);

		try {
			lista.add(pos, contato);
			System.out.println("Contato Adicionado com Sucesso!");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida. Não adicionado!");
		}
	}

	protected static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição:", scan);

		try {

			Contato contato = lista.get(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}		
	}

	protected static void obtemContato(Scanner scan, ArrayList<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição:", scan);

		try {

			Contato contato = lista.get(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado.");
			pos = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição "+ pos);

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}

	protected static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição:", scan);

		try {

			Contato contato = lista.get(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado.");
			pos = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição "+ pos);

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}

	protected static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição:", scan);

		try {

			Contato contato = lista.get(pos);

			boolean existe =  lista.contains(contato);

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
	protected static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição a ser removida:", scan);

		try {

			lista.remove(pos);
			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}

	protected static void excluirPorContato(Scanner scan, ArrayList<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição a ser removida:", scan);

		try {

			Contato contato = lista.get(pos);

			lista.remove(contato);
			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida.");
		}
	}	

	protected static void imprimeTamanhoVetor(ArrayList<Contato> lista){
		System.out.println("Tamanho do vetor é de: "+lista.size());
	}

	protected static void limparVetor(ArrayList<Contato> lista){

		lista.clear();

		System.out.println("Todos os contatos do vetor foram excluídos.");
	}

	protected static void imprimirVetor(ArrayList<Contato> lista){

		System.out.println(lista);
	}



	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista){

		Contato contato;

		for(int i=1; i<=quantidade; i++){
			contato = new Contato();
			contato.setNome("Contato "+i);

			lista.add(contato);
		}

	}

}
