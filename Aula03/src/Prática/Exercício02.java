package Prática;

import java.util.Scanner;

public class Exercício02 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		/// Para doar sangue é necessário ter entre 18 e 67 anos
		// Pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.
		// Use alguns dos operadores lógicos OU (||) e E (&&).

		// entrada

		System.out.println("Informe a sua idade.");
		int idade = scan.nextInt();

		// processo

		if (idade >= 18 && idade <= 67) {
			System.out.println("Você pode doar sangue!");

		} else {

			// saída

			System.out.println("Você não pode doar sangue!");
		}

	}

}
