package cl.grupocinco.sprint.model.eventos;

public class Revision {
	
	private int identificadorRevision;
	private int identificadorVisita;
	private String nombreRevision;
	private String detalleRevisar;
	private int estado;

	public Revision() {
	}

	public Revision(int identificadorRevision, int identificadorVisita, String nombreRevision, String detalleRevisar,
			int estado) {
		this.identificadorRevision = identificadorRevision;
		this.identificadorVisita = identificadorVisita;
		this.nombreRevision = nombreRevision;
		this.detalleRevisar = detalleRevisar;
		this.estado = estado;
	}

	public int getIdentificadorRevision() {
		return identificadorRevision;
	}

	public void setIdentificadorRevision(int identificadorRevision) {
		this.identificadorRevision = identificadorRevision;
	}

	public int getIdentificadorVisita() {
		return identificadorVisita;
	}

	public void setIdentificadorVisita(int identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalleRevisar() {
		return detalleRevisar;
	}

	public void setDetalleRevisar(String detalleRevisar) {
		this.detalleRevisar = detalleRevisar;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revision [identificadorRevision=").append(identificadorRevision)
				.append(", identificadorVisita=").append(identificadorVisita).append(", nombreRevision=")
				.append(nombreRevision).append(", detalleRevisar=").append(detalleRevisar).append(", estado=")
				.append(estado).append("]");
		return builder.toString();
	}
	
}
