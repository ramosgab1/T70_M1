package vetorMatriz_11122023;

import java.util.Scanner;

public class VM_Lista02_Atv3 {public static void main(String[] args) {

	// Inicializa o scanner e a matriz.
	Scanner leia = new Scanner(System.in);
	int matrizInteiros[][] = new int[3][3];
	int somaDiagonalPrincipal, somaDiagonalSecundaria;
	
	// Leitura
	for(int linha=0; linha<matrizInteiros.length; linha++) {
		for (int coluna=0; coluna<matrizInteiros.length; coluna++) {
			System.out.println("Insira um valor para a posição [" + linha + "," + coluna + "]:");
			matrizInteiros[linha][coluna] = leia.nextInt();
		}
		}
	//Somas 
	
	somaDiagonalPrincipal = matrizInteiros[0][0] + matrizInteiros[1][1] + matrizInteiros[2][2];
	somaDiagonalSecundaria = matrizInteiros[0][2] + matrizInteiros[1][1] + matrizInteiros[2][0];
	
	// Output. 
	System.out.println("Diagonal principal é: " + matrizInteiros[0][0] + " " + matrizInteiros[1][1] + " " + matrizInteiros[2][2]);
	System.out.println("Diagonal secundária é: " + matrizInteiros[0][2] + " " + matrizInteiros[1][1] + " " + matrizInteiros[2][0]);
	System.out.println("A soma da diagonal principal é: " + somaDiagonalPrincipal);
	System.out.println("A soma da diagonal secundária é: " + somaDiagonalSecundaria);
	
	}
}

