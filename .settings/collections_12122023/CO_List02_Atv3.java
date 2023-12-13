package collections_12122023;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CO_List02_Atv3 {

	public static void main(String[] args) {
		// Inicialização scanner. 
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o 1° valor: ");
		Integer numeros1 = leia.nextInt();
		
		// Criação set. 
		Set <Integer> setNumeros = new HashSet<Integer>(); 
		
		// Loop "for" para input. 
		
		setNumeros.add(numeros1);
		for(int contador = 2; contador < 11; contador++ ) {
			System.out.println("Sem repetir, digite o " + contador + "° valor: ");
			numeros1=leia.nextInt();
			setNumeros.add(numeros1);
			}
		// Listar dados do set. 
		System.out.println("Os números do set são: " + setNumeros);
		
		// Com iterator.
		System.out.println("******************* SAIDA DE DADOS COM ITERADOR ******************* ");
		Iterator <Integer> isetNumeros = setNumeros.iterator();
		
		while(isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
	}

}
