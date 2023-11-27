package MÉTODOS;

import java.util.Scanner;

public class Exercício05 {

	static Scanner scan = new Scanner(System.in);

	// Faça um programa que receba 2 números do usuário.
	// Faça um método que descubra qual dos números é maior
	// Se os dois números forem iguais, informe: número iguais

	public static void comparar(int num1, int num2) {
		if (num1 == num2) {
			System.out.println("Iguais");
		} else if (num1 > num2) {
			System.out.println(num1 + " é maior");
		} else {
			System.out.println(num2 + " é maior");
		}
	}

	public static void main(String[] args) {

		System.out.println("Informe um valor");
		int num1 = scan.nextInt();
		System.out.println("Informe outro valor");
		int num2 = scan.nextInt();

		comparar(num1, num2);

	}

}
