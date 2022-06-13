package cl.grupocinco.sprint.model;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Scanner;

import cl.grupocinco.sprint.model.eventos.Capacitacion;
import cl.grupocinco.sprint.model.usuarios.Administrativo;
import cl.grupocinco.sprint.model.usuarios.Cliente;
import cl.grupocinco.sprint.model.usuarios.Profesional;
import cl.grupocinco.sprint.model.usuarios.Usuario;
import cl.grupocinco.sprint.model.validaciones.Fecha;
import cl.grupocinco.sprint.model.validaciones.Rut;
import cl.grupocinco.sprint.model.validaciones.ValidadorEntrada;

public class Menu extends ValidadorEntrada {
	static Scanner scanner = new Scanner(System.in);
	static String p = "cl.grupocinco.sprint.model.validaciones.";
	static Fecha f = new Fecha();
	static Rut r = new Rut();

	public static void mostrarBienvenida() {
		System.out.println("¡BIENVENID@ AL PLANIFICADOR DE ACTIVIDADES!");
	}

	public static void mostrarMenuPrincipal() {
		System.out.println("\nIngresa el dígito correspondiente a la acción que deseas realizar:\n");
		System.out.println("1. Almacenar Cliente");
		System.out.println("2. Almacenar Profesional");
		System.out.println("3. Almacenar Administrativo");
		System.out.println("4. Amacenar Capacitación");
		System.out.println("5. Eliminar Usuario por rut");
		System.out.println("6. Listar Usuarios");
		System.out.println("7. Listar Usuarios por Tipo");
		System.out.println("8. Listar Capacitaciones");
		System.out.println("9. Salir\n");
	}

	public static void almacenarCliente(Contenedor contenedor)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		System.out.println("\nIngresa los datos del cliente.\n");
		String nombre = validarEntrada(p + "Texto", "Nombre", 50, 10, false);
		String fechaNacimiento = f.formatearFecha(validarEntrada(p + "Fecha", "Fecha de nacimiento"));
		String run = r.formatearRut(validarEntrada(p + "Rut", "Run"));
		String nombres = validarEntrada(p + "Texto", "Nombres", 30, 5);
		String apellidos = validarEntrada(p + "Texto", "Apellidos", 50, 10);
		String telefono = validarEntrada(p + "Telefono", "Teléfono");
		String afp = validarEntrada(p + "Texto", "AFP", 30, 4);
		String sistemaSalud = validarEntrada(p + "SistemaSalud", "Sistema de salud (1 para Fonasa; 2 para Isapre)");
		String direccion = validarEntrada(p + "Texto", "Dirección", 70, 0, false, false);
		String comuna = validarEntrada(p + "Texto", "Comuna", 50, 0, false, false);
		String edad = validarEntrada(p + "Numero", "Edad", 150, 0);

		List<Asesoria> usuarios = contenedor.getUsuarios();
		if (!usuarios.stream().filter(usuario -> ((Usuario) usuario).getRun().equals(run)).findFirst().isPresent()) {
			Cliente cliente = new Cliente(nombre, fechaNacimiento, run, run, nombres, apellidos, telefono, afp,
					Integer.parseInt(sistemaSalud), direccion, comuna, Integer.parseInt(edad));
			contenedor.almacenarCliente(cliente);
		} else {
			System.out.println("\n¡Este usuario ya existe! Vuelve a intentarlo.\n");
		}

	}

	public static void almacenarProfesional(Contenedor contenedor)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		System.out.println("\nIngresa los datos del profesional.\n");
		String nombre = validarEntrada(p + "Texto", "Nombre", 50, 10, false);
		String fechaNacimiento = f.formatearFecha(validarEntrada(p + "Fecha", "Fecha de nacimiento"));
		String run = r.formatearRut(validarEntrada(p + "Rut", "Run"));
		String titulo = validarEntrada(p + "Texto", "Título", 50, 10);
		String fechaIngreso = f.formatearFecha(validarEntrada(p + "Fecha", "Fecha de ingreso a la empresa"));

		List<Asesoria> usuarios = contenedor.getUsuarios();
		if (!usuarios.stream().filter(usuario -> ((Usuario) usuario).getRun().equals(run)).findFirst().isPresent()) {
			Profesional profesional = new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngreso);
			contenedor.almacenarProfesional(profesional);
		} else {
			System.out.println("\n¡Este usuario ya existe! Vuelve a intentarlo.\n");
		}
	}

	public static void almacenarAdministrativo(Contenedor contenedor)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		System.out.println("\nIngresa los datos del administrativo.\n");
		String nombre = validarEntrada(p + "Texto", "Nombre", 50, 10, false);
		String fechaNacimiento = f.formatearFecha(validarEntrada(p + "Fecha", "Fecha de nacimiento"));
		String run = r.formatearRut(validarEntrada(p + "Rut", "Run"));
		String area = validarEntrada(p + "Texto", "Área", 20, 5);
		String experienciaPrevia = validarEntrada(p + "Texto", "Experiencia previa", 100, 0, false);

		List<Asesoria> usuarios = contenedor.getUsuarios();
		if (!usuarios.stream().filter(usuario -> ((Usuario) usuario).getRun().equals(run)).findFirst().isPresent()) {
			Administrativo admin = new Administrativo(nombre, fechaNacimiento, run, area, experienciaPrevia);
			contenedor.almacenarAdministrativo(admin);
		} else {
			System.out.println("\n¡Este usuario ya existe! Vuelve a intentarlo.\n");
		}

	}

	public static void almacenarCapacitacion(Contenedor contenedor)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		System.out.println("\nIngresa los datos de la capacitación.\n");
		String identificador = validarEntrada(p + "Numero", "Identificador");
		String run = r.formatearRut(validarEntrada(p + "Rut", "Rut del cliente"));
		String dia = validarEntrada(p + "DiaSemana", "Día");
		String hora = validarEntrada(p + "Hora", "Hora");
		String lugar = validarEntrada(p + "Texto", "Lugar", 50, 10);
		String duracion = validarEntrada(p + "Texto", "Duración", 70, 0, false, false);
		String cantidadAsistentes = validarEntrada(p + "Numero", "Cantidad de asistentes", 1000);

		Capacitacion curso = new Capacitacion(Integer.parseInt(identificador), run, dia, hora, lugar, duracion,
				Integer.parseInt(cantidadAsistentes));
		contenedor.almacenarCapacitacion(curso);
	}

	public static void eliminarUsuario(Contenedor contenedor) {
		System.out.print("\nIngresa rut a eliminar: ");
		String rut = scanner.next();
		contenedor.eliminarUsuario(rut);
		System.out.println(contenedor.listarUsuarios());
	}

	public static void listarUsuarios(Contenedor contenedor) {
		System.out.println();
		System.out.println(contenedor.listarUsuarios());
	}

	public static void listarUsuariosPorTipo(Contenedor contenedor)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		System.out.println("\nEscribe el tipo de usuario (Cliente, Profesional o Administrativo): ");
		String tipo = validarEntrada(p + "TipoUsuario", "Tipo");
		System.out.println(contenedor.listarUsuariosTipo(tipo));
	}

	public static void listarCapacitaciones(Contenedor contenedor) {
		System.out.println();
		System.out.println(contenedor.listarCapacitaciones());
	}
}
