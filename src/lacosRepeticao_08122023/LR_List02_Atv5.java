package lacosRepeticao_08122023;

import java.util.Scanner;

public class LR_List02_Atv5 {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia números inteiros via teclado, até 
		//que o número zero seja digitado. Ao final, mostre na tela a soma de todos 
		//os números digitados, que sejam positivos.

		//Inicializa o scanner. 
		Scanner leia = new Scanner(System.in); 
		int n, p=0;
		
		do {
			System.out.println("Insira um número diferente de 0: ");
			n = leia.nextInt();
			
			if (n>0) {
				p = p + n;
			}
			  
		} while (n!=0);
		System.out.println("A soma dos números digitados positivos é: " + p);
	} 

}
