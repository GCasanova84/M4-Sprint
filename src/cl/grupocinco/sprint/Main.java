package cl.grupocinco.sprint;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import cl.grupocinco.sprint.model.Contenedor;
import cl.grupocinco.sprint.model.Menu;
import cl.grupocinco.sprint.model.validaciones.Numero;

public abstract class Main {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Contenedor contenedor = new Contenedor();
		Scanner scanner = new Scanner(System.in);
		String opcion = null;
		Numero num = new Numero();

		Menu.mostrarBienvenida();
		// Mientras la opción ingresada no sea 9, seguirá mostrando el menú principal
		// una vez ejecutada la opción escogida
		while (!num.validarEntrada(opcion, 9, 9)) {
			// Mientras la opción ingresada no sea un número entre 1 y 9, seguirá pidiendo
			// una opcíon válida
			while (!num.validarEntrada(opcion, 9, 1)) {
				Menu.mostrarMenuPrincipal();
				opcion = scanner.next();
				if (!num.validarEntrada(opcion, 9, 1))
					System.out.println("\n¡Opción inválida!");
			}
			// Se ejecutan las distintas opciones del menú según la opción ingresada por el
			// usuario
			switch (Integer.parseInt(opcion)) {
			case 1:
				Menu.almacenarCliente(contenedor);
				opcion = null;
				break;

			case 2:
				Menu.almacenarProfesional(contenedor);
				opcion = null;
				break;

			case 3:
				Menu.almacenarAdministrativo(contenedor);
				opcion = null;
				break;

			case 4:
				Menu.almacenarCapacitacion(contenedor);
				opcion = null;
				break;

			case 5:
				Menu.eliminarUsuario(contenedor);
				opcion = null;
				break;

			case 6:
				Menu.listarUsuarios(contenedor);
				opcion = null;
				break;

			case 7:
				Menu.listarUsuariosPorTipo(contenedor);
				opcion = null;
				break;

			case 8:
				Menu.listarCapacitaciones(contenedor);
				opcion = null;
				break;

			case 9:
				System.out.println("¡Has salido del planificador!");
				break;
			}
		}
		scanner.close();
	}

}
