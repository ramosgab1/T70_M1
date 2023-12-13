package lacosCondicionais_07122023;

import java.util.Scanner;

public class LC_List01_Atv2 {

	public static void main(String[] args) {
		//Inicializa o scanner. 
		Scanner leia = new Scanner(System.in);
		
		//Inicializa as variáveis. 
		int num; 
		
		//Comando ao usuário. 
		System.out.println("Escolha um número inteiro: ");
		num = leia.nextInt();
		
		if(num %2 == 0 && num < 0 ) { 
			System.out.println("Esse número é par e negativo.");
		}else if (num %2 == 0 && num > 0) {
			System.out.println("Esse número é par e positivo.");
		}else if (num %2 != 0 && num < 0) {
			System.out.println("Esse número é ímpar e negativo.");
		}else if (num %2 != 0 && num > 0) { 
			System.out.println("Esse número é ímpar e positivo.");
		}

	}

}
