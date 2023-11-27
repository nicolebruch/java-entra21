package OrientaçãoAObjetos;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	/*
	 * Implemente um sistema para realizar a consulta de contas bancárias de um
	 * determinado banco. Para testar o sistema, pede-se o armazenamento do seguinte
	 * conjunto de contas bancárias. Cada conta bancária possui as informações
	 * abaixo:
	 */

	/*
	 * Imprima: a) Informações do cliente com mais dinheiro no banco b) Informações
	 * do cliente mais antigo de um dado gerente c) Listar as informações de todos
	 * os clientes de um dado gerente d) Informar quantos clientes um dado gerente
	 * tem
	 */

	private String nome;
	private String categoria;
	private int anoCadastro;
	private int saldo;
	private String gerente;

	public static List<Banco> contaBancaria = new ArrayList<>();

	public Banco(String nome, String categoria, int anoCadastro, int saldo, String gerente) {

		setNome(nome);
		setCategoria(categoria);
		setAnoCadastro(anoCadastro);
		setSaldo(saldo);
		setGerente(gerente);
		contaBancaria.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			throw new IllegalArgumentException("Nome inválido.");

		} else {
			this.nome = nome;
		}
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if (categoria == null) {
			throw new IllegalArgumentException("Categoria inválida.");

		} else {
			this.categoria = categoria;
		}
	}

	public int getAnoCadastro() {
		return anoCadastro;
	}

	public void setAnoCadastro(int anoCadastro) {
		if (anoCadastro <= 0) {
			throw new IllegalArgumentException("Ano de cadastro inválido");
		} else {
			this.anoCadastro = anoCadastro;
		}
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		if (saldo <= 0) {
			throw new IllegalArgumentException("Saldo inválido");
		} else {
			this.saldo = saldo;
		}
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		if (gerente == null) {
			throw new IllegalArgumentException("Gerente inválido.");

		} else {
			this.gerente = gerente;
		}

	}

	@Override
	public String toString() {
		return  this.nome + " com a categoria " + this.categoria + " e com o saldo " + this.saldo;
	}
}
