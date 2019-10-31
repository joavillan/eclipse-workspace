package ej2;

import utiles.Libreria;

public class Moderador extends Usuario{
	Libreria a1 = new Libreria();
	
	private int postpapelera;
	
	Moderador(){
		
	}
	
	Moderador(int mensajes, String correo, String nick, int postpapelera){
		super(mensajes,correo,nick);
		this.postpapelera=postpapelera;
	}
	
	public void IncrementarMensajeBorrado() {
		postpapelera++;
	}

	public int getPostpapelera() {
		return postpapelera;
	}

	public void setPostpapelera(int postpapelera) {
		this.postpapelera = postpapelera;
	}
	
	@Override
	public String toString() {
		
		return "Moderador: "+getNick()+" Mensajes: "+getMensajes()+" Correo: "+getCorreo()+  "Post eliminados: "+postpapelera;
	}
	
}
