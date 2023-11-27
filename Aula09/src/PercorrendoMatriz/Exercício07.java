package PercorrendoMatriz;

import java.util.Scanner;

public class Exercício07 {

	static // importar
	Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {

		// Crie uma matriz 3x3
		// usuário irá preencher os valores
		// utilize o scanner
		// no fim imprima a matriz

		// entrada

		int qntLinhas = 3;
		int qntColunas = 3;

		int[][] matrizes = new int[qntLinhas][qntColunas];

		// processo

		for (int linhas = 0; linhas < qntLinhas; linhas++) {
            for (int colunas = 0; colunas < qntColunas; colunas++) {
                System.out.println("Informe valor para a linha: [" + linhas + "] e coluna: [" + colunas + "]");
                int valor = scan.nextInt();
                matrizes[linhas][colunas] = valor;
            }
        }
		//saida 
		
		System.out.println("Matriz informada:");
        for (int linhas = 0; linhas < qntLinhas; linhas++) {
            for (int colunas = 0; colunas < qntColunas; colunas++) {
                System.out.print(matrizes[linhas][colunas] + " ");
            }
            System.out.println(); // nova linha para a proxima linha da matriz
	}
			}
				
}