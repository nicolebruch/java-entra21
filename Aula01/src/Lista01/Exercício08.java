package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício08 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.00");

	public static void main(String[] args) {

		// Ler quantidade de dollares convertidos por reais
		// Calcular quantos reais serão devolvidos a quem converteu.

		// entrada

		System.out.println("Informe quantos dollares foram convertidos.");
		double dollares = entrada.nextDouble();
		double dollar = 1;
		double real = 4.97;

		// processo

		double conversão = dollares * real;

		// saída

		System.out.println("O valor convertido é de " + conversão);

	}

}
