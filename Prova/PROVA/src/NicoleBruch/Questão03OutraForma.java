package NicoleBruch;

import java.util.Scanner;

public class Questão03OutraForma {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// O usuário leia altura de 10 pessoas diferentes
		// calcule a média.

		// entrada e variável

		double altura = 0;
		double soma = 0;

		// processo

		for (int i = 0; i < 10; i++) {
			System.out.println("Informe a altura");
			altura = scan.nextDouble();
			soma = soma + altura;
		}

		// saída

		System.out.println("A média é " + (soma / 10));

	}

}
