package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício06 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.00");

	public static void main(String[] args) {

		// Ler número de um funcionário (credencial)
		// Ler número de horas trabalhadas
		// Ler valor que recebe por hora
		// Calcule o salário desse funcionário.
		// Mostre a credencial, salário com duas casas decimais

		// entrada

		System.out.println("Informe a sua credencial");
		String credencial = entrada.next();
		System.out.println("Informe o número de horas trabalhadas");
		double horas = entrada.nextDouble();
		System.out.println("Informe o valor recebido por hora");
		double valor = entrada.nextDouble();

		// processo

		double salário = horas * valor;

		// saída

		System.out.println("O salário do funcionário " + credencial + " é " + salário);

	}

}
