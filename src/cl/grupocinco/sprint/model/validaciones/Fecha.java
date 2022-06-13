package cl.grupocinco.sprint.model.validaciones;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Fecha implements Validador {
	
	public Boolean validarEntrada(String entrada) {
		if (entrada == null || entrada.isEmpty()) {
			return false;
		}
		String entradaFormateada = formatearFecha(entrada);
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			sdf.parse(entradaFormateada);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	public String formatearFecha(String entrada) {
		return entrada.replace("-", "/");
	}

	public Boolean validarEntrada(String entrada, int max) {
		return validarEntrada(entrada);
	}

	public Boolean validarEntrada(String entrada, int max, int min) {
		return validarEntrada(entrada);
	}

	public Boolean validarEntrada(String entrada, int max, int min, Boolean soloLetras) {
		return validarEntrada(entrada);
	}
	
}
