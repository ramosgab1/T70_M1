package variaveisOperadores_06122023;

import java.util.Scanner;

public class VO_Atv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inicializa o Scanner. 
		Scanner valor = new Scanner(System.in); 
		
		//Inicializa as variáveis.
		float nota1, nota2, nota3, nota4, mediaFinal; 
		
		//Input das informações. 
		
		//nota1
		System.out.printf("Entre com a primeira nota: ");
		nota1 = valor.nextFloat();
		System.out.printf("\nSua primeira nota é: %.2f", nota1);
		
		//nota2
		System.out.printf("\nEntre com a segunda nota: ");
		nota2 = valor.nextFloat();
		System.out.printf("\nSua segunda nota é: %.2f", nota2);
		
		//nota3
		System.out.printf("\nEntre com a terceira nota: ");
		nota3 = valor.nextFloat();
		System.out.printf("\nSua terceira nota é: %.2f", nota3);
		
		//nota4
		System.out.printf("\nEntre com a quarta nota: ");
		nota4 = valor.nextFloat();
		System.out.printf("\nSua quarta nota é: %.2f", nota4);
		
		//Fazer a média.
		mediaFinal = (nota1+nota2+nota3+nota4)/4; 
		System.out.printf("\nSua média final é: %.1f", mediaFinal);
	}

}
