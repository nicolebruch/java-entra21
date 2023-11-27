package BeatrizMariaNicole;

// classe abstrata paizao
public abstract class Reserva {

	// atributos
	private String nomePassageiro;
	private String formaPagamento;
	private int idade;
	private int quantidadePassageiro;
	private double precoPassagem;
	private Cruzeiro cruzeiro; //a classe de relacionamento como um atributo p de fato conseguir se relacionar 
	private String tipoCabine;

	// metodo constructor
	public Reserva(String nomePassageiro, String formaPagamento, int idade, int quantidadePassageiro,
			double precoPassagem, Cruzeiro cruzeiro, String tipoCabine) {

		// setts
		setNomePassageiro(nomePassageiro);
		setFormaPagamento(formaPagamento);
		setIdade(idade);
		setQuantidadePassageiro(quantidadePassageiro);
		setPrecoPassagem(precoPassagem);
		setTipoCabine(tipoCabine);
		setCruzeiro(cruzeiro);

	}

	public String getNomePassageiro() {
		return nomePassageiro;
	}

	// nao pode ficar nulo/em branco o nome
	public void setNomePassageiro(String nomePassageiro) {
		if (nomePassageiro.isBlank() || nomePassageiro == null) {
			throw new IllegalArgumentException("Nome do passageiro inválido");
		} else {
			this.nomePassageiro = nomePassageiro;
		}
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	// so pode ser pago por alguma dessas 3 formas, se colocar outra, da erro
	// vai considerar a resposta mesmo c a escrita maiuscula ou minuscula
	public void setFormaPagamento(String formaPagamento) {
		if (formaPagamento.equalsIgnoreCase("Debito") || formaPagamento.equalsIgnoreCase("Credito")
				|| formaPagamento.equalsIgnoreCase("Pix")) {
			this.formaPagamento = formaPagamento;
		} else {
			throw new IllegalArgumentException("Tipo de pagamento inválido");
		}
	}

	public int getIdade() {
		return idade;
	}

	public Cruzeiro getCruzeiro() {
		return cruzeiro;
	}

	public void setCruzeiro(Cruzeiro cruzeiro) {
		this.cruzeiro = cruzeiro;
	}

	public String getTipoCabine() {
		return tipoCabine;
	}

	// valido pois so pode escrever uma das 3 opcoes
	// ele considera a resposta mesmo sendo escrita c letra maiuscula ou minuscula
	public void setTipoCabine(String tipoCabine) {
		if (tipoCabine.equalsIgnoreCase("Cabine Interna") || tipoCabine.equalsIgnoreCase("Cabine Externa com Varanda")
				|| tipoCabine.equalsIgnoreCase("Suite")) {
			this.tipoCabine = tipoCabine;
		} else {
			throw new IllegalArgumentException("Cabine inválida");
		}
	}

	// nao pode ser zero a idade
	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		} else {
			throw new IllegalArgumentException("Idade do passageiro inválida.");
		}
	}

	public int getQuantidadePassageiro() {
		return quantidadePassageiro;
	}

	// nao pode ter zero passageiros
	public void setQuantidadePassageiro(int quantidadePassageiro) {
		if (quantidadePassageiro >= 0) {
			this.quantidadePassageiro = quantidadePassageiro;
		} else {
			throw new IllegalArgumentException("Quantidade de passageiro inválida.");
		}
	}

	public double getPrecoPassagem() {
		return precoPassagem;
	}

	// preco nao pode ser zero
	public void setPrecoPassagem(double precoPassagem) {
		precoPassagem = precoPassagem * getQuantidadePassageiro(); // o preco da passagem multiplica pela quantidade de
																	// passagens q a pessoa comprou p eu conseguir
		// nao pode ser 0 o preco // calcular o preco verdadeiro da reserva
		if (precoPassagem > 0) {
			this.precoPassagem = precoPassagem;
		} else {
			throw new IllegalArgumentException("Preço da passagem inválido.");
		}
	}

	// metodos abstratos p/ classes filhas herdarem
	public abstract double diaria();

	public abstract double calcularPrecoTotalPassagem();

	@Override
	public String toString() {
		return "Reserva [nomePassageiro=" + nomePassageiro + ", formaPagamento=" + formaPagamento + ", idade=" + idade
				+ ", quantidadePassageiro=" + quantidadePassageiro + ", precoPassagem=" + precoPassagem + ", cruzeiro="
				+ cruzeiro + ", tipoCabine=" + tipoCabine + "]";
	}
}