package cl.grupocinco.sprint.model.validaciones;

public interface Validador {
	Boolean validarEntrada(String entrada);
	Boolean validarEntrada(String entrada, int max);
	Boolean validarEntrada(String entrada, int max, int min);
	Boolean validarEntrada(String entrada, int max, int min, Boolean soloLetras);
}
