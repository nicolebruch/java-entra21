package Lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condição03 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.0");

	public static void main(String[] args) {

		// Algoritmo que imprima "nome correto"
		// O nome inserido deve ser unicamente o seu

		// entrada

		System.out.println("Informe o seu primeiro nome.");
		final String primeiroNome = entrada.next();
		System.out.println("Informe o seu segundo nome.");
		final String segundoNome = entrada.next();

		// processo

		if (primeiroNome.equalsIgnoreCase(segundoNome)) {
			System.out.println("Nomes iguais");
		}
		else if (!primeiroNome.equalsIgnoreCase(segundoNome)) {
			System.out.println("Nomes diferentes");

			// saída

			System.out.println("Seu nome é " + primeiroNome + " " + segundoNome);
		}

	}

}
