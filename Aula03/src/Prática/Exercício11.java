package Prática;

import java.util.Scanner;

public class Exercício11 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha.
		// Faça um algoritmo para ler as idades dos filhos
		// exibir quem é o mais velho, o irmão do meio e o caçula da família
		// Suponha que não haja empates.

		// entrada

		System.out.println("Informe a idade de Marquinhos.");
		int Marquinhos = scan.nextInt();
		System.out.println("Informe a idade de Zezinho.");
		int Zezinho = scan.nextInt();
		System.out.println("Informe a idade de Luluzinha.");
		int Luluzinha = scan.nextInt();

		// Variável auxiliar ou temporária

		String irmãoVelho = "";
		String irmãoMeio = "";
		String irmãoNovo = "";

		// processo

		if (Marquinhos > Zezinho && Marquinhos > Luluzinha) {
			irmãoVelho = "Marquinhos";
			if (Zezinho > Luluzinha) {
				irmãoMeio = "Zezinho";

			} else {
				irmãoNovo = "Luluzinha";
				irmãoVelho = "Marquinhos";
			}
		} else if (Zezinho > Luluzinha) {
			irmãoVelho = "Zezinho";
			if (Marquinhos > Luluzinha) {
				irmãoMeio = "Marquinhos";
			} else {
				irmãoNovo = "Luluzinha";
			}
			irmãoVelho = "Zezinho";
		} else {
			if (Marquinhos > Zezinho) {
				irmãoMeio = "Marquinhos";
			} else {
				irmãoNovo = "Zezinho";
				irmãoVelho = "Luluzinha";

				// saída

				System.out.println("O irmão mais velho é " + irmãoVelho + "," + "O irmão do meio é " + irmãoMeio
						+ ",e o irmão caçula é " + irmãoNovo);

			}

		}

	}
}