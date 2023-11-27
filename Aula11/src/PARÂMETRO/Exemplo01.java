package PARÂMETRO;

public class Exemplo01 {

	// Dizer minha idade, altura e o meu nome

	public static void Nome(String nome) {
		System.out.println("Meu nome é " + nome);

	}

	public static void MÉTODOcomMaisDeUmPARÂMETRO(int idade, double altura, String nome) {
		System.out.println("Minha idade é: " + idade);
		System.out.println("Minha altura é: " + altura);
		System.out.println("Meu nome é: " + nome);

	}

	// Fazer a soma de 2 números

	public static void cálculoComPARÂMETRO(int num1, int num2) {
		System.out.println("A soma é igual a: " + (num1 + num2));

	}

	public static void main(String[] args) {

		String nome = "Nicole";
		Nome(nome); // Diz o nome 1 vez
		Nome("Nicole"); // Repete o nome novamente

		int idade = 16;
		double altura = 1.68;

		MÉTODOcomMaisDeUmPARÂMETRO(16, 1.68, "Nicole");

		int num1 = 50;
		int num2 = 100;
		cálculoComPARÂMETRO(50, 100);
	}

}