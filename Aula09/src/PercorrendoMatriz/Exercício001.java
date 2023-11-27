package PercorrendoMatriz;

import java.util.Scanner;

public class Exercício001 {

	static

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Criar uma matriz com 1 linha e 10 colunas,
		// Na mesma verifique quantos valores são par e quantos valores são impar
		// Calcule a média dos valores

		// entrada

		int[][] matriz = new int[1][10];

		matriz[0][0] = 3;
		matriz[0][1] = 5;
		matriz[0][0] = 8;
		matriz[0][1] = 9;
		matriz[0][2] = 12;
		matriz[0][3] = 18;
		matriz[0][4] = 20;
		matriz[0][5] = 23;
		matriz[0][6] = 32;
		matriz[0][7] = 40;
		matriz[0][8] = 45;
		matriz[0][9] = 90;

		// variáveis

		int par = 0;
		int impar = 0;
		double soma = 0;
		

		//processo 
		
		for (int índice = 0; índice < matriz[0].length; índice++)
			soma = soma + matriz[0][índice];
		
			int índice = 0 ;
			if (matriz[0][índice ] % 2 == 0) {
				par++;
				System.out.println("O valor é par " + matriz[0][índice]);

			} else {
				impar++;
				System.out.println("O valor é ímpar " + matriz[0][índice]);
			}

		System.out.println("Média " + (soma/matriz[0].length));
		
	}

}
