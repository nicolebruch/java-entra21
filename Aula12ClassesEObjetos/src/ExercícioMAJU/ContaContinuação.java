package ExercícioMAJU;

public class ContaContinuação {

	public static void main(String[] args) {

		Conta minhaConta = new Conta(1300, "Nicole", 98450);

		System.out.println("Saldo: " + minhaConta.getSaldo());
		System.out.println("Proprietário: " + minhaConta.getProprietario());
		System.out.println("ID da Conta: " + minhaConta.getIdConta());
	}

}