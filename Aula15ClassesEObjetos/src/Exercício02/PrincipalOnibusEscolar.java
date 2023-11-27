package Exercício02;

public class PrincipalOnibusEscolar {

	public static void main(String[] args) {

		// Faça uma classe chamada OnibusEscolar, com os atributos estudantes e
		// professor

		// Faça uma exceção no método setAlunos que se o número de alunos for maior do
		// que 40, faça com que o número de alunos seja 40

		// Caso o número de professores for 0, o número de alunos também deve ser zerado

		// Faça também um método chamado remover alunos, que deverá remover os alunos de
		// acordo com o valor passado como parâmetro

		OnibusEscolar onibus = new OnibusEscolar(40, 1);

		int valor = 3;
		
		onibus.removerAlunos(valor);

		System.out.println(onibus);

	}

}
