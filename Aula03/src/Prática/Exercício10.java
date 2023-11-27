package Prática;

import java.util.Scanner;

public class Exercício10 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres
		// (Considere que a idade entre homens e mulheres sempre serão Diferentes).
		// Calcular e escrever a soma das idades do homem mais velho com a mulher mais
		// nova
		// Calcular o produto das idades do homem mais novo com a mulher mais velha.

		// entrada

		System.out.println("Informe a idade do homem 1");
		int homem1 = scan.nextInt();

		System.out.println("Informe a idade do homem 2");
		int homem2 = scan.nextInt();

		System.out.println("Informe a idade da mulher 1");
		int mulher1 = scan.nextInt();

		System.out.println("Informe a idade da mulher 2");
		int mulher2 = scan.nextInt();

		// variável auxiliar ou temporária
		int homemVelho = 0;
		int homemNovo = 0;
		int mulherVelha = 0;
		int mulherNova = 0;
		int soma = 0;
		int produto = 0;

		// processo (método 1)

		if (homem2 > homem1) {
			homemVelho = homem2;
			homemNovo = homem1;

		} else {
			homemVelho = homem1;
			homemNovo = homem2;

		}
		if (mulher2 > mulher1) {
			mulherVelha = mulher2;
			mulherNova = mulher1;

		} else {
			mulherVelha = mulher1;
			mulherNova = mulher2;
		}

		// processo (método 2)

		if (homem1 > homem2 && mulher1 > mulher2) {
			soma = homem1 + mulher2;
			produto = homem2 * mulher1;

		} else if (homem2 > homem1 && mulher1 > mulher2) {
			soma = homem2 + mulher2;
			produto = homem1 * mulher1;

		} else if (homem1 > homem2 && mulher2 > mulher1) {
			soma = homem1 + mulher1;
			produto = homem2 * mulher2;

		} else {
			soma = homem2 + mulher1;
			produto = homem1 * mulher2;
		}

		// saída

		System.out.println("A soma " + soma);
		System.out.println("O produto " + produto);

	}
}
