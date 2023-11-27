package Lista02a;

import java.util.Scanner;

public class Condicional05ComFrequência {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Recebe a nota do aluno e retorna:
		// A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
		// A mensagem “Aprovado com Distinção”, se a média for igual a dez;
		// A mensagem “Reprovado” se a média for menor de do que sete;

		// entrada

		System.out.println("Informe a sua primeira nota.");
		double notaUm = scan.nextDouble();
		System.out.println("Informe a sua segunda nota.");
		double notaDois = scan.nextDouble();
		System.out.println("Informe a sua terceira nota.");
		double notaTrês = scan.nextDouble();
		System.out.println("Informe a sua frequência (%).");
		int frequência = scan.nextInt();

		// processo

		double média = (notaUm + notaDois + notaTrês) / 3;

		// saída

		if (média > 10 && frequência >= 75) {
			System.out.println("Aprovado com distinção.");
		}
		if (média == 10) {
			System.out.println("Valor inválido.");
		} else if (média >= 7 && frequência >= 75) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");

			boolean frequencia = false;

		}
	}

}