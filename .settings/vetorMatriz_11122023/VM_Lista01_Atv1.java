package vetorMatriz_11122023;

import java.util.Arrays;
import java.util.Scanner;

public class VM_Lista01_Atv1 {

	public static void main(String[] args) {

		// declaração de scanner, vetor, variável.
		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		int num, posicao;

		// entrada de dados.
		System.out.println("Digite um valor que deseja procurar: ");
		num = leia.nextInt();

		posicao = Arrays.binarySearch(vetorInteiros, num);
		if (posicao >= 0) {
			System.out.println("\nO elemento " + num + " foi encontrado e está na " 
														+ "posição: " + posicao);
		} else {
			System.out.println("\nO elemento " + num + " não foi encontrado!");
		}
	}
}
