package Prática;

import java.util.Scanner;

public class Exercício07 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Algoritmo que obtém do usuário 3 valores inteiros
		// Representando as três cartas deste usuário em uma mão de jogo de truco (1=
		// AS; 2=2; 3=3; 7=7;
		// 11= Valete; 12= Dama; 13= Rei)
		// Na tela “TRUCO” (se APENAS UMA das três cartas for AS, 2 ou 3)
		// Na tela “SEIS” (se APENAS DUAS das três cartas for AS, 2 ou 3)
		// Na tela “NOVE” (se AS TRÊS cartas forem AS, 2 ou 3).
		// Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada

		// entrada

		System.out.println("Informe o valor da primeira carta.");
		int cartaUm = scan.nextInt();
		System.out.println("Informe o valor da segunda carta.");
		int cartaDois = scan.nextInt();
		System.out.println("Informe o valor da terceira carta.");
		int cartaTres = scan.nextInt();

		// processo

		if ((cartaUm == 1 || cartaDois == 1 || cartaTres == 1) && (cartaUm == 2 || cartaDois == 2 || cartaTres == 2)
				&& (cartaUm == 3 || cartaDois == 3 || cartaTres == 3)) {
			System.out.println("NOVE!!!!!");
		} else if ((cartaUm < 4 && cartaDois < 4) || (cartaUm < 4 && cartaTres < 4)
				|| (cartaDois < 4 && cartaTres < 4)) {
			System.out.println("SEIS!!");
		} else if (cartaUm == 1 || cartaUm == 2 || cartaUm == 3 || cartaDois == 1 || cartaDois == 2 || cartaDois == 3
				|| cartaTres == 1 || cartaTres == 2 || cartaTres == 3) {
			System.out.println("TRUCO.");
		} else {
			System.out.println("NADA");
		}
	}

}