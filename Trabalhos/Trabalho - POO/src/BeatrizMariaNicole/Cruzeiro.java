package BeatrizMariaNicole;

import java.time.LocalDate;

//classe relacionamento

public class Cruzeiro {

	// atributos
	private LocalDate embarcar;
	private LocalDate desembarcar;
	private String localEmbarque;
	private String localDesembarque;
	private String destino;
	private String nomeNavio;

	// metodo constructor
	public Cruzeiro(LocalDate embarcar, LocalDate desembarcar, String localEmbarque, String localDesembarque,
			String destino, String nomeNavio) {

		// sets
		setEmbarcar(embarcar);
		setDesembarcar(desembarcar);
		setLocalEmbarque(localEmbarque);
		setLocalDesembarque(localDesembarque);
		setDestino(destino);
		setNomeNavio(nomeNavio);
	}

	public LocalDate getEmbarcar() {
		return embarcar;
	}

	// nao pode ficar sem resposta
	public void setEmbarcar(LocalDate embarcar) {
		if (embarcar == null) {
			throw new IllegalArgumentException("Data de embarque inválido");
		} else {
			this.embarcar = embarcar;
		}
	}

	public LocalDate getDesembarcar() {
		return desembarcar;
	}

	// nao pode ficar sem resposta
	public void setDesembarcar(LocalDate desembarcar) {
		if (desembarcar == null) {
			throw new IllegalArgumentException("Data de desembarque inválido");
		} else {
			this.desembarcar = desembarcar;
		}
	}

	public String getLocalEmbarque() {
		return localEmbarque;
	}

	// so pode ser esses enderecos pro embarque
	public void setLocalEmbarque(String localEmbarque) {
		if (localEmbarque.equalsIgnoreCase("Santo Domingo") || localEmbarque.equalsIgnoreCase("Dubai")
				|| localEmbarque.equalsIgnoreCase("Rio de Janeiro") || localEmbarque.equalsIgnoreCase("Barcelona")) {
			this.localEmbarque = localEmbarque;
		} else {
			throw new IllegalArgumentException("Local de embarque inválido");
		}

	}

	public String getLocalDesembarque() {
		return localDesembarque;
	}

	// so pode ser esses enderecos pro dsembarque
	public void setLocalDesembarque(String localDesembarque) {
		if (localDesembarque.equalsIgnoreCase("Santo Domingo") || localDesembarque.equalsIgnoreCase("Dubai")
				|| localDesembarque.equalsIgnoreCase("Rio de Janeiro")
				|| localDesembarque.equalsIgnoreCase("Barcelona")) {
			this.localDesembarque = localDesembarque;
		} else {
			throw new IllegalArgumentException("Local de desembarque inválido");
		}
	}

	public String getDestino() {
		return destino;
	}

	// so pode ser esses enderecos pro destino
	public void setDestino(String destino) {
		if (destino.equalsIgnoreCase("Caribe") || destino.equalsIgnoreCase("Emirados Arabes")
				|| destino.equalsIgnoreCase("America do Sul") || destino.equalsIgnoreCase("Mediterraneo")) {
			this.destino = destino;
		} else {
			throw new IllegalArgumentException("Tipo de destino inválido");
		}
	}

	public String getNomeNavio() {
		return nomeNavio;
	}

	// so pode ser esses nomes de navio que o passageiro vai estar abordo
	public void setNomeNavio(String nomeNavio) {
		if (nomeNavio.equalsIgnoreCase("Costa Smeralda") || nomeNavio.equalsIgnoreCase("Costa Firenze")
				|| nomeNavio.equalsIgnoreCase("Costa Toscana") || nomeNavio.equalsIgnoreCase("Costa Pacifica")) {
			this.nomeNavio = nomeNavio;
		} else {
			throw new IllegalArgumentException("Nome de navio inválido");
		}
	}

	@Override
	// toString p/ aparecer no console as informacoes da viagem
	public String toString() {
		return "[Data de Embarque:" + embarcar + "]" + " [Data de Desembarque:" + desembarcar + "]"
				+ " [Local de Embarque:" + localEmbarque + "]" + " [Local de Desembarque: " + localDesembarque + "]"
				+ " [Destino: " + destino + "]" + " [Nome do navio=" + nomeNavio + "]";
	}
}