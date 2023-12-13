package lacosRepeticao_08122023;

import java.util.Scanner;

public class LR_List01_Atv1 {

		public static void main(String[] args) {
			// Inicializa o scanner e as variáveis.
			Scanner leia = new Scanner(System.in);
			int n1, n2;

			// Instrução ao usuário.
			System.out.println("Digite o primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("Digite o segundo número: ");
			n2 = leia.nextInt();

			// SE (if) n1<n2: Roda o programa. SENÃO (else): Intervalo de número inválido.
			// SE n1<n2 então para valor inicial = i = n1; valor final i <= n2 e i++ temos
			// que
			// caso o resto da divisão por 3 E o resto da divisão por 5 for 0 = multiplo dos
			// dois.

			if (n1 < n2) {
				for (int i = n1; i <= n2; i++) {
					if (i % 3 == 0 && i % 5 == 0) {
						System.out.println("O número " + i + " é múltiplo de 3 e 5.");
					}
				}
			} else {
				System.out.println("Intervalo de número inválido! Tente outra vez.");
			}
		}

	}
