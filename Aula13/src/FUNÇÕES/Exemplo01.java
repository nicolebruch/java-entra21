package FUNÇÕES; 

public class Exemplo01 {

	// Fórmula public static tipo printNome() {

	public static String printNome() {

		// Dentro do nosso escopo, a gente passa
		// a ter retorno
		// Sempre deve criar uma variável

		String nome = "Nicole";
		return nome;
	}

	public static double soma(double num1, double num2) {
		// Feito o processo, no caso, a função
		double soma = num1 + num2;
		return soma;
	}

	// Método main vai por último

	public static void main(String[] args) {
		System.out.println(printNome());

		System.out.println(soma(10.5, 25.5));
	}

}
