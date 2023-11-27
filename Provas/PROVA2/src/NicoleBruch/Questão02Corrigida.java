package NicoleBruch;

import java.util.Scanner;

public class Questão02Corrigida {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Questão 2)
		// Encontrar a maior sequência de números seguidos em um vetor.
		// o vetor {6, 0, 1, 5, 4, 3, 4, 5, 6, 1, 6} tem a maior sequência sendo
		// {3, 4, 5, 6}.
		// Exiba essa sequência.
		// Peça para o usuário inserir os valores do vetor.

		// variavelAuxiliar

		int possivelInicio = 0;
		int inicioSequencia = 0;
		int tamanhoSequencia = 1;
		int tamanhoFinal = 1;
		// entrada

		int[] valores = new int[8];

		// processo

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Informe valores no vetor");
			valores[i] = scan.nextInt();

		}

		for (int i = 1; i < valores.length; i++) {
			if (valores[i] - 1 == valores[i - 1]) {
				tamanhoSequencia++;

			} else {
				tamanhoSequencia = 1;
				possivelInicio = i;
			}

			if (tamanhoSequencia > tamanhoFinal) {
				tamanhoFinal = tamanhoSequencia;
				inicioSequencia = possivelInicio;
			}
		}

		for (int i = 0; i < tamanhoFinal; i++) {
			System.out.println(valores[inicioSequencia + i]);
		}

	}

}
