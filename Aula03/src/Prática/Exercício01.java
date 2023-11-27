package Prática;

import java.util.Scanner;

public class Exercício01 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		//// Verificar (usando if e else) se uma letra digitada é vogal ou consoante.

		// entrada

		System.out.println("Informe uma letra");
		String letra = scan.next();

		// Caixa pequena

		letra = letra.toLowerCase();

		// Caixa alta

		letra.toUpperCase();

		// processo e saída - vogal ou consoante

		// VOGAL - A,E,I,O,U

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println(letra + " é vogal.");

		} else
			System.out.println(letra + " é consoante.");

	}
}