package PercorrendoMatriz;

public class Exercício03 {

	public static void main(String[] args) {

		// Criem uma matriz de 5 linhas
		// e 1 coluna
		// somem todos os valores
		// verifique a média e imprima somente os valores que estão acima dela

		// início

		int[][] matrizes = new int[5][1];
		matrizes[0][0] = 2;
		matrizes[1][0] = 6;
		matrizes[2][0] = 8;
		matrizes[3][0] = 16;
		matrizes[4][0] = 22;

		// variável auxiliar

		int soma = 0;

		// processo

		for (int linha = 0; linha < 5; linha++) {
			soma = soma + matrizes[linha][0];
		}

		int média = soma / 5;

		for (int linha = 0; linha < 5; linha++) {
			if (matrizes[linha][0] > média) {
				System.out.println(matrizes[linha][0]);
			}

			System.out.println("A soma de todos os valores é " + soma);
			System.out.println("O valor da média de todos os valores é " + média);

		}

	}

}