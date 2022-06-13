package cl.grupocinco.sprint.model;

import java.util.ArrayList;
import java.util.List;

import cl.grupocinco.sprint.model.eventos.Capacitacion;
import cl.grupocinco.sprint.model.usuarios.Administrativo;
import cl.grupocinco.sprint.model.usuarios.Cliente;
import cl.grupocinco.sprint.model.usuarios.Profesional;
import cl.grupocinco.sprint.model.usuarios.Usuario;
import cl.grupocinco.sprint.model.validaciones.Rut;

public class Contenedor {

	Rut r = new Rut();
	private List<Asesoria> usuarios = new ArrayList<Asesoria>();
	private List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();

	public Contenedor() {
	}

	public List<Asesoria> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Asesoria> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}

	public void setCapacitaciones(List<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contenedor [usuarios=").append(usuarios).append(", capacitaciones=").append(capacitaciones)
				.append("]");
		return builder.toString();
	}

	public void almacenarCliente(Cliente cliente) {
		this.usuarios.add(cliente);
	}

	public void almacenarProfesional(Profesional profesional) {
		this.usuarios.add(profesional);
	}

	public void almacenarAdministrativo(Administrativo administrativo) {
		this.usuarios.add(administrativo);
	}

	public void almacenarCapacitacion(Capacitacion capacitacion) {
		this.capacitaciones.add(capacitacion);
	}

	public void eliminarUsuario(String run) {
		String rut = r.formatearRut(run);
		usuarios.removeIf(usuario -> ((Usuario) usuario).getRun().equals(rut));
	}

	public String listarUsuarios() {
		return listarUsuarios(usuarios, true, false);
	}

	public String listarUsuarios(List<Asesoria> listado, Boolean soloPadre, Boolean nombreClase) {
		if (listado.size() > 0) {
			StringBuilder listaUsuarios = new StringBuilder();
			for (int i = 0; i < listado.size(); i++) {
				String tipoUsuario = nombreClase ? listado.get(i).getClass().getSimpleName() : "Usuario";
				listaUsuarios.append(
						tipoUsuario + " n°" + (i + 1) + ":\n" + listado.get(i).analizarUsuario(soloPadre) + "\n\n");
			}
			return listaUsuarios.toString();
		} else {
			return "No hay usuarios en la lista.";
		}
	}

	// TODO
	public String listarUsuariosTipo(String tipo) {
		List<Asesoria> listadoPorTipo = new ArrayList<Asesoria>();
		listadoPorTipo = usuarios.stream().filter(usuario -> {
			switch (tipo) {
			case "Cliente":
				return usuario instanceof Cliente;
			case "Profesional":
				return usuario instanceof Profesional;
			case "Administrativo":
				return usuario instanceof Administrativo;
			default:
				return false;
			}
		}).toList();
		return listarUsuarios(listadoPorTipo, false, true);
	}

	public String listarCapacitaciones() {
		StringBuilder listaCapacitaciones = new StringBuilder();
		capacitaciones.stream().forEach(capacitacion -> {
			Cliente cliente = (Cliente) usuarios.stream().filter(usuario -> {
				return (usuario instanceof Cliente) ? ((Cliente) usuario).getRut().equals(capacitacion.getRutCliente())
						: false;
			}).findAny().orElse(null);
			listaCapacitaciones.append("ID de capacitación: " + capacitacion.getIdentificador() + "\n"
					+ capacitacion.mostrarDetalle() + "\n" + cliente.analizarUsuario());
		});
		return listaCapacitaciones.toString();
	}

}
