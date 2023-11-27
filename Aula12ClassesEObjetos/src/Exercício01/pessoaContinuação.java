package Exercício01;

public class pessoaContinuação {

	public static void main(String[] args) {

		pessoa um = new pessoa();
		pessoa dois = new pessoa();

		um.nome = "Nicole";
		um.sexo = 'F';
		um.data = "04/05/2007";
		um.estadoCivil = "Solteira";
		dois.nome = "Sara";
		dois.sexo = 'F';
		dois.data = "16/01/2003";
		dois.estadoCivil = "Enrolada";

		System.out.println("Informações pessoais da primeira pessoa: " + um.nome + " " + um.sexo + " " + um.data + " "
				+ um.estadoCivil);
		System.out.println("Informações pessoais da segunda pessoa: " + dois.nome + " " + dois.sexo + " " + dois.data
				+ " " + dois.estadoCivil);
	}

}
