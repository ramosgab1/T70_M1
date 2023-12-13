package lacosRepeticao_08122023;

import java.util.Scanner;

public class LR_List01_Atv2 {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
		// mostre
		// na tela quantos números são pares e quantos número são ímpares.

		// Inicializa o scanner e variáveis.
		Scanner leia = new Scanner(System.in);
		int num, p = 0, im = 0;

		// Instrução ao usuário.
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° número. ");
			num = leia.nextInt();
			System.out.println("O " + i + "° número é: " + num);

			if (num % 2 == 0) {
				p = p + 1;
			} else {
				im = im + 1;
			
			//p e im são variáveis auxiliares que guardam os números.
			}
		}
		System.out.println("Total de números pares: " + p);
		System.out.println("Total de números ímpares: " + im);
	}

}
