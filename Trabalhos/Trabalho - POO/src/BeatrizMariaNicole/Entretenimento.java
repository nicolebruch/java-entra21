package BeatrizMariaNicole;

//filhota
public class Entretenimento extends Reserva {

	// atributos
	private boolean acessoPiscina;
	private boolean acessoCassino;
	private boolean acessoShow;
	private String estiloShow;

	// metodo constructor herdando atributos da classe pai
	public Entretenimento(String nomePassageiro, String formaPagamento, int idade, int quantidadePassageiro,
			double precoPassagem, Cruzeiro cruzeiro, String tipoCabine, boolean acessoPiscina, boolean acessoCassino,
			boolean acessoShow, String estiloShow) {
		super(nomePassageiro, formaPagamento, idade, quantidadePassageiro, precoPassagem, cruzeiro, tipoCabine);

		// set dos atributos criados so p classe de entretenimento
		setAcessoPiscina(acessoPiscina);
		setAcessoShow(acessoShow);
		setEstiloShow(estiloShow);
		setAcessoCassino(acessoCassino);
	}

	public boolean isAcessoPiscina() {
		return acessoPiscina;
	}

	// so pode entrar na piscina se tiver mais de 7 anos de idade
	public void setAcessoPiscina(boolean acessoPiscina) {
		if (getIdade() > 7) {
			this.acessoPiscina = acessoPiscina;
		} else {
			throw new IllegalArgumentException("Idade inferior a 8 anos. Acesso à piscina não permitido."); // nao pode
																											// *seguranca*
		}
	}

	public boolean isAcessoCassino() {
		return acessoCassino;
	}

	// so pode ir p cassino se tiver mais de 18 anos
	public void setAcessoCassino(boolean acessoCassino) {
		if (getIdade() > 18) {
			this.acessoCassino = acessoCassino;
		} else {
			throw new IllegalArgumentException("Idade inferior a 18 anos. Acesso ao cassino não permitido.");
		}
	}

	public boolean isAcessoShow() {
		return acessoShow;
	}

	// nao pode ir em shows do navio se for menor de 16 anos
	public void setAcessoShow(boolean acessoShow) {
		if (getIdade() > 16) {
			this.acessoShow = acessoShow;
		} else {
			throw new IllegalArgumentException("Idade inferior a 16 anos. Acesso ao show não permitido.");
		}
	}

	public String getEstiloShow() {
		return estiloShow;
	}

	// estilo musical do show que a pessoa vai frequentar
	public void setEstiloShow(String estiloShow) {
		if (estiloShow.equalsIgnoreCase("Rock") || estiloShow.equalsIgnoreCase("Pop")
				|| estiloShow.equalsIgnoreCase("Funk") || estiloShow.equalsIgnoreCase("Sertanejo")
				|| estiloShow.equalsIgnoreCase("Pagode") || estiloShow.equalsIgnoreCase("Samba")
				|| estiloShow.equalsIgnoreCase("Trap") || estiloShow.equalsIgnoreCase("Rap")
				|| estiloShow.equalsIgnoreCase("Reggae") || estiloShow.equalsIgnoreCase("Metal")) {
			this.estiloShow = estiloShow;
		} else {
			throw new IllegalArgumentException("Estilo de show inválido");
		}
	}

	// o metodo abstrato herdado da classe pai
	public double diaria() {

		int dias = 14;
		switch (getTipoCabine()) {
		case "Cabine Interna":
			return 550 * dias;
		case "Cabine Externa com Varanda":
			return 1100 * dias;
		case "Suite":
			return 2000 * dias;
		default:
			throw new IllegalArgumentException("Tipo de cabine inválido.");
		}
	}

	// metodo herdado da classe pai
	public double calcularPrecoTotalPassagem() {
		return getPrecoPassagem() + diaria();
	}

	// metodo void p/ propria classe cabine, mostrando no console o que o passageiro
	// pode frequentar com base nas validacoes de cada entretenimento
	public void exibirAcessosEntretenimento() {
		System.out.println("Pode ir para shows: " + isAcessoShow());
		System.out.println("Pode ir para o cassino: " + isAcessoCassino());
		System.out.println("Pode ir para a piscina: " + isAcessoPiscina());

	}

	@Override
	public String toString() {
		return "Entretenimento [acessoPiscina=" + acessoPiscina + ", acessoCassino=" + acessoCassino + ", acessoShow="
				+ acessoShow + ", estiloShow=" + estiloShow + "]";
	}

}