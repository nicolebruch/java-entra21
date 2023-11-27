package LaçoDeRepetição;

import java.util.Scanner;

public class Exercício02 {

	static // importar

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Ler nome de usuário e a sua senha
		// Não aceite a senha igual ao nome do usuário
		// Mostre uma mensagem de erro e voltando a pedir as informações
		// Caso seja certo, de os parabéns e encerre o programa.

		// entrada - Login e Senha

		System.out.println("Informe o nome do usuário.");
		String nome = scan.next();
		System.out.println("Informe a sua senha");
		String senha = scan.next();

		// processo

		while (nome.equals(senha)) {
			System.out.println("Entrada inválida");
			System.out.println("Informe o usuário");
			nome = scan.next();

			System.out.println("Informe a senha");
			senha = scan.next();

		}

		// saída
		System.out.println("Usuário logado com sucesso.");
	}

}
