package variaveisOperadores_06122023;

import java.util.Scanner;

public class VO_Atv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inicializa o scanner. 
		Scanner valor = new Scanner(System.in); 
		
		//Inicializa as variáveis. 
		float n1, n2, n3, n4, diferenca;
		
		//Input do teclado - Instruções ao usuário. 
		
		//n1
		System.out.printf("Insira um valor: ");
		n1 = valor.nextFloat(); 
		System.out.printf("Seu primeiro valor é: %.1f", n1);
		
		//n2
		System.out.printf("\nInsira um valor: ");
		n2 = valor.nextFloat(); 
		System.out.printf("Seu primeiro valor é: %.1f", n2);
		
		//n3
		System.out.printf("\nInsira um valor: ");
		n3 = valor.nextFloat(); 
		System.out.printf("Seu primeiro valor é: %.1f", n3);
		
		//n4 
		System.out.printf("\nInsira um valor: ");
		n4 = valor.nextFloat(); 
		System.out.printf("Seu primeiro valor é: %.1f", n4);
		
		//Cálculo da diferença. 
		diferenca = (n1*n2)-(n3*n4); 
		System.out.printf("\nA diferença dos produtos de 1 e 2 pelos de 3 e 4 é: %.1f", diferenca);
	}

}
