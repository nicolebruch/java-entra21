package Prática;

import java.util.Scanner;

public class Exercício03 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Perguntar o preço de 3 produtos
				// Informar qual produto deve comprar
				// A decisão vai ser do produto mais barato.

				// entrada - preço de três produtos
				System.out.println("Informe o valor 1.");
				double valorUm = scan.nextDouble();
				System.out.println("Informe o valor 2.");
				double valorDois = scan.nextDouble();
				System.out.println("Informe o valor 3.");
				double valorTres = scan.nextDouble();

				String qualProdutoComprar = "";

				// processo

				if (valorUm < valorDois && valorUm < valorTres) {
					qualProdutoComprar = "Produto 1";

				} else if (valorDois < valorUm && valorDois < valorTres) {
					qualProdutoComprar = "Produto 2";

				} else {
					qualProdutoComprar = "Produto 3";

					// saída
					System.out.println("O produto que deve ser comprado é " + qualProdutoComprar);
				}
			}

		}