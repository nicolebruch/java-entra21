package LaçoDeRepetição;

import java.util.Scanner;

public class Explicação01 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Só vai mostrar números antes de 6, depois de 6 ele não mostra mais nenhum número
		int numero = 0;
		while (numero < 6) {
			System.out.println(numero);
			numero++;

		}

		System.out.println("Informe valores");
		int entrada = scan.nextInt();

		while (entrada != 0) {
			System.out.println("Informe valores");
			entrada = scan.nextInt();
		}

		System.out.println("fim");

		System.out.println("Informe uma letra");
		char entrada2 = scan.next().charAt(0);

		while (entrada2 != 'a') {
			System.out.println("Informe uma letra");
			entrada2 = scan.next().charAt(0);
		}
		System.out.println("Fim");

	}

}
