package Lista02a;

import java.util.Scanner;

public class Condicional03 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Perguntar em que turno você estuda.
		// Peça para digitar M-matutino ou V-vespertino ou N-noturno
		// Imprima a mensagem “Bom dia!”, "Boa tarde" ou “Boa Noite” ou “Valor
		// inválido”, conforme o caso.

		// entrada

		System.out.println("Em qual turno você estuda?");
		System.out.println("Digite M-matutino, V-vespertino e N-noturno.");
		final String turno = scan.next();

		// processo e saída

		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Valor inválido!");
		}
	}
}