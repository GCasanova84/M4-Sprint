package cl.grupocinco.sprint.model.validaciones;

public class Rut extends Numero implements Validador {

	public Boolean validarEntrada(String entrada) {
		if (entrada == null || entrada.isEmpty())
			return false;
		String entradaFormateada = desformatearRut(entrada);
		String digitoVerificador = entradaFormateada.substring(entradaFormateada.length() - 1,
				entradaFormateada.length());
		String rutSinDigitoVerificador = entradaFormateada.substring(0, entradaFormateada.length() - 1);
		if (!super.validarEntrada(rutSinDigitoVerificador, 99999999, 1000000))
			return false;
		return (super.validarEntrada(digitoVerificador, 9, 1) || digitoVerificador.toLowerCase().equals("k"));
	}

	public String desformatearRut(String entrada) {
		return entrada.replace(".", "").replace("-", "");
	}

	public String formatearRut(String entrada) {
		String rut = desformatearRut(entrada);
		rut = new StringBuilder(rut).insert(rut.length() - 1, "-").insert(rut.length() - 4, ".")
				.insert(rut.length() - 7, ".").toString();
		return rut;
	}
}
