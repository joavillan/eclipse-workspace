package ej2;

import utiles.Libreria;

/**
 * @author Joaquin
 *
 */
public class Administrador extends Usuario{
	Libreria a1 = new Libreria();
	
	private int postpapelera;
	private int baneos;
	
	Administrador(){
		
	}
	
	Administrador(int mensajes, String correo, String nick, int postpapelera, int baneos){
		super(mensajes,correo,nick);
		this.postpapelera=postpapelera;
		this.baneos=baneos;
	}
	
	public void IncrementarMensajeBorrado() {
		postpapelera++;
	}
	
	public void IncrementarBaneos() {
		baneos++;
	}

	public int getPostpapelera() {
		return postpapelera;
	}

	public void setPostpapelera(int postpapelera) {
		this.postpapelera = postpapelera;
	}

	public int getBaneos() {
		return baneos;
	}

	public void setBaneos(int baneos) {
		this.baneos = baneos;
	}
	
	@Override
	public String toString() {
		
		return "Moderador: "+getNick()+" Mensajes: "+getMensajes()+" Correo: "+getCorreo()+  "Post eliminados: "+postpapelera+ " Usuarios baneados: "+baneos;
	}
	
	
}
