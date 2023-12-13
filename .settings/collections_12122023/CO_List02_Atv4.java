package collections_12122023;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CO_List02_Atv4 {

	public static void main(String[] args) {
		// Scanner
		Scanner leia = new Scanner(System.in);
		
		// Criação set.
		Set<Integer> setNumeros = new HashSet<Integer>();
		int numeros=0; 
		
		// Adicionar números ao set.
		setNumeros.add(1);
		setNumeros.add(2);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(5);
		setNumeros.add(6);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(9);
		setNumeros.add(10);
		
		//
		System.out.println("Digite o número que deseja encontrar: ");
		numeros = leia.nextInt(); 
		if (setNumeros.contains(numeros)) {
			System.out.println("O número " + numeros + " foi encontrado.");
		} else { 
			System.out.println("O número "+ numeros + " não foi encontrado.");
	
		}

	}

}
