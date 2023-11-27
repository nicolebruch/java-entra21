package MÉTODOS;

import java.util.Scanner;

public class Exercício08 {

	static Scanner scan = new Scanner(System.in);

	// Faça um código que recebe uma palavra do usuário
	// se essa palavra tem tamanho par
	// printe o primeiro caracter dessa palavra
	// Caso ela tenha tamanho ímpar
	// printe o segundo caracter dessa palavra

	public static void parÍmpar(String palavra) {

		if (palavra.length() % 2 == 0) {
			char caracter1 = palavra.charAt(0);
			System.out.println("A palavra é par e o primeiro caracter dessa palavra é " + caracter1);

		} else {
			char caracter2 = palavra.charAt(0);
			System.out.println("A palavra é ímpar e o segundo caracter dessa palavra palavra é " + caracter2);
		}
	}

	public static void main(String[] args) {

		System.out.println("Informe uma palavra");
		String palavra = scan.next();

		parÍmpar(palavra);

	}

}
