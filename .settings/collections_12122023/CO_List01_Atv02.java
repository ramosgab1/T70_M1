package collections_12122023;

import java.util.ArrayList;
import java.util.Scanner;

public class CO_List01_Atv02 {

	public static void main(String[] args) {
		// Inicializa. 
		Scanner leia = new Scanner(System.in); 
		ArrayList<Integer> listNumeros = new ArrayList<Integer>();
		int numeros=0; 
		
		listNumeros.add(1);
		listNumeros.add(2);
		listNumeros.add(3);
		listNumeros.add(4);
		listNumeros.add(5);
		listNumeros.add(6);
		listNumeros.add(7);
		listNumeros.add(8);
		listNumeros.add(9);
		listNumeros.add(10);
		
		System.out.println("Digite o número que deseja encontrar: ");
		numeros = leia.nextInt(); 
		if (listNumeros.lastIndexOf(numeros) == -1) {
			System.out.println("O número " + numeros + " não foi encontrado.");
		} else { 
			System.out.println("O número "+ numeros + " está localizado na posição " + listNumeros.lastIndexOf(numeros) + ".");
	
		}

	}

}
