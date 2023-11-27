package Exercício05;

//O código a seguir foi escrito por um programador descuidado que, após tê-lo escrito, perdeu o código original da classe Cidade.
//Verifique o trecho de código abaixo, e escreva qual seria o código necessário da classe.

//Cidade gaspar = new Cidade();
//gaspar.nome( "Gaspar" );
//gaspar.uf( "SC" );
//gaspar.populacaoMasculina( 28141 );

//Cidade indaial = new Cidade();
//indaial.nome( "Indaial" );
//indaial.populacaoFeminina( 25844 );
//indaial.calculado( true );

public class cidade {

	private String nome;
	private String uf;
	private int populacaoMasculina;
	private int populacaoFeminina;
	private boolean calculado;

	public cidade(String nome, String uf, int populacaoMasculina, int populacaoFeminina, boolean calculado) {
		setNome(nome);
		setUf(uf);
		setPopulacaoMasculina(populacaoMasculina);
		setPopulacaoFeminina(populacaoFeminina);
		setCalculado(calculado);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank() || nome == null) {
			throw new IllegalArgumentException("Nome inválido");
		} else {
			this.nome = nome;
		}

	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf.isBlank() || uf == null) {
			throw new IllegalArgumentException("UF inválido.");
		} else {
			this.uf = uf;
		}

	}

	public int getPopulacaoMasculina() {
		return populacaoMasculina;
	}

	public void setPopulacaoMasculina(int populacaoMasculina) {
		if (populacaoMasculina >= 0) {
			this.populacaoMasculina = populacaoMasculina;
		} else {
			System.out.println("População masculina inválida.");
		}
	}

	public int getPopulacaoFeminina() {
		return populacaoFeminina;
	}

	public void setPopulacaoFeminina(int populacaoFeminina) {
		if (populacaoFeminina >= 0) {
			this.populacaoFeminina = populacaoFeminina;
		} else {
			System.out.println("População feminina inválida.");
		}
	}

	public boolean isCalculado() {
		return calculado;
	}

	public void setCalculado(boolean calculado) {
		this.calculado = calculado;
	}
}
