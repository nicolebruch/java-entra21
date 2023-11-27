package NicoleBruch;

import java.util.Scanner;

public class Questão04 {

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

		// entrada1

		System.out.println("Informe as suas 3 notas.");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();

		System.out.println("Informe o seu nome.");
		String nome = scan.next();

		System.out.println("Informe o seu e-mail.");
		String email = scan.next();

		// processo1

		double média = (nota1 + nota2 + nota3) / 3;

		// saída1

		System.out.println("A sua média " + nome + " é de " + média + " e foi anexado no e-mail " + email);

		// entrada2

		System.out.println("Informe 5 valores.");
		double valor1 = scan.nextDouble();
		double valor2 = scan.nextDouble();
		double valor3 = scan.nextDouble();
		double valor4 = scan.nextDouble();
		double valor5 = scan.nextDouble();

		// processo 2

		if (valor1 > valor2 && valor1 > valor3 && valor4 > valor5) {
			System.out.println("O maior número é");
		} else if (valor1 < valor2 && valor1 < valor3 && valor4 < valor5) {
			System.out.println("O menor número é");

		}
	}

}
