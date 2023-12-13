package lacosCondicionais_07122023;

import java.util.Scanner;

public class LC_List02_Atv5 {

	public static void main(String[] args) {
		//Inicializa o scanner e inicializa as variáveis. 
		Scanner leia = new Scanner(System.in);
		int opcao, quantidade;
		float preco, valorTotal;
		String produto;
		preco = 0; 
		
		//Criação do Menu. 
		System.out.println("------------------ MENU ------------------ ");
		System.out.println("-- 1: Cachorro Quente.");
		System.out.println("-- 2: X-Salada.");
		System.out.println("-- 3: X-Bacon.");
		System.out.println("-- 4: Bauru.");
		System.out.println("-- 5: Refrigerante.");
		System.out.println("-- 6: Suco de laranja.");
		opcao=leia.nextInt();
		
		switch (opcao) {
		case 1: 
			System.out.println("OPÇÃO: Cachorro Quente.");
		produto = "Cachorro Quente";
		preco = 10; 
		break;
		case 2:
			System.out.println("OPÇÃO: X-Salada.");
		produto = "X-Salada";
		preco = 15; 
		break;
		case 3:
			System.out.println("OPÇÃO: X-Bacon.");
		produto = "X-Bacon";
		preco = 18; 
		break;
		case 4: 
			System.out.println("OPÇÃO: Bauru.");
		produto = "Bauru";
		preco = 12; 
		break;
		case 5:
			System.out.println("OPÇÃO: Refrigerante.");
		produto = "Refrigerante";
		preco = 8; 
		break;
		case 6:
			System.out.println("OPÇÃO: Suco de Laranja.");
		produto = "Suco de Laranja";
		preco = 13; 
		break;
		default:
			System.out.println("Opção inválida.");
		}
		System.out.println("Quantos do item estão sendo comprados? ");
		quantidade = leia.nextInt();
		valorTotal=preco*quantidade;
		{
			System.out.println("O valor total é: " + valorTotal); 
		}
		
	}

}
