package ej2;

import java.io.IOException;

import utiles.Libreria;

public class Usuario {
	Libreria a1 = new Libreria();
	
	private int mensajes;
	private String correo;
	private String nick;
	
	Usuario(){
		
	}
	
	Usuario(int mensajes, String correo, String nick){
		this.mensajes=mensajes;
		this.correo=correo;
		this.nick=nick;
	}
	
	public void IncrementarMensajes() {
		mensajes++;
	}
	
	public void DecrementarMensajes() {
		mensajes--;
	}
	
	public void ModCorreo() throws IOException {
		correo = a1.excepcionstringcontexto("Introduce tu nuevo nick");
	}
	
	@Override
	public String toString() {
		
		return "Usuario: "+nick+" Mensajes: "+mensajes+" Correo: "+correo;
	}

	public int getMensajes() {
		return mensajes;
	}

	public void setMensajes(int mensajes) {
		this.mensajes = mensajes;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	

}
