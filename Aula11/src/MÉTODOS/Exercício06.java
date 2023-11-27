package MÉTODOS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício06 {

	static Scanner scan = new Scanner(System.in);

	// Faça um programa que calcule o perímetro e a área de um retângulo
	// (Passe a altura e a largura como parâmetros da função)

	public static void retângulo(double altura, double largura) {

		DecimalFormat formatar = new DecimalFormat("00.0");

		double perimetro = 2 * (altura + largura);
		double áreaRetangulo = altura * largura;

		System.out.println("A área do retângulo é  " + perimetro);
		System.out.println("O perímetro é " + áreaRetangulo);

	}

	public static void main(String[] args) {

		DecimalFormat formatar = new DecimalFormat("00.0");

		System.out.println("Informe a altura");
		double altura = scan.nextDouble();

		System.out.println("Informe a largura");
		double largura = scan.nextDouble();

		retângulo(altura, largura);

	}

}
