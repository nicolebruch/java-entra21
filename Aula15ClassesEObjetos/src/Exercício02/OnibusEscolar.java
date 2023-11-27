package Exercício02;

public class OnibusEscolar {

//Faça uma classe chamada OnibusEscolar, com os atributos estudantes e professor ok
//Faça também um método chamado remover alunos, que deverá remover os alunos de acordo com o valor passado como parâmetro

	private int estudantes;
	private int professor;

	public OnibusEscolar(int estudantes, int professor) {
		setEstudantes(estudantes);
		setProfessor(professor);
	}

	public int getEstudantes() {
		return estudantes;
	}

//Faça uma exceção no método setAlunos que se o número de alunos for maior do que 40, faça com que o número de alunos seja 40 ok
	public void setEstudantes(int estudantes) {
		if (estudantes > 40) {
			this.estudantes = 40;
		} else {
			this.estudantes = estudantes;
		}
	}

	public int getProfessor() {
		return professor;
	}

//Caso o número de professores for 0, o número de alunos também deve ser zerado
	public void setProfessor(int professor) {
		if (professor == 0) {
			this.setEstudantes(0);
		}
		this.professor = professor;

	}

	public void removerAlunos(int valor) {
		setEstudantes(this.estudantes - valor);

	}

	@Override
	public String toString() {
		return "OnibusEscolar [estudantes=" + estudantes + ", professor=" + professor + "]";
	}

}
