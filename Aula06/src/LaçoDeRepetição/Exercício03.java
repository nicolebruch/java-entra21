package LaçoDeRepetição;

import java.util.Scanner;

public class Exercício03 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Pedir ao usuário um número entre 12 e 20.
		// Se a pessoa digitar um número diferente, mostrar a mensagem "entrada
		// inválida" e solicitar o número novamente.
		// Se digitar correto mostrar o número digitado.

		// entrada

		System.out.println("Informe valores");
		int entrada = scan.nextInt();

		while (entrada < 12 || entrada > 20) {
			System.out.println("Valor inválido");
			entrada = scan.nextInt();
		}
		System.out.println(entrada);
		System.out.println("Fim");

	}

}
