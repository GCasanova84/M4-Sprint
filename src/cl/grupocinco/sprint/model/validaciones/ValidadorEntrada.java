package cl.grupocinco.sprint.model.validaciones;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public abstract class ValidadorEntrada {
	
	static Scanner scanner = new Scanner(System.in);
	
	protected static String validarEntrada(String clase, String item)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		return validarEntrada(clase, item, 0);
	}
	
	protected static String validarEntrada(String clase, String item, int max)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		return validarEntrada(clase, item, max, 0);
	}
	
	protected static String validarEntrada(String clase, String item, int max, int min)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		return validarEntrada(clase, item, max, min, true);
	}
	
	protected static String validarEntrada(String clase, String item, int max, int min, Boolean soloLetras)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		return validarEntrada(clase, item, max, min, soloLetras, true);
	}
	
	protected static String validarEntrada(String clase, String item, int max, int min, Boolean soloLetras, Boolean obligatorio)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {		
		Class<?> c = Class.forName(clase);
		Validador v = (Validador) c.getDeclaredConstructor().newInstance();		
		String entrada = null;
		while (max == 0 ? !v.validarEntrada(entrada) : !v.validarEntrada(entrada, max, min, soloLetras)) {
			System.out.print(item + ": ");
			entrada = scanner.nextLine();
			if (!obligatorio && entrada.isEmpty()) {
				break;
			}
			if (max == 0 ? !v.validarEntrada(entrada) : !v.validarEntrada(entrada, max, min, soloLetras))
				System.out.println("¡" + item + " inválid@! Vuelve a intentarlo\n");
		}
		return entrada;
	}
}
