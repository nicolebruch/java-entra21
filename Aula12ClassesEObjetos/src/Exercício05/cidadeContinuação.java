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

public class cidadeContinuação {

	public static void main(String[] args) {

		// nao sei a populacao feminina de gaspar
		// "false" pq nao foi calculado, seja lá oq o programador queria calcular
		cidade Gaspar = new cidade("Gaspar", "SC", 28141, 0, false);
		// nao sei a populacao masculina de indaial
		cidade Indaial = new cidade("Indaial", "SC", 0, 25844, true);

		// gaspar
		System.out.println("Informações de Gaspar:");
		System.out.println("Nome: " + Gaspar.getNome());
		System.out.println("UF: " + Gaspar.getUf());
		System.out.println("População Masculina: " + Gaspar.getPopulacaoMasculina());
		System.out.println("População Feminina: " + Gaspar.getPopulacaoFeminina());
		System.out.println("Calculado: " + Gaspar.isCalculado());
		System.out.println();

		// indaial
		System.out.println("Informações de Indaial:");
		System.out.println("Nome: " + Indaial.getNome());
		System.out.println("UF: " + Indaial.getUf());
		System.out.println("População Masculina: " + Indaial.getPopulacaoMasculina());
		System.out.println("População Feminina: " + Indaial.getPopulacaoFeminina());
		System.out.println("Calculado: " + Indaial.isCalculado());
	}

}
