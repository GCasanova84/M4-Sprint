package cl.grupocinco.sprint.model.validaciones;

public class Numero implements Validador {
	
	public Boolean validarEntrada(String entrada) {
		return validarEntrada(entrada, 2147483647, 0, false);
	}
	
	public Boolean validarEntrada(String entrada, int max) {
		return validarEntrada(entrada, max, 0, false);
	}

	public Boolean validarEntrada(String entrada, int max, int min) {
		return validarEntrada(entrada, max, min, false);
	}

	public Boolean validarEntrada(String entrada, int max, int min, Boolean soloLetras) {
		if (entrada == null || entrada.isEmpty())
			return false;
		try {
			int entradaInt = Integer.parseInt(entrada);
			return (entradaInt >= min && entradaInt <= max);
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
}
