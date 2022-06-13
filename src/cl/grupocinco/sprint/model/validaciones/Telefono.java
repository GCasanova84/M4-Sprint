package cl.grupocinco.sprint.model.validaciones;

public class Telefono implements Validador {
	
	public Boolean validarEntrada(String entrada) {
		if (entrada == null || entrada.isEmpty()) 
			return false;
		return (entrada.matches("\\+569\\d{8}") || entrada.matches("9\\d{8}"));
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
