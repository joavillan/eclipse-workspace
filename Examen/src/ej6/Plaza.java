package ej6;

import java.io.IOException;

public class Plaza extends Coche{

	int nplaza;
	String coche;
	boolean disponible;
	int ncoches;
	
	Plaza(int nplaza, String coche, boolean disponible, int ncoches){
		this.nplaza=1;
		this.disponible=disponible;
		this.ncoches=ncoches;
	}
	

	public String getCoche() {
		return coche;
	}


	public void setCoche(String coche) {
		this.coche = coche;
	}


	public int getNplaza() {
		return nplaza;
	}

	public void setNplaza(int nplaza) {
		this.nplaza = nplaza;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getNcoches() {
		return ncoches;
	}

	public void setNcoches(int ncoches) {
		this.ncoches = ncoches;
	}
	
	void visualizar() {
		System.out.println(nplaza+coche+disponible+ncoches);
	}
	
	void menu() throws IOException {
		Libreria a1=new Libreria();
		System.out.println("MENU PLAZA APARCAMIENTO");
		System.out.println("1. Aparcar coche");
		System.out.println("2. Sacar coche");
		System.out.println("3. Ver coche aparcado");
		System.out.println("4. Salir aplicacion");
		System.out.print("OPCION: ");
		int n1;
		do {
			n1=a1.excepcionint();
			if (n1==1) {
				aparcar();
			}else if (n1==2) {
				sacarcoche();
			}else if (n1==3) {
				mostrarcoche();
			}
			if (n1==4) {
				System.out.println("Plaza libre: "+disponible);
				if (disponible==true) {
					mostrarcoche();
				}
			}
		} while (n1!=4);
		System.out.println("Has salido del programa");
	}
	
	void aparcar() throws IOException {
		Libreria a1=new Libreria();
		String s1=a1.excepcionstring();
		String s2=a1.excepcionstring();
		String s3=a1.excepcionstring();
		if (disponible==true) {
			setMatricula(s1);
			setMarca(s2);
			setModelo(s3);
			setDisponible(false);
			System.out.println("El coche ha aparcado");
			
		}else {
			System.out.println("Plaza no disponible. Ya hay otro coche aparcado.");
		}
	}
	
	void sacarcoche() {
		setDisponible(true);
		System.out.println("Plaza libre. El coche ha salido de la plaza");
	}
	
	void mostrarcoche() {
		if (disponible==true) {
			System.out.println("No hay ningún coche aparcado en esta plaza.");
			
		}else if (disponible==false) {
			System.out.println(getCoche()+getMarca()+getModelo()+getMatricula());
		}
	}
	
}
