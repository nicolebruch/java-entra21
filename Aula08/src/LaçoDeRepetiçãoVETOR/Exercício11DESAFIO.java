package LaçoDeRepetiçãoVETOR;

import java.util.Scanner;

public class Exercício11DESAFIO {

	static // importar
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// vetor1 = [1,2,3]
		// vetor2 = [1,5,6]
		// vetor3 = [2,7,9].
		// Exiba, ao final, os três vetores na tela.

		// Faça um algoritmo que inverta a ordem de uma array
		// (o primeiro elemento vai se tornar o último elemento)

		// entrada

		int[] Vetor = { 1, 6, 9, 16 };

		// variávelauxiliar

		int VariávelAuxiliar = Vetor.length - 1; // final do comando
		//índice ocorre no início 
		
		//temporária recebe um valor antes dele ser alterado 
		
		int temporária = ' ';

		// processo

		for (int índice = 0; índice < VariávelAuxiliar; índice++) {
			temporária = Vetor [índice];
			
			//Valor do Vetor alterado	
			Vetor [índice]= Vetor [VariávelAuxiliar];
			System.out.println(temporária = Vetor[VariávelAuxiliar]);

		}
	}

}
