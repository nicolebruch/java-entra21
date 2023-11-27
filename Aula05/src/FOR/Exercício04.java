package FOR;

import java.util.Scanner;

public class Exercício04 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// entrada

		double soma = 0;
		double entrada = 0;
		for (int i = 1; i < 4; i++) {
			System.out.println("Informe a nota");
			entrada = scan.nextDouble();
			soma += entrada; // soma = soma + entrada;
		}
		// processo
		double media = soma / 3;

		// saida
		System.out.println("A média é " + media);

	}

}