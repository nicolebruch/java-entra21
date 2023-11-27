package OrientaçãoAObjetos;

import java.util.Scanner;

public class PrincipalBanco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Implemente um sistema para realizar a consulta de contas bancárias de um
		 * determinado banco. Para testar o sistema, pede-se o armazenamento do seguinte
		 * conjunto de contas bancárias. Cada conta bancária possui as informações
		 * abaixo:
		 */

		/*
		 * Imprima: a) Informações do cliente com mais dinheiro no banco b) Informações
		 * do cliente mais antigo de um dado gerente c) Listar as informações de todos
		 * os clientes de um dado gerente d) Informar quantos clientes um dado gerente
		 * tem
		 */

		Banco consulta1 = new Banco("Jorge", "Private", 2022, 2500000, "Ana");
		Banco consulta2 = new Banco("Luís", "Stilo", 2015, 500000, "Ana");
		Banco consulta3 = new Banco("Claúdio", "Exclusive", 2017, 250000, "Marina");
		Banco consulta4 = new Banco("Bruna", "Prime", 2005, 5500000, "Paulo");
		Banco consulta5 = new Banco("Ana", "Exclusive", 2023, 240000, "Paulo");

		System.out.println("Informe o nome dos gerentes.");
		String gerente1 = scan.next();
		String gerente2 = scan.next();
		String gerente3 = scan.next();

		System.out.println("Clientes do gerente 2: ");

		// variáveisAuxiliares
		Banco nomeClienteRico = null;
		Banco clienteAntigo = null;
		int dadoAntigo = Integer.MAX_VALUE;
		int saldoMaior = Integer.MIN_VALUE;
		int contador = 0;

		for (Banco c : Banco.contaBancaria) {
			// a) Informações do cliente com mais dinheiro no banco
			if (c.getSaldo() > saldoMaior) {
				saldoMaior = c.getSaldo();
				nomeClienteRico = c;

				// equals compara apenas String, igualando os objetos
			}

			// b) Informações do cliente mais antigo de um dado gerente
			if (c.getGerente().equalsIgnoreCase(gerente1) && c.getAnoCadastro() < dadoAntigo) {
				dadoAntigo = c.getAnoCadastro();
				clienteAntigo = c;

			}
			// c) Listar as informações de todos os clientes de um dado gerente
			if (c.getGerente().equalsIgnoreCase(gerente2)) {
				System.out.println(c);
			}
			// d) Informar quantos clientes um dado gerente tem
			if (c.getGerente().equalsIgnoreCase(gerente3)) {
				contador++;
			}

			System.out.println("Cliente mais rico: " + nomeClienteRico.toString());
			System.out.println("Cliente mais antigo: " + clienteAntigo.toString());
			System.out.println("Numero de clientes do gerente 3: " + contador);
		}

	}
}
