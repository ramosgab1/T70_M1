package collections_12122023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CO_List01_Atv1 {public static void main(String[] args) {
	// Inicializa o scanner, cria a string. 
	Scanner leia = new Scanner (System.in); 
	ArrayList<String> cores = new ArrayList<String>(); 
	
	// Inicialização de variável, input inicial de cor. 
	String cores2; 
	System.out.println("Digite a 1ª cor: ");
	cores2 = leia.nextLine();
	
	// Input do usuário (loop com for para input de +4 cores.
	cores.add(cores2);
	for (int contador = 2; contador<6; contador++ ) {
		System.out.println("Digite a " + contador + "ª cor: ");
		cores2=leia.nextLine();
		cores.add(cores2);
	}
	
	// Listar todas as cores: 
	System.out.println("As cores listadas são: " + cores);
	
	// Listar cores ordenadas. 
	Collections.sort(cores);
	System.out.println("Ordenar as cores: " + cores);
	
	// Teste: listar ordem reversa. 
	Collections.reverse(cores);
	System.out.println("Ordenar as cores reversas: " + cores);
}

}
