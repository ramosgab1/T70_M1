package lacosRepeticao_08122023;

import java.util.Scanner;

public class LR_List02_Atv3 {

	public static void main(String[] args) {
		//  leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de 
		//pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 
		//anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
		
		//Inicializa scanner e variáveis. 
		
		Scanner leia = new Scanner(System.in); 
		int idade=0, a=0, b=0; 
		
		while(idade>=0) {		
		System.out.println("Insira uma idade: ");
		idade = leia.nextInt();	
			if(idade<21 && idade>0) {
			a = a + 1;
			System.out.println(a);
			} 
			if(idade>50) {
				b = b + 1; 
			}
	}
		System.out.println("Total de pessoas menores de 21 anos é: " + a);
		System.out.println("Total de pessoas maiores de 50 anos é " + b);
}
}
