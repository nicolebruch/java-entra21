package REVISÃO;

import java.util.Scanner;

public class Exercício04 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Crie uma array de 5 elementos e descubra:

//a) Qual o maior elemento 

//b) Qual o menor elemento 

//c) A média dos elementos

		// entrada

		double elementoMenor = Double.MAX_VALUE;
		double elementoMaior = Double.MIN_VALUE;

		double[] vetor = new double[5];
		
		// vetor.length = tamanho do vetor (quantia de elementos)

		double soma = 0;
		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.println("Informe um valor");
			
			// double valor = entrada.nextDouble();
			// vetor[indice] = valor;
			
			vetor[indice] = scan.nextDouble();
			soma = soma + vetor[indice];
			if (vetor[indice] < elementoMenor) {
				elementoMenor = vetor[indice];
			}

			if (vetor[indice] > elementoMaior) {
				elementoMaior = vetor[indice];
			}
		}

		System.out.println("Elemento Maior: " + elementoMaior);
		System.out.println("Elemento Menor: " + elementoMenor);
		System.out.println("A média dos Elementos: " + (soma / vetor.length));

	}

}
