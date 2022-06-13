package cl.grupocinco.sprint.model.validaciones;

public class Texto implements Validador {

	public Boolean validarEntrada(String entrada) {
		return validarEntrada(entrada, 2147483647, 0, true);
	}

	public Boolean validarEntrada(String entrada, int max) {
		return validarEntrada(entrada, max, 0, true);
	}

	public Boolean validarEntrada(String entrada, int max, int min) {
		return validarEntrada(entrada, max, min, true);
	}

	public Boolean validarEntrada(String entrada, int max, int min, Boolean soloLetras) {
		if (entrada == null || entrada.isEmpty())
			return false;
		if (soloLetras && !entrada.matches("[a-zA-Z\\s]+"))
			return false;
		return (entrada.length() >= min && entrada.length() <= max);

	}

}
