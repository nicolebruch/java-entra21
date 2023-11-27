package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exemplo01 {

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Armazenar idade dos colegas do ENTRA21

		// tipo[] nomeDaVariável = new tipo [tamanho];

		int[] idades = new int[5];
		idades[0] = 40;
		idades[1] = 28;
		idades[2] = 22;
		idades[3] = 17;
		idades[4] = 16;

		System.out.println((idades[0] + idades[1] + idades[2] + idades[3] + idades[4]) / 5);

		for (int i = 0; i < 5; i++) {
			// imprimir as idades pelo laço de repetição
			System.out.println(idades[i]);

			// criar vetor String - apenas 3 posições

			// String[] nomes = new String[3];
			// nomes[0] = "Maria";
			// nomes[1] = "Nicole";
			// nomes[2] = "Beatriz";

			// for (int i2 = 0; i2 < 3; i2++) {
			// imprimir idades pelo laço de repetição
			// System.out.println(nomes[i2]);
			// }

			String[] nomesDaSala = new String[21];
			for (int i1 = 0; i1 < 21; i1++) {
				nomesDaSala[0] = "Maria";
				nomesDaSala[1] = "Nicole";
				nomesDaSala[2] = "Sara";
				nomesDaSala[3] = "Beatriz";
				nomesDaSala[4] = "Fernando";
				nomesDaSala[5] = "Pedro";
				nomesDaSala[6] = "Daniel";
				nomesDaSala[7] = "Bruna";
				nomesDaSala[8] = "Fernando Rodrigo";
				nomesDaSala[9] = "Arthur";
				nomesDaSala[10] = "Miguel";
				nomesDaSala[11] = "Samuel";
				nomesDaSala[12] = "Ademir";
				nomesDaSala[13] = "Ana";
				nomesDaSala[14] = "Eduardo";
				nomesDaSala[15] = "Vinícius";
				nomesDaSala[16] = "Sabrina";
				nomesDaSala[17] = "Luana";
				nomesDaSala[18] = "Lucas";
				nomesDaSala[19] = "Guilherme";
				nomesDaSala[20] = "Leonardo";

				System.out.println(nomesDaSala[i1]);

			}

		}
	}
}