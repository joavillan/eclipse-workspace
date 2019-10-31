package utiles;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Libreria {
BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	
	int numeroint;
	float numerofloat;
	double numerodouble;
	int numeropos;
	int numeroneg;
	String estring;
	boolean booldato;
	long longdato;

	public int excepcionint() throws IOException {
		boolean n1=true;
		do {
			try {
				System.out.println("Introduce un valor en número entero.");
				numeroint=Integer.parseInt(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero.");
				n1=false;
			}
		} while (n1!=true);
			return numeroint;
	}
	
	public float excepcionfloat() throws IOException {
		boolean n1=true;
		do {
			try {
				System.out.println("Introduce un número");
				numerofloat=Float.parseFloat(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Asegúrate de introducir un número.");
				n1=false;
			}
		} while (n1!=true);
			return numerofloat;
	}
	
	public double excepciondouble() throws IOException {
		boolean n1=true;
		do {
			try {
				System.out.println("Introduce un número");
				numerodouble=Double.parseDouble(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Asegúrate de introducir un número.");
				n1=false;
			}
		} while (n1!=true);
			return numerodouble;
	}
	
	public int excepcionpos() throws IOException {
		boolean n1=true;
		do {
			try {
				numeropos=Integer.parseInt(teclado.readLine());
				if (numeropos>=0) {
					n1=true;
				}else if (numeropos<0) {
					System.out.println("Error. Introduce un número entero positivo.");
					n1=false;
				}
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero positivo.");
				n1=false;
			}
		} while (n1!=true);
		return numeropos;
	}
	
	public int excepcionneg() throws IOException {
		boolean n1=true;
		do {
			try {
				numeroneg=Integer.parseInt(teclado.readLine());
				if (numeroneg<=0) {
					n1=true;
				}else if (numeroneg>0) {
					System.out.println("Error. Introduce un número entero negativo.");
					n1=false;
				}
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero negativo.");
				n1=false;
			}
		} while (n1!=true);
		return numeroneg;
	}
	
	public String excepcionstring() throws IOException {
		boolean n1=true;
		do {
			try {
				estring=teclado.readLine();
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce una cadena de caracteres.");
				n1=false;
			}
		} while (n1!=true);
		return estring;
	}
	
	public boolean excepcionboolean() throws IOException {
		boolean n1=true;
		do {
			try {
				booldato=Boolean.parseBoolean(teclado.readLine());
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce un valor booleano.");
				n1=false;
			}
		} while (n1!=true);
		return booldato;
	}
	
	public long excepcionlong() throws IOException {
		boolean n1=true;
		do {
			try {
				longdato=Long.parseLong(teclado.readLine());
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce un valor numérico.");
				n1=false;
			}
		} while (n1!=true);
		return longdato;
	}
	
	public String invertircadena(String cadena) {
		String cadenainvertida = "";
		for (int i = cadena.length()-1; i>=0; i--) {
			cadenainvertida+=cadena.charAt(i);
		}
		return cadenainvertida;
	}
	
	
}
