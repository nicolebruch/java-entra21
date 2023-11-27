package PercorrendoMatriz;

public class Exercício04 {

	public static void main(String[] args) {
		// Crie uma matriz 3 linhas e 3 colunas
		// preencha a mesma de A até I,
		// posteriormente imprima a matriz.
		// Usar String ou Char

		char[][] matrizes = new char[3][3];

		matrizes[0][0] = 'a';
		matrizes[0][1] = 'b';
		matrizes[0][2] = 'c';
		matrizes[1][0] = 'd';
		matrizes[1][1] = 'e';
		matrizes[1][2] = 'f';
		matrizes[2][0] = 'g';
		matrizes[2][1] = 'h';
		matrizes[2][2] = 'i';

		for (char linha = 0; linha < 3; linha++) {

			for (char coluna = 0; coluna < 3; coluna++) {
				System.out.println(matrizes[linha][coluna] + " , ");
			}
			System.out.println();
		}

	}
}