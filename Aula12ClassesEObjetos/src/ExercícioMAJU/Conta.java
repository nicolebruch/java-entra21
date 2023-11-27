package ExercícioMAJU;

public class Conta {
	private double saldo;
	private String proprietario;
	private int idConta;

	public Conta(double saldo, String proprietario, int idConta) {
		setSaldo(saldo);
		setProprietario(proprietario);
		setIdConta(idConta);
	}

	// Getters e Setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0) {
			throw new IllegalArgumentException("Saldo não pode ser negativo.");
		}
		this.saldo = saldo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		if (proprietario == null || proprietario.isBlank()) {
			throw new IllegalArgumentException("Proprietário inválido.");
		}
		this.proprietario = proprietario;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		if (idConta <= 0) {
			throw new IllegalArgumentException("ID da conta inválido.");
		}
		this.idConta = idConta;
	}
}

// 	Crie uma classe chamada "conta" e defina os atributos
// double saldo;
// String proprietario;
// int idConta;