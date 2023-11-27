package Prática;

import java.util.Scanner;

public class Exercício06 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Ler o ano de nascimento de 3 irmãos
		// Mensagem indicando se são TRIGÊMEOS, GEMEOS ou APENAS IRMÃOS.
		// Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro
		// diferente dos demais
		// E apenas irmãos se todas as idades forem diferentes.

		// entrada

		System.out.println("Informe o seu ano de nascimento.");
		int irmao1 = scan.nextInt();
		System.out.println("Informe o ano de nascimento do seu irmão.");
		int irmao2 = scan.nextInt();
		System.out.println("Informe o ano de nascimento do seu outro irmão.");
		int irmao3 = scan.nextInt();

		// descobrir idade

		int valorUm = 2023 - irmao1;
		int valorDois = 2023 - irmao2;
		int valorTres = 2023 - irmao3;

		// caso valor seja inválido

		if ((valorUm > -1 && valorUm < 20) || valorDois > -1 && valorDois < 20 || valorTres > -1 && valorTres < 20) {

		}

		// processo e saída

		if (irmao1 == irmao2 && irmao1 == irmao3 && irmao2 == irmao3) {
			System.out.println("Vocês são TRIGÊMEOS.");
		}

		else if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3) {
			System.out.println("Vocês são GÊMEOS.");

		} else {
			System.out.println("Vocês são apenas IRMÃOS.");

		}
	}

}