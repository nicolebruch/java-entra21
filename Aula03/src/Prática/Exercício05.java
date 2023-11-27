package Prática;

import java.util.Scanner;

public class Exercício05 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Dada a idade de um nadador descreva um algoritmo que o classifique
		// Pré-mirim 5 - 7 anos '
		// Mirim 8 - 10 anos '
		// Infantil 11 - 13 anos '
		// Infanto-juvenil 14 - 17 anos '
		// Juvenil 18 - 20 anos
		// Adulto maiores de 21 anos

		// entrada

		System.out.println("Informe a sua idade.");
		int idade = scan.nextInt();

		// processo e saída

		if (idade >= 21) {
			System.out.println("Você é Adulto");
		} else if (idade >= 5 && idade <= 7) {
			System.out.println("Você é Pré-Mirim.");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Você é Mirim");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("Você é Infantil");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Você é Infanto-Juvenil");
		} else if (idade >= 18 && idade <= 20) {
			System.out.println("Você é Juvenil");

		} else {
			System.out.println("Não pode nadar");
		}
	}

}
