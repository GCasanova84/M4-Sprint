package cl.grupocinco.sprint.model.validaciones;

public class SistemaSalud extends Numero implements Validador {
	
	public Boolean validarEntrada(String entrada) {
		if (entrada == null || entrada.isEmpty()) 
			return false;
		return super.validarEntrada(entrada, 2, 1);
	}
}
