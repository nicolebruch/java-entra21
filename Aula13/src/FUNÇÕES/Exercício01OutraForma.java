package FUNÇÕES;

import java.util.Scanner;

public class Exercício01OutraForma {

	// mensagem é do tipo String
	// limite minimo, maximo e valor escolhido

	public static String verifica(int min, int max, int valorInserido) {

		// para verificar se o valor está dentro do limite

		if (valorInserido > min && valorInserido < max) {
			return valorInserido + " está nos limites impostos";
		} else {
			// senão
			return "não está no limite";
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * Faça um programa que diz se um número inserido está dentro de um limite
		 * imposto pelo usuário
		 * 
		 * Por exemplo:
		 * 
		 * Usuário inseriu o limite máximo como 100. Usuário inseriu o limite mínimo
		 * como 70.
		 * 
		 * Depois ele inseriu o número 80.
		 * 
		 * A saída deve ser: 80 está nos limites impostos.
		 */

		// Scanner dentro do metodo main

		System.out.println("Informe o limite minimo");
		int limiteMinimo = scan.nextInt();

		System.out.println("Informe limite máximo");
		int limiteMaximo = scan.nextInt();

		System.out.println("Informe um dado");
		int dado = scan.nextInt();

		System.out.println(verifica(limiteMaximo, limiteMinimo, dado));

	}

}
