package BeatrizMariaNicole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		// instaciando os 2 objetos que quero adicionar no atributo --> cruzeiro
		Cruzeiro reserva01 = new Cruzeiro(LocalDate.of(2023, 12, 05), LocalDate.of(2023, 12, 19), "Rio de Janeiro",
				"Rio de Janeiro", "America do Sul", "Costa Pacifica");
		Cruzeiro reserva02 = new Cruzeiro(LocalDate.of(2024, 01, 10), LocalDate.of(2024, 01, 24), "Dubai", "Dubai",
				"Emirados Arabes", "Costa Smeralda");

		// essa lista armazena objetos do tipo da classe Reserva e sua classes filhas
		// lista de passageiros
		List<Reserva> passageiros = new ArrayList<>();

		// instancia chamada cabine que sera da reserva da cabine do roberto
		Cabine cabineReserva01 = new Cabine("Roberto", "Pix", 67, 1, 7000, reserva01, "Cabine Externa com Varanda",
				false);
		// reserva de cabine para a passageira ana
		Cabine cabineReserva02 = new Cabine("Ana", "Debito", 22, 3, 15000, reserva02, "Suite", true);

		// add a instancia chamada "cabineReserva01" e "cabineReserva02" na lista de
		// passageiros
		passageiros.add(cabineReserva01);
		passageiros.add(cabineReserva02);

		// outra instancia criada da classe entretenimento
		// add a lista de passageiros
		// reserva de entretenimento para o passageiro "Roberto"
		passageiros.add(new Entretenimento("Roberto", "Pix", 67, 1, 7000, reserva01, "Cabine Externa com Varanda", true,
				true, true, "reggae"));

		// reserva de entretenimento para a passageira "Ana"
		passageiros.add(new Entretenimento("Ana", "Debito", 22, 3, 15000, reserva02, "Suite", true, true, true, "pop"));

		// mostro as informacoes dos passageiros
		// loop q percorre a lista passageiros onde os elementos sao do tipo Reserva
		for (Reserva passageiro : passageiros) {
			System.out.println("------------INFORMAÇÕES DA RESERVA-----------------");
			System.out.println("");
			System.out.println("Nome: " + passageiro.getNomePassageiro());
			System.out.println("Idade: " + passageiro.getIdade());
			System.out.println("Quantidade de passagens: " + passageiro.getQuantidadePassageiro());
			System.out.println("Preço da passagem: " + passageiro.getPrecoPassagem());
			System.out.println();
			System.out.println("------------INFORMAÇÕES DA VIAGEM-----------------");
			System.out.println("");
			System.out.println(passageiro.getCruzeiro());

			// verifica se passageiro é instancia de entretenimento
			// se for, converte passageiro p/ --> tipo entretenimento e chama o metodo
			if (passageiro instanceof Entretenimento) {
				Entretenimento entretenimento = (Entretenimento) passageiro;
				System.out.println("");
				System.out.println("-------------------ACESSOS----------------------");
				System.out.println("");
				entretenimento.exibirAcessosEntretenimento(); // metodo da classe filha entretenimento
			}

			// verifica se o passageiro é uma instancia da cabine
			// se for, converte passageiro p/ --> tipo cabine e chama o metodo
			// imprime informacoes q tem "cabine."
			if (passageiro instanceof Cabine) {
				Cabine cabine = (Cabine) passageiro;

				System.out.println("");
				System.out.println("------------INFORMAÇÕES DA CABINE-----------------");
				System.out.println("");
				////////////////////////////////////////////// cabine.
				System.out.println("Reserva no nome: " + cabine.getNomePassageiro());
				/////////////////////////////////////// cabine.
				System.out.println("Tipo de Cabine: " + cabine.getTipoCabine());
				cabine.exibirBanheiroPrivativo(); // metodo da classe filha cabine
				////////////////////////////////////////////////// cabine.
				System.out.println("Valor da diária da cabine: " + cabine.diaria());
				//////////////////////////////////////// cabine.
				System.out.println("Preço Total: R$ " + cabine.calcularPrecoTotalPassagem());
				//////////////////////////////////////////// cabine.
				System.out.println("Forma de Pagamento: " + cabine.getFormaPagamento());

			}

			System.out.println("==========================================================");
		}

	}
}