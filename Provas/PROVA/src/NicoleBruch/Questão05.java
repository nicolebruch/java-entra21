package NicoleBruch;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questão05 {

	static // importar

	Scanner scan = new Scanner(System.in);
	static DecimalFormat formatar = new DecimalFormat("0.00");

	public static void main(String[] args) {

		// salário base com base nas vendas efetuadas durante o mês
		// vendas efetuadas durante o mês == 30% de comissão sobre o preço de cada
		// produto vendido.
		// Cada vendedor, em um determinado mês, vende n produtos
		// cada produto tem preço unitário e quantidade vendida.
		// deseja obter um relatório com: nome, total de vendas
		// (em R$ e somente duas casas decimais após a vírgula)
		// e salário de cada vendedor

// Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: 
//	“deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)”.

		// 30% de comissão sobre o preço de cada produto vendido.
		// determinado mês, vende n produtos, onde para cada produto tem-se o preço
		// unitário e a quantidade vendida.

		// entrada
		char op = 's';

		while (op == 's') {
			// nome
			System.out.println("Informe o nome do vendedor.");
			String nome = scan.next();

			// total de vendas
			double totaldeVendas = 0;

			char addProduto = 's';

			while (addProduto == 's') {
				// valor do produto
				System.out.println("Informe o valor do produto.");
				double valor = scan.nextDouble();

				// quantidade de produtos
				System.out.println("Informe a quantidade de produtos.");
				int quantidade = scan.nextInt();

				// preço unitário * quantidade
				totaldeVendas += valor * quantidade;

				// perguntar se deseja informar um novo produto
				System.out.println("Deseja informar um novo produto? (s/n)");
				addProduto = scan.next().charAt(0);
			}

			// salário
			double salário = totaldeVendas * 0.30;

			// exibir relatório
			System.out.println("Nome: " + nome);
			System.out.println("Total de vendas: " + formatar.format(totaldeVendas));
			System.out.println("Salário: " + formatar.format(salário));

			// perguntar se deseja digitar os dados de mais um vendedor
			System.out.println("Deseja digitar os dados de mais um vendedor? (s/n)");
			op = scan.next().charAt(0);
		}

		System.out.println("Programa encerrado.");
	}
}
