package LaçoDeRepetição;

import java.util.Scanner;

public class Execício02 {

	static // importar soma = soma + numb

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Ler um número do teclado até que encontre um número igual a zero.
		// Mostre a soma dos números digitados.

		// entrada

		System.out.println("Informe valores");
		int entrada = scan.nextInt();

		while (entrada != 0) {
			System.out.println("Informe valores");
			int entrada2 = scan.nextInt();
			int soma = entrada + entrada2;

			// processo
			
			System.out.println("A soma dos números é " + soma);
		}
		// saída

		System.out.println("Fim");

	}

}
