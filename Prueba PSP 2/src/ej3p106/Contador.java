package ej3p106;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String nombreFichero = "prueba.txt";
	        //Declarar una variable FileReader
	        FileReader fr = null;
	        try {
	            //Abrir el fichero indicado en la variable nombreFichero
	            fr = new FileReader(nombreFichero);
	            //Leer el primer car�cter
	            //Se debe almacenar en una variable de tipo int
	            int caract = fr.read();
	            //Se recorre el fichero hasta encontrar el car�cter -1
	            //   que marca el final del fichero
	            int i = 0;
	            while(caract != -1) {
	            	i++;
	                //Mostrar en pantalla el car�cter le�do convertido a char
	                //System.out.print((char)caract);
	                //Leer el siguiente car�cter
	                caract = fr.read();
	            }
	            System.out.println(i);
	        }
	        catch (FileNotFoundException e) {
	            //Operaciones en caso de no encontrar el fichero
	            System.out.println("Error: Fichero no encontrado");
	            //Mostrar el error producido por la excepci�n
	            System.out.println(e.getMessage());
	        }
	        catch (Exception e) {
	            //Operaciones en caso de error general
	            System.out.println("Error de lectura del fichero");
	            System.out.println(e.getMessage());
	        }
	        finally {
	            //Operaciones que se har�n en cualquier caso. Si hay error o no.
	            try {
	                //Cerrar el fichero si se ha abierto
	                if(fr != null)
	                    fr.close();
	            }
	            catch (Exception e) {
	                System.out.println("Error al cerrar el fichero");
	                System.out.println(e.getMessage());
	            }
	        }
	}

}
