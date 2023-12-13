package estruturaDados_13122023;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ED_List01_Atv1 {

	public static void main(String[] args) {
		/*
		 * PASSO 01: RODAR O MENU. O que preciso para criar o menu? a) Variável Opções.
		 * b) Leitura com Scanner para ler o input de opções.
		 */

		// Inicializar scanner (ler input) e variável para guardar opções (int opcoes).
		int opcoes=0;
		String nomeCliente;
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		// O que cada opção faz:
		// Do while pq o código deve ser executado ao menos 1x

		do {
			System.out.println("------------------ OPÇÕES ------------------ ");
			System.out.println("-- 1: Adicionar um novo cliente na fila." + "\n-- 2: Listar todos os clientes na fila."
					+ "\n-- 3: Retirar uma pessoa da fila." + "\n-- 0: Sair.");
			System.out.println("-------------------------------------------- ");
			System.out.println("Digite a opção desejada: ");
			opcoes = leia.nextInt();
			switch (opcoes) {

			// Pede o nome do cliente.
			case 1:
				System.out.println("VOCÊ ESCOLHEU: Adicionar um novo cliente na fila.");
				System.out.println("Os clientes na fila são: " + fila);
				System.out.println("INFORME O NOME DO CLIENTE: ");
				leia.nextLine();
				nomeCliente = leia.nextLine();
				fila.add(nomeCliente);
				System.out.println("Olá, " + nomeCliente + "! Seja bem-vindo.");
				break;
			case 2:
				System.out.println("\nVOCÊ ESCOLHEU: Listar todos os clientes na fila.");
				System.out.println("\nOs clientes na fila são: " + fila);
				break;
			case 3:
				System.out.println("\nVOCÊ ESCOLHEU: Chamar uma pessoa da fila: ");
				System.out.println("\nChamar: " + fila.poll());
				System.out.println("\nUm cliente foi chamado!");
			}
		} while (opcoes != 0);
		
		if (opcoes == 0) { 
			System.out.println("Programa Finalizado!");
		}

	}
}
