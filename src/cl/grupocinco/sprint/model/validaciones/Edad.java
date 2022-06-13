package cl.grupocinco.sprint.model.validaciones;

public class Edad extends Numero implements Validador {
	
	public Boolean validarEntrada(String entrada) {
		if (entrada == null || entrada.isEmpty()) 
			return false;
		return super.validarEntrada(entrada, 150);
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
