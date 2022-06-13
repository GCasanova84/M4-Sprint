package cl.grupocinco.sprint.model.validaciones;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Hora implements Validador {
	
	public Boolean validarEntrada(String entrada) {
		DateTimeFormatter stf = DateTimeFormatter.ofPattern("HH:mm")
	            .withResolverStyle(ResolverStyle.STRICT);
		if (entrada == null || entrada.isEmpty()) 
			return false;
		try {
	        LocalTime.parse(entrada, stf);
	        return true;
	    } catch (DateTimeParseException e) {
	        return false;
	    }

	}

	public String formatearHora(String entrada) {
		return entrada;

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
