package NicoleBruch;

import java.util.Scanner;

public class Questão04OutraForma {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// usuário seleciona a opção onde
		// 1) Solicita 3 notas e calcula a média,
		// 2) Retorna os dados do aluno em questão (informe seu nome e e-mail),
		// 3) Solicita 5 valores, verifica e retorna qual é o maior e o menor.
		// A opção 0 encerra o programa e qualquer outra é declarada como inválida
		// Informar quantas vezes o usuário escolheu opções válidas antes de encerrar o
		// programa e quantas inválidas.

		// entrada

		System.out.println("Escolha uma opção");
		int opção = scan.nextInt();
		int contValidas = 0;
		int contInvalidas = 0;

		while (opção != 0) {
			switch (opção) {
			case 1:
				contValidas++;
				double nota = 0;
				double soma = 0;

				// 1) Solicita 3 notas e calcula a média
				for (int i = 0; i < 3; i++) {
					nota = scan.nextDouble();
					soma = soma + nota;
				}
				System.out.println("A média é " + (soma / 3));
				break;
			case 2:
				// retorna os dados do aluno em questão (informe seu nome e e-mail)
				System.out.println("Informe o seu nome");
				String nome = scan.next();
				System.out.println("Informe seu e-mail");
				String email = scan.next();
				System.out.println("Nome :" + nome);
				System.out.println("E-mail :" + email);
				break;
			case 3: //como se fosse um "for" ou um "if"
				contValidas++;
				// Solicita 4 valores, verifica e retonra qual é maior e o menor
				int maior = Integer.MIN_VALUE;
				int menor = Integer.MAX_VALUE;

				// variável
				int valor = 0;

				for (int i = 0; i < 5; i++) {
					System.out.println("Informe um valor");
					valor = scan.nextInt();

					if (valor > maior) {
						maior = valor;
					}
					if (valor < menor) {
						menor = valor;

					}

				}

				System.out.println("O menor valor é: " + menor);
				System.out.println("O maior valor é: " + maior);

				break;

			default:
				System.out.println("Inválido");
				contInvalidas++;
				break;

			}

			System.out.println("Escolha uma opção");
			opção = scan.nextInt();
		}

		System.out.println("Opções inválidas.");
		System.out.println("Opções válidas.");
	}

}
