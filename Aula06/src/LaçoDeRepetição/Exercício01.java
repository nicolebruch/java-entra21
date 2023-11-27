package LaçoDeRepetição;

import java.util.Scanner;

public class Exercício01 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Ler um número do teclado até que encontre um número menor ou igual a 1.

		// entrada

		System.out.println("Informe valores");
		int entrada = scan.nextInt();

		while (entrada > 1) {
			System.out.println("Informe valores");
			entrada = scan.nextInt();
		}
		System.out.println("Fim");
	}

}
