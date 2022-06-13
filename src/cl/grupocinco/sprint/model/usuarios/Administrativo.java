package cl.grupocinco.sprint.model.usuarios;

import cl.grupocinco.sprint.model.Asesoria;

public class Administrativo extends Usuario implements Asesoria {

	private String area;
	private String experienciaPrevia;

	public Administrativo() {
		super();
	}

	public Administrativo(String nombre, String fechaNacimiento, String run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public Administrativo(String area, String experienciaPrevia) {
		super();
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Administrativo [area=").append(area).append(", experienciaPrevia=").append(experienciaPrevia)
				.append("]");
		return builder.toString();
	}

	public String analizarUsuario() {
		return super.analizarUsuario() + "\nÁrea: " + area + "\nExperiencia previa: " + experienciaPrevia;
	}
	
	public String analizarUsuario(Boolean soloPadre) {
		if (soloPadre) {
			return super.analizarUsuario();
		} else {
			return this.analizarUsuario();
		}		
	}

}
