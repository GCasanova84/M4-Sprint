package cl.grupocinco.sprint.model.usuarios;

import cl.grupocinco.sprint.model.Asesoria;

public class Profesional extends Usuario implements Asesoria {

	private String titulo;
	private String fechaIngreso;

	public Profesional() {
		super();
	}

	public Profesional(String nombre, String fechaNacimiento, String run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public Profesional(String titulo, String fechaIngreso) {
		super();
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesional [titulo=").append(titulo).append(", fechaIngreso=").append(fechaIngreso)
				.append("]");
		return builder.toString();
	}

	public String analizarUsuario() {
		return super.analizarUsuario() + "\nTítulo: " + titulo + "\nFecha de ingreso: " + fechaIngreso;
	}
	
	public String analizarUsuario(Boolean soloPadre) {
		if (soloPadre) {
			return super.analizarUsuario();
		} else {
			return this.analizarUsuario();
		}		
	}
}
