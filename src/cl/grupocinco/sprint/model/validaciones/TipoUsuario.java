package cl.grupocinco.sprint.model.validaciones;

import java.util.Arrays;

public class TipoUsuario implements Validador {

	public Boolean validarEntrada(String entrada) {
		String[] tipo = new String[] { "Cliente", "Profesional", "Administrativo" };
		if (entrada == null || entrada.isEmpty())
			return false;
		return Arrays.asList(tipo).contains(entrada.substring(0, 1).toUpperCase() + entrada.substring(1));
	}

	public Boolean validarEntrada(String entrada, int max) {
		return null;
	}

	public Boolean validarEntrada(String entrada, int max, int min) {
		return null;
	}

	public Boolean validarEntrada(String entrada, int max, int min, Boolean soloLetras) {
		return null;
	}

}
