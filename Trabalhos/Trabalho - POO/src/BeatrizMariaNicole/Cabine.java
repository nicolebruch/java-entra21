package BeatrizMariaNicole;

//filhota
public class Cabine extends Reserva {

	// atributo
	private boolean banheiroPrivativo;

	// metodo constructor que herda os atributos
	public Cabine(String nomePassageiro, String formaPagamento, int idade, int quantidadePassageiro,
			double precoPassagem, Cruzeiro cruzeiro, String tipoCabine, boolean banheiroPrivativo) {
		super(nomePassageiro, formaPagamento, idade, quantidadePassageiro, precoPassagem, cruzeiro, tipoCabine);

		// set do atributo novo q criei especialmente pra classe cabine
		setBanheirosprivativos(banheiroPrivativo);
	}

	// metodo herdado da classe pai
	public double diaria() {

		int dias = 14; // quantidade de dias abordo do navio estabelecida pela "empresa" de todos os
						// navios
		switch (getTipoCabine()) { // tipoCabine puxado da classe pai onde vai ter as opcoes das cabines
		case "Cabine Interna":
			return 550 * dias; // valor da diaria sendo multiplicado pelos dias (14 dias)

		case "Cabine Externa com Varanda":
			return 1100 * dias; // valor da diaria sendo multiplicado pelos dias (14 dias)

		case "Suite":
			return 2000 * dias; // valor da diaria sendo multiplicado pelos dias (14 dias)

		default:
			throw new IllegalArgumentException("Tipo de cabine inválido."); // se nao for digitado alguma das 3 opcoes
		}
	}

	// metodo herdado da classe pai
	public double calcularPrecoTotalPassagem() {

		return getPrecoPassagem() + diaria(); // vai pegar o preco da passagem que sera dito na principal e somar com o
												// valor da diaria
	}

	public boolean isBanheiroPrivativo() {
		return banheiroPrivativo;
	}

	// validacao que so tem banheiro privativo o tipo de cabine "suite" e o tipo de
	// cabine "cabine externa com varanda"
	public void setBanheirosprivativos(boolean banheirosprivativos) {
		if (getTipoCabine() == "Suite"
				|| (getTipoCabine() == "Suite" || getTipoCabine() == "Cabine Externa com Varanda")) {
			this.banheiroPrivativo = banheirosprivativos;
		} else {
			throw new IllegalArgumentException("Cabine não possui banheiro privativo."); // se nao for escrito "cabine
																							// interna", significa que
																							// nao tem banheiro
																							// privativo
		}
	}

	// metodo void da propria classe cabine p mostrar se tem banheiro privativo da
	// cabine que foi escolhida
	public void exibirBanheiroPrivativo() {
		System.out.println("Possui banheiro Privativo: " + isBanheiroPrivativo());
	}

	@Override
	public String toString() {
		return "Cabine [banheiroPrivativo=" + banheiroPrivativo + "]";
	}

}
