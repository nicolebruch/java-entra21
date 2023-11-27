package Exercício02;

public class mercadoContinuação {

	public static void main(String[] args) {

		mercado unidadeDeBlumenau = new mercado(2000, 3, 1000, 2);
		mercado unidadeDeJoinville = new mercado(7000, 4, 3000, 2);
		mercado unidadeDeFlorianopolis = new mercado(1200, 5, 1200, 4);

//		Não precisa mais de todas essas unidades pois o construtor padrão puxou todos os valores e resumiu

//		unidadeDeBlumenau.numAppleYear = 2000;
//		unidadeDeBlumenau.coastApple = 3;
//		unidadeDeBlumenau.numOrangeYear = 1000;
//		unidadeDeBlumenau.coastOrange = 2;
//
//		unidadeDeJoinville.numAppleYear = 7000;
//		unidadeDeJoinville.coastApple = 4;
//		unidadeDeJoinville.numOrangeYear = 3000;
//		unidadeDeJoinville.coastOrange = 2;
//
//		unidadeDeFlorianopolis.numAppleYear = 1200;
//		unidadeDeFlorianopolis.coastApple = 5;
//		unidadeDeFlorianopolis.numOrangeYear = 1500;
//		unidadeDeFlorianopolis.coastOrange = 4;

		// Utilizando a classe Mercado.

		// Atribua valores às variáveis da classe Mercado para cada um dos objetos de
		// Mercado.

		// Sendo que o preço de compra dos produtos foi igual em todos os mercados.

		// Calcule:
		// a) Quem teve o maior lucro vendendo maçãs?
		// b) Quem teve o maior lucro vendendo laranjas?
		// c) Qual das lojas teve o maior lucro nesse ano específico?
		// d) Qual das lojas teve o menor lucro?
		// e) Qual das lojas ficou no "meio" em termos de lucro?
		// f) Juntando as 3 lojas, a franquia teve um lucro maior vendendo maçãs ou
		// laranjas?

		// variáveisAuxiliares

		double maiorLucroMaca = 0;
		double maiorLucroLaranja = 0;

		double maiorLucroFrutas = 0;
		double menorLucroFrutas = 0;

		String unidade = "";

		// a) Quem teve o maior lucro vendendo maçãs?
		if (unidadeDeBlumenau.lucroMaçã() > unidadeDeJoinville.lucroMaçã()
				|| unidadeDeBlumenau.lucroMaçã() > unidadeDeFlorianopolis.lucroMaçã()) {
			maiorLucroMaca = unidadeDeBlumenau.lucroMaçã();
			unidade = "Blumenau";

		} else if (unidadeDeJoinville.lucroMaçã() > unidadeDeBlumenau.lucroMaçã()
				|| unidadeDeJoinville.lucroMaçã() > unidadeDeFlorianopolis.lucroMaçã()) {
			maiorLucroMaca = unidadeDeJoinville.lucroMaçã();
			unidade = "Joinville";

		} else if (unidadeDeFlorianopolis.lucroMaçã() > unidadeDeBlumenau.lucroMaçã()
				|| unidadeDeFlorianopolis.lucroMaçã() > unidadeDeJoinville.lucroMaçã()) {
			maiorLucroMaca = unidadeDeFlorianopolis.lucroMaçã();
			unidade = "Florianópolis";

		}

		System.out.println(
				"A unidade com maior lucro na venda de maçãs é a de " + unidade + " com um lucro de " + maiorLucroMaca);

		// b) Quem teve o maior lucro vendendo laranjas?
		if (unidadeDeBlumenau.lucroLaranjas() > unidadeDeJoinville.lucroLaranjas()
				|| unidadeDeBlumenau.lucroLaranjas() > unidadeDeFlorianopolis.lucroLaranjas()) {
			maiorLucroLaranja = unidadeDeBlumenau.lucroLaranjas();
			unidade = "Blumenau";

		} else if (unidadeDeJoinville.lucroLaranjas() > unidadeDeBlumenau.lucroLaranjas()
				|| unidadeDeJoinville.lucroLaranjas() > unidadeDeFlorianopolis.lucroLaranjas()) {
			maiorLucroLaranja = unidadeDeJoinville.lucroLaranjas();
			unidade = "Joinville";

		} else if (unidadeDeFlorianopolis.lucroLaranjas() > unidadeDeBlumenau.lucroLaranjas()
				|| unidadeDeFlorianopolis.lucroLaranjas() > unidadeDeJoinville.lucroLaranjas()) {
			maiorLucroLaranja = unidadeDeFlorianopolis.lucroLaranjas();
			unidade = "Florianópolis";

		}

		System.out.println("A unidade com maior lucro na venda de laranjas é a de " + unidade + " com um lucro de "
				+ maiorLucroLaranja);

		// c) Qual das lojas teve o maior lucro nesse ano específico?
		if (unidadeDeBlumenau.somaFrutas() > unidadeDeJoinville.somaFrutas()
				&& unidadeDeBlumenau.somaFrutas() > unidadeDeFlorianopolis.somaFrutas()) {
			maiorLucroFrutas = unidadeDeBlumenau.somaFrutas();
			unidade = "Blumenau";

		} else if (unidadeDeJoinville.somaFrutas() > unidadeDeBlumenau.somaFrutas()
				&& unidadeDeJoinville.somaFrutas() > unidadeDeFlorianopolis.somaFrutas()) {
			maiorLucroFrutas = unidadeDeJoinville.somaFrutas();
			unidade = "Joinville";

		} else if (unidadeDeFlorianopolis.somaFrutas() > unidadeDeBlumenau.somaFrutas()
				&& unidadeDeFlorianopolis.somaFrutas() > unidadeDeJoinville.somaFrutas()) {
			maiorLucroFrutas = unidadeDeFlorianopolis.somaFrutas();
			unidade = "Florianópolis";

		}

		System.out.println("A loja com maior lucro total foi a de " + unidade + " com lucro de " + maiorLucroFrutas);

		// d) Qual das lojas teve o menor lucro?
		if (unidadeDeBlumenau.somaFrutas() < unidadeDeJoinville.somaFrutas()
				&& unidadeDeBlumenau.somaFrutas() < unidadeDeFlorianopolis.somaFrutas()) {
			menorLucroFrutas = unidadeDeBlumenau.somaFrutas();
			unidade = "Blumenau";

		} else if (unidadeDeJoinville.somaFrutas() < unidadeDeBlumenau.somaFrutas()
				&& unidadeDeJoinville.somaFrutas() < unidadeDeFlorianopolis.somaFrutas()) {
			menorLucroFrutas = unidadeDeJoinville.somaFrutas();
			unidade = "Joinville";

		} else if (unidadeDeFlorianopolis.somaFrutas() < unidadeDeBlumenau.somaFrutas()
				&& unidadeDeFlorianopolis.somaFrutas() < unidadeDeJoinville.somaFrutas()) {
			menorLucroFrutas = unidadeDeFlorianopolis.somaFrutas();
			unidade = "Florianópolis";

		}

		System.out.println("A loja com menor lucro total foi a de " + unidade + " com lucro de " + menorLucroFrutas);

		// e) Qual das lojas ficou no "meio" em termos de lucro?
		mercado vetor[] = new mercado[3];
		vetor[0] = unidadeDeBlumenau;
		vetor[1] = unidadeDeJoinville;
		vetor[2] = unidadeDeFlorianopolis;

		for (int i = 0; i < vetor.length; i++) {

		}

	}
}
