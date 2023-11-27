package PercorrendoMatriz;

public class Exercício05 {

	public static void main(String[] args) {

		// letra A
		int qntLinhas = 4;
		int qntColunas = 4;
		char[][] matriz = new char[qntLinhas][qntColunas];

		// percorrendo as linhas

		for (int linha = 0; linha < qntLinhas; linha++) {

			// percorrendo as colunas
			for (int coluna = 0; coluna < qntColunas; coluna++) {
				matriz[linha][coluna] = '*';
			}
		}

		for (int linha = 0; linha < qntLinhas; linha++) {
			for (int coluna = 0; coluna < qntColunas; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}

		// letra C

		for (int linha = 0; linha < qntLinhas; linha++) {
			for (int coluna = 0; coluna < qntColunas; coluna++) {
				if (coluna > linha) {
					matriz[linha][coluna] = ' ';
				} else {
					matriz[linha][coluna] = '*';
				}
			}
		}

		// percorrendo as linhas

		for (int linha = 0; linha < qntLinhas; linha++) {

			// percorrendo as colunas

			for (int coluna = 0; coluna < qntColunas; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();

		}

	}
}