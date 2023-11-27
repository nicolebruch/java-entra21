package LaçoDeRepetição;

import java.util.Scanner;

public class Exercício07 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Caso o usuário digite a letra 's' peça para informar um número
		// Caso digite 'n' encerre o programa e por fim
		// a) escreva o menor valor
		// b) escreva o maior valor

		// entrada

		System.out.println("Informe uma opção");
		char opção = scan.next().charAt(0);

		// um número

		int número = 0;
		int menor = Integer.MAX_VALUE; // variável auxiliar - valor
		int maior = Integer.MIN_VALUE;

		// debug

		// System.out.println(menor);

		// debug
		// System.out.println(maior);

		while (opção == 's') {

			System.out.println("Informe um número");
			número = scan.nextInt();

			// processo

			if (número < menor) {
				menor = número;
			}
			// debug

			System.out.println("Menor temp " + menor);
			if (número > maior) {
				maior = número;
			}

			// não entrar em loop
			// opção = 'n';

			System.out.println("Informe uma opção");
			opção = scan.next().charAt(0);

			// desafio add no código

			while (opção != 's' && opção != 'n') {
				System.out.println("Valor inválido");
				System.out.println("Informe de novo");
				opção = scan.next().charAt(0);

			}

			// saída

			System.out.println("Menor " + menor);
			System.out.println("Maior " + maior);

		}
	}
}
