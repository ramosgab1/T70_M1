package lacosCondicionais_07122023;

import java.util.Scanner;

public class LC_List02_Atv6 {

		public static void main(String[] args) {
			/* Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do
			 * Colaborador (String), o Código do Cargo do Colaborador (número inteiro de 1 a
			 * 6) e o Salário (número float). A seguir, mostre na tela o Nome do
			 * Colaborador, o Cargo e o novo Salário reajustado.
			 */

			// Inicializa o Scanner.
			Scanner leia = new Scanner(System.in);
			String nome;
			int opcao;
			double salario, novoSalario;

			// Input nome do colaborador.
			System.out.println("Nome do colaborador: ");
			nome = leia.nextLine();

			// Menu de cargos.
			System.out.println("---------------- MENU ----------------");
			System.out.println("-- 1: Gerente.");
			System.out.println("-- 2: Vendedor.");
			System.out.println("-- 3: Supervisor.");
			System.out.println("-- 4: Motorista.");
			System.out.println("-- 5: Estoquista.");
			System.out.println("-- 6: Técnico de TI.");
			opcao = leia.nextInt();

			// Input de salário.
			System.out.println("O valor do salário: ");
			salario = leia.nextDouble();
			
			switch (opcao) {
			case 1: 
				System.out.println("Nome: " + nome + ".");
				System.out.println("Cargo: Gerente.");
				System.out.printf("Salário: %.2f", (novoSalario = salario +(salario * 0.1)));
			break;
			case 2: 
				System.out.println("Nome: " + nome + ".");
				System.out.println("Cargo: Vendedor.");
				System.out.printf("Salário: %.2f", (novoSalario = salario +(salario * 0.07)));
			break;
			case 3: 
				System.out.println("Nome: " + nome + ".");
				System.out.println("Cargo: Supevisor.");
				System.out.printf("Salário: %.2f", (novoSalario = salario +(salario * 0.09)));
			break;
			case 4: 
				System.out.println("Nome: " + nome + ".");
				System.out.println("Cargo: Motorista.");
				System.out.printf("Salário: %.2f", (novoSalario = salario +(salario * 0.06)));
			break;
			case 5: 
				System.out.println("Nome: " + nome + ".");
				System.out.println("Cargo: Estoquista.");
				System.out.printf("Salário: %.2f", (novoSalario = salario +(salario * 0.05)));
			break;
			case 6: 
				System.out.println("Nome: " + nome + ".");
				System.out.println("Cargo: Técnico de TI.");
				System.out.printf("Salário: %.2f", (novoSalario = salario +(salario * 0.08)));
			default:  
				System.out.println("Opção inválida");
			}

		}

	}
