package REVISÃO;

import java.util.Scanner;

public class Exercício03 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Descreva um algoritmo que leia vá lendo números inteiros até o usuário entrar
		// com o número 0

		// a) Qual é o menor valor?

		// b) Qual é o maior valor?

		// c) Qual é a média dos valores?

		// variávelAuxiliar

		double menorValor = Double.MAX_VALUE;
		double maiorValor = Double.MIN_VALUE;
		double médiaValor = 0;
		double contadorNumb = 0;
		double soma = 0;

		// entrada

		System.out.println("Informe números");
		int numeros = scan.nextInt();

		// processo

		while (numeros != 0) {
			médiaValor = soma + numeros;
			contadorNumb++;

			if (numeros < menorValor) {
				menorValor = numeros;
			}

			if (numeros > maiorValor) {
				maiorValor = numeros;
			}
			System.out.println("Informe números");
			numeros = scan.nextInt();
		}

		médiaValor = numeros / contadorNumb;

		// saída

		System.out.println("O menor valor é " + menorValor);
		System.out.println("O maior valor é " + maiorValor);
		System.out.println("A média dos valores é de " + médiaValor);

	}

}
