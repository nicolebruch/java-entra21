package MÉTODOS;

public class Exercício03 {

	// Faça um programa que some 4 números.
	// Passando esses 4 números como parâmetros para um método

	public static void soma(int num1, int num2, int num3, int num4) {
		System.out.println("A soma é igual a: " + (num1 + num2 + num3 + num4));

	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;

		soma(10, 20, 30, 40);

	}

}
