package cl.grupocinco.sprint.model.eventos;

public class VisitaTerreno {
	
	private int identificadorVisita;
	private String rut;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;

	public VisitaTerreno() {
	}

	public VisitaTerreno(int identificadorVisita, String rut, String dia, String hora, String lugar,
			String comentarios) {
		this.identificadorVisita = identificadorVisita;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	public int getIdentificadorVisita() {
		return identificadorVisita;
	}

	public void setIdentificadorVisita(int identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VisitaTerreno [identificadorVisita=").append(identificadorVisita).append(", rut=").append(rut)
				.append(", dia=").append(dia).append(", hora=").append(hora).append(", lugar=").append(lugar)
				.append(", comentarios=").append(comentarios).append("]");
		return builder.toString();
	}

}
