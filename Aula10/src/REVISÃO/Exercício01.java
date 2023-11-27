package REVISÃO;

import java.util.Scanner;

public class Exercício01 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// IMC = Massa / Altura²

		// classificar o IMC
		// dizer o grau de obesidade do indivíduo

		// < 18.5 Magreza

		// 18.5 – 24.9 Saudável

		// 25.0 – 29.9 Sobrepeso

		// 30.0 – 34.9 Obesidade Grau I

		// 35.0 – 39.9 Obesidade Grau II (severa)

		// > 40.0 Obesidade Grau III (morbida)


		// entrada

		System.out.println("Informe sua altura.");
		double altura = scan.nextDouble();

		System.out.println("Informe seu peso.");
		double peso = scan.nextDouble();

		// processo

		double IMC = peso / (altura * altura);

		if (IMC < 18.5) {
			System.out.println("Magreza");

		} else if (IMC >= 18.5 && IMC <= 24.9) {
			System.out.println("Saúdavel");

		} else if (IMC >= 25.0 && IMC <= 29.9) {
			System.out.println("Sobrepeso");

		} else if (IMC >= 30.0 && IMC <= 34.9) {
			System.out.println("Obesidade Grau I");

		} else if (IMC >= 35.0 && IMC <= 39.9) {
			System.out.println("Obesidade Grau II (severa)");

		} else {
			System.out.println("Obesidade Grau III (morbida)");

		}

		//saída
		
		System.out.println("Seu IMC é " + IMC);
		
	}

}
