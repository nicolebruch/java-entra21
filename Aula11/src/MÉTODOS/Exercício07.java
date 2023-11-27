package MÉTODOS;

import java.util.Scanner;

public class Exercício07 {

	static Scanner scan = new Scanner(System.in);

	// Faça um programa que printe o número que o usuário entrou e os 20 números que
	// vem depois dele

	public static void printação(int número) {
		for (int i = número + 1; i <= número + 20; i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {

		System.out.println("Informe um número");
		int número = scan.nextInt();

		printação(número);
	}

}
