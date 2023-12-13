package variaveisOperadores_06122023;

import java.util.Scanner;

public class VO_Atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inicializa o Scanner (aceita input do teclado).
		Scanner valor = new Scanner(System.in); 
		
		//Inicia e nomeia as variáveis.  
		float salario;
		float abono; 
		float novoSalario; 
		
		//Instrução1: input do salário + imprime valor do salário.  
		System.out.printf("Entre com o valor do salário: ");
		salario = valor.nextFloat();
		System.out.printf("O valor do salário é de: %.2f", salario);
		
		//Instrução2: input do abono + imprime valor do abono. 
		System.out.printf("\nDigite o abono: ");
		abono = valor.nextFloat(); 
		System.out.printf("\nO valor do abono é de: %.2f", abono);
		
		//Instrução3: imprime novoSalário. 
		novoSalario = salario+abono;
		System.out.printf("\nO novo salário é de: %.2f", novoSalario);
		
		//Para ter precisão nas casas decimais usamos %.2f e por isso é
		//necessário usar printf ao invés de println, ou apenas teriamos 
		//uma casa decimal. Ao usar printf usamos, e não +. 
	}

}
