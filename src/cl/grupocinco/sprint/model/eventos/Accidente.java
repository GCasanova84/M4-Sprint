package cl.grupocinco.sprint.model.eventos;

public class Accidente {
	
	private int identificadorAccidente;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;

	public Accidente() {
	}

	public Accidente(int identificadorAccidente, String rutCliente, String dia, String hora, String lugar,
			String origen, String consecuencias) {
		this.identificadorAccidente = identificadorAccidente;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	public int getIdentificadorAccidente() {
		return identificadorAccidente;
	}

	public void setIdentificadorAccidente(int identificadorAccidente) {
		this.identificadorAccidente = identificadorAccidente;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Accidente [identificadorAccidente=").append(identificadorAccidente).append(", rutCliente=")
				.append(rutCliente).append(", dia=").append(dia).append(", hora=").append(hora).append(", lugar=")
				.append(lugar).append(", origen=").append(origen).append(", consecuencias=").append(consecuencias)
				.append("]");
		return builder.toString();
	}
	
}
