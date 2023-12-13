package lacosCondicionais_07122023;

import java.util.Scanner;

public class LC_List01_Atv1 {

	public static void main(String[] args) {
		//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na 
		//tela se a soma de A + B é maior, menor ou igual a C.
		
		//Inicializa o scanner. 
		Scanner leia = new Scanner(System.in);
		
		//Inicializa as variáveis. 
		int A, B, C, soma; 
		
		//Input de informações + comando ao usuário. 
		System.out.println("Insira o primeiro valor 'A':" );
		A = leia.nextInt(); 
		System.out.println("Insira o segundo valor 'B':" );
		B = leia.nextInt();
		System.out.println("Insira o terceiro valor 'C':" );
		C = leia.nextInt();
		soma = A+B; 
		
		//Comparação comando if.
		if(soma > C) { 
			System.out.println("A soma do valores 'A' e 'B' é maior que o valor 'C'.");
		}else if (soma < C) { 
			System.out.println("A soma dos valores 'A' e 'B' é menor que o valor 'C'.");
		}else if (soma == C){ 
			System.out.println("A soma dos valores 'A' e 'B' é igual ao valor 'C'.");
		}

	}

}
