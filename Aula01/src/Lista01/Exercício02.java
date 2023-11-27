package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício02 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.0");

	public static void main(String[] args) {

		// Calcular área da circunferência
		// elevar o valor de raio ao quadrado
		// multiplicar por π (π = 3.14159).

		// entrada

		System.out.println("Informe o valor do raio");
		float raio = entrada.nextFloat();
		float pi = 3.14159f;

		// processo

		float area = (raio * raio) * pi;

		// saída

		System.out.println("O valor da área da circunferência é de " + area);

	}

}
