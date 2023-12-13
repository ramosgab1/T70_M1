package estruturaDados_13122023;

import java.util.Scanner;
import java.util.Stack;

public class ED_List02_Atv2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da
		 * Classe String, para organizar a retirada de livros em uma pilha. O programa
		 * deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar um novo
		 * livro na pilha. Deve solicitar o nome do livro. 2: Listar todos os livros da
		 * Pilha 3: Retirar um livro da pilha 0: O programa deve ser finalizado. Caso a
		 * pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá
		 * informar que a pilha está vazia.
		 */

		// Inicializando o Scanner, a Stack e Variáveis.
		int opcoes=0;
		String nomeLivros;
		Scanner leia = new Scanner(System.in); 
		Stack<String> pilhaLivros = new Stack<String>();
		
		// 1° PASSO: CRIAR MENU.
		do { 
		System.out.println("------------------ OPÇÕES ------------------");
		System.out.println("-- 1: Adicionar um novo livro na pilha" + 
						   "\n-- 2: Listar todos os livros da pilha." +
				           "\n-- 3: Retirar uma livro da pilha." + 
						   "\n-- 0: Sair.");
		System.out.println("--------------------------------------------");
		System.out.println("Digite a opção desejada: ");
		opcoes = leia.nextInt(); 
		
		switch (opcoes) {
		case 1: 
			System.out.println("VOCÊ ESCOLHEU: Adicionar um novo livro na pilha.");
			System.out.println("INFORME O NOME DO LIVRO: ");
			leia.nextLine();
			nomeLivros = leia.nextLine();
			pilhaLivros.add(nomeLivros);
			System.out.println("O livro " + nomeLivros + " foi adicionado!");
			break;
		case 2: 
			if (pilhaLivros.isEmpty()) { 
						System.out.println("VOCÊ ESCOLHEU: Ver a pilha de livros.");
						System.out.println("Não há livros na pilha!");
			} else {
				 		System.out.println("Os livros " + pilhaLivros + " estão na pilha.");
			}
		break; 
		case 3:
						System.out.println("VOCÊ ESCOLHEU: Retirar um livro da pilha.");
						System.out.println("\nRetirar livro: " + pilhaLivros.pop());
		break;
		}
		} while (opcoes !=0);
		
		if (opcoes == 0) {
			System.out.println("Programa Finalizado! Tchauzinho!");
		}
	}

}

