package PercorrendoMatriz;

import java.util.Scanner;

public class Exemplo01 {

	static // importar
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[4][2];

		matriz[0][0] = 10;
		matriz[1][1] = 20;
		matriz[1][0] = 30;
		matriz[1][1] = 40;
		matriz[2][0] = 50;
		matriz[2][1] = 60;
		matriz[3][0] = 70;
		matriz[3][1] = 80;

		System.out.println("Matriz length " + matriz.length);
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			System.out.println(matriz[0][coluna]);
		}

		// for (int linha = 0; linha < matriz.length; linha++) {
		// System.out.println(matriz[linha][0]);
		// for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
		// System.out.println("teste");
		// }
		// }

	}
}