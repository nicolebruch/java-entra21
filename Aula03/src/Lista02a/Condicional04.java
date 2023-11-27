package Lista02a;

import java.util.Scanner;

public class Condicional04 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Verificar (usando if e else) se uma letra digitada é “F” ou “M”.
		// Conforme a letra escrever: F – Feminino, M- Masculino, Sexo inválido.

		// entrada

		System.out.println("Qual o seu sexo?");
		System.out.println("Digite  F – Feminino e M- Masculino.");
		final String sexo = scan.next();

		// processo e saída

		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Bem vindo!");
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Bem vinda!");
		} else {
			System.out.println("Sexo inválido!");
		}

	}

}