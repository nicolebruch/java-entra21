package Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício07 {

	static // importar

	Scanner entrada = new Scanner(System.in);
	DecimalFormat formatar = new DecimalFormat("0.00");

	public static void main(String[] args) {

		// Ler nome do vendedor,
		// Ler seu salário fixo
		// Ler total de vendas efetuadas por ele no mês (em dinheiro).
		// Vendedor ganha 15% de comissão sobre vendas feitas
		// Informar o total a receber no final do mês,
		// Resposta com duas casas decimais.

		// entrada

		System.out.println("Qual o nome do vendedor?");
		String name = entrada.next();
		System.out.println("Informe o seu salário fixo.");
		double salário = entrada.nextDouble();
		System.out.println("Informe o seu total de vendas efetuadas no mês em dinheiro.");
		double vendas = entrada.nextDouble();
		double comissão = 0.15;

		// processo

		double recebimento = (vendas * comissão) + salário;

		// saída

		System.out.println("O recebimento de " + name + " no final do mês é " + recebimento);

	}

}
