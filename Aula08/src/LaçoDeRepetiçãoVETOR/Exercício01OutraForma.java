package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício01OutraForma {

	static // importar
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// quem preenche os valores do vetor é o usuário,
		// por fim printe o vetor (vetor de 5 posições).

		// atribuir valores ao vetor de acordo com o quadrado do seu índice
		// printe o vetor.

		// Ex:

		// [0] = 0

		// [1] = 1

		// [2] = 4

		// [3] = 9

		// entrada

		int tamanhoVetor = 10;

		int[] vetor = new int[tamanhoVetor];

		// posição

		// System.out.println(vetor[0]); --> imprime o valor de UMA variável

		for (int índice = 0; índice < 10; índice++) {
			vetor[índice] = índice * índice;
		}
		for (int índice = 1; índice < 10; índice++) {
			System.out.println(vetor[índice]);
		}
	}
	}