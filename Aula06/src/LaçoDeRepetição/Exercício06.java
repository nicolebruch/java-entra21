package LaçoDeRepetição;

import java.util.Scanner;

public class Exercício06 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Faça um programa que receba um nome de uma fruta como entrada.
		// Faça vários cases para as frutas que você conhece.
		// Por exemplo:
		// *Case "banana": Eu gosto dessa fruta
		// *Case "pera": Eu não gosto dessa fruta
		// Caso o usuário entre um valor desconhecido,
		// * escreva: Eu não conheço essa fruta e encerre o programa

		// entrada

		System.out.println("informe o nome de frutas.");
		String frutas = scan.nextLine();

		// processo

		while (frutas.equals("banana") || frutas.equals("pera") || frutas.equals("laranja") || frutas.equals("maçã")
				|| frutas.equals("morango")) {

			switch (frutas) {
			case "banana":
				System.out.println("Eu gosto dessa fruta");
				break;
			case "pera":
				System.out.println("Eu não gosto dessa fruta");
				break;
			case "laranja":
				System.out.println("Eu não gosto dessa fruta");
				break;
			case "maçã":
				System.out.println("Eu não gosto dessa fruta");
				break;
			case "morango":
				System.out.println("Eu não gosto dessa fruta");
				break;
			default:
				System.out.println("Eu não conheço essa fruta");
				break;
			}
		}
	}

}
