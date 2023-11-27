package PercorrendoMatriz;

import java.util.Scanner;

public class Exercício06 {

	static // importar
	Scanner scan = new Scanner(System.in);// importar

	public static void main(String[] args) {
		// Usuário define quantas linhas e colunas deve ter uma matriz
		// posteriormente imprima o total de elementos(posições) que está matriz tem

		// entrada

		System.out.println("Informe o número de linhas");
		int linhasDadas = scan.nextInt();

		System.out.println("Informe o número de colunas");
		int colunasDadas = scan.nextInt();

		int posiçaoTotal = linhasDadas * colunasDadas;

		System.out.println("O tamanho da matriz é de " + posiçaoTotal);

	}

}
