package ej6;

import java.io.IOException;
import java.util.ArrayList;

import utiles.Libreria;

public class Metodos {
	Libreria a1 = new Libreria();
	
	ArrayList<Obras> o = new ArrayList<Obras>();
	int contador = 0;
	
	public void añadeObra() throws IOException {
		int key = a1.excepcionintcontexto("1-Crear escultura \n 2-Crear pintura");
		switch (key) {
		case 1:
			o.add(contador, new Esculturas(a1.excepcionstringcontexto("Introduce el titulo de la obra"), contador, a1.excepcionstringcontexto("Introduce el autor de la obra"), a1.excepcionintcontexto("Introduce el año de la obra"), a1.excepcionstringcontexto("Introduce el material"), a1.excepciondoublecontexto("Introduce la altura de la obra")));
			contador++;
			System.out.println("Obra añadida con exito");
			break;
		case 2:
			o.add(contador, new Pinturas(a1.excepcionstringcontexto("Introduce el titulo de la obra"), contador, a1.excepcionstringcontexto("Introduce el autor de la obra"), a1.excepcionintcontexto("Introduce el año de la obra"), a1.excepciondoublecontexto("Introduce el ancho de la obra"), a1.excepciondoublecontexto("Introduce la altura de la obra"), a1.excepcionstringcontexto("Introduce el soporte de la obra")));
			contador++;
			System.out.println("Obra añadida con exito");
			break;
		default:
			System.out.println("Error. Obra no añadida");
			break;
		}
	}
	
	public void eliminaObra(int ninventario) {
		try {
			for (Obras obras : o) {
				if (obras.getNinventario() == ninventario) {
					o.remove(ninventario);
					System.out.println("La obra se ha eliminado correctamente");
				}
			}
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Error. Obra no eliminada. Intentelo de nuevo");
		}
	}
	
	public void buscaObra(int ninventario) {
		boolean error = false;
		do {
			try {
				for (Obras obras : o) {
					if (obras.getNinventario() == ninventario) {
						System.out.println(obras);
						error = true;
					}
				}
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("Error. Obra no encontrada. Intentelo de nuevo");
				error = false;
			}
		} while (error == false);
	}
	
	public double superficie() {
		double anch = 0;
		double alt = 0;
		for (Obras obras : o) {
			if (obras instanceof Pinturas) {
				Pinturas z = (Pinturas) obras;
				anch += z.getAncho();
				alt += z.getAlto();
			}
		}
		double superficie = anch*alt;
		return superficie;
	}
	
	public int masAlta() {
		double alt = 0;
		int ni = 0;
		double altant = 0;
		for (Obras obras : o) {
			if (obras instanceof Esculturas) {
				alt = ((Esculturas) obras).getAltura();
				if (alt >= altant) {
					altant=alt;
					ni = obras.getNinventario();
				}
			}
		}
		return ni;
	}
	
	public void ejecutar() throws IOException {
		añadeObra();
		añadeObra();
		buscaObra(a1.excepcionintcontexto("Introduce el número de inventario"));
		eliminaObra(a1.excepcionintcontexto("Introduce el número de inventario"));
		System.out.println("La superficie es de "+superficie());
		System.out.println("La obra más alta es "+masAlta());
	}
}
