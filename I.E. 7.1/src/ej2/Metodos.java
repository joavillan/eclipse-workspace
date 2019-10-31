package ej2;

import java.util.ArrayList;

import utiles.Libreria;

public class Metodos {
	Libreria a1 = new Libreria();
	int user = 0;
	
	ArrayList<Usuario> u = new ArrayList<Usuario>();
	
	public void CrearUsuario() {
		u.add(new Usuario(0, "abc@gmail.com", "user"+user));
		user++;
	}
	
	public void CrearModerador() {
		u.add(new Moderador(0, "correo", "user"+user, 0));
		user++;
	}
	
	public void CrearAdministrador() {
		u.add(new Administrador(0, "correo", "user"+user, 0, 0));
		user++;
	}
	
	public void verusuarios() {
		System.out.println(u);
	}
	
	public void incrementos() {
		for (Usuario usuario : u) {
			if (usuario instanceof Administrador) {
				((Administrador) usuario).IncrementarBaneos();
			}else if (usuario instanceof Moderador) {
				((Moderador) usuario).IncrementarMensajeBorrado();
			}else {
				((Usuario) usuario).IncrementarMensajes();
			}
		}
	}
	
	public void ejecutar() {
		CrearUsuario();
		CrearModerador();
		CrearAdministrador();
		verusuarios();
		incrementos();
		verusuarios();
	}

}
