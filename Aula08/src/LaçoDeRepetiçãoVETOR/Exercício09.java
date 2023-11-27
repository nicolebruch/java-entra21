package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício09 {

	static // importar
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Faça um programa para ler os valores de dois vetores de inteiros
		// cada um contendo 10 elementos.

//Crie um terceiro vetor
		// em que cada elemento é a soma dos valores contidos nas posições respectivas
		// dos vetores originais.

//Por exemplo, vetor1 = [1,2,3]
//vetor2 = [1,5,6] 
		// vetor3 = [2,7,9].
		// Exiba, ao final, os três vetores na tela.

		// variável

		int tamanho = 3;

		// entrada

		int[] vetorUm = new int[tamanho];
		int[] vetorDois = new int[tamanho];
		int[] vetorTres = new int[tamanho];

		// vetor1 = [1,2,3]

		vetorUm[0] = 1;
		vetorDois[1] = 2;
		vetorTres[2] = 3;

		// vetor2 = [1,5,6]

		vetorDois[0] = 1;
		vetorDois[1] = 5;
		vetorDois[2] = 6;

		for (int índice = 0; índice < tamanho; índice++) {
			vetorTres[índice] = vetorUm[índice] + vetorDois[índice];

		}
		for (int índice = 0; índice < tamanho; índice++) {
			System.out.println(vetorTres[índice]);

		}

	}
}