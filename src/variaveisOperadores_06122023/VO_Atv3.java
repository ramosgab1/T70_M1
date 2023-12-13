package variaveisOperadores_06122023;

import java.util.Scanner;

public class VO_Atv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inicializar o Scanner. 
		Scanner valor = new Scanner(System.in); 
		
		//Inicializar as variáveis.
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
		float salarioLiquido; 
		
		//Input de informações - instrução ao usuário. Por conta da precisão de 
		//casas decimais, usaremos printf, %.2f e virgula ao invés de +. 
		
		//salarioBruto
		System.out.printf("Entre aqui com o valor de seu salário bruto: ");
		salarioBruto = valor.nextFloat();
		System.out.printf("O valor de seu salário bruto é: %.2f", salarioBruto);
		
		//adicionalNoturno
		System.out.printf("\nEntre aqui com o valor de seu adicional noturno: ");
		adicionalNoturno = valor.nextFloat();
		System.out.printf("O valor de seu adicional noturmo é de: %.2f", adicionalNoturno);
		
		//horasExtras
		System.out.printf("\nEntre aqui com o valor de suas horas extras: ");
		horasExtras= valor.nextFloat();
		System.out.printf("O valor de suas horas extras é de: %.2f", horasExtras);
		
		//descontos
		System.out.printf("\nEntre aqui com o valor dos descontos: ");
		descontos = valor.nextFloat();
		System.out.printf("O valor dos descontos é de: ", descontos);
		
		//Fazendo a média para descobrir o salário líquido. 
		salarioLiquido = (salarioBruto+adicionalNoturno+(horasExtras*5)-descontos);
		System.out.printf("Seu salário líquido é de: %.2f", salarioLiquido);
	}

}
