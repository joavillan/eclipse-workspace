package ejercicio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import utiles.Libreria;

public class Menu {
	Libreria a1 = new Libreria();
	
	String meses[] = new String [] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
	List<Venta> al = new ArrayList<Venta>();
	Venta v = null;
	int n1 = 0;
	int temp = 0;
	
	
	
	public void menuestructura () throws IOException {
		menutexto();
		do {
			Iterator <Venta> a = al.iterator();
			switch (n1 = a1.excepcionint()) {
			case 1:
				for(int i=0;i<meses.length;i++){
					System.out.println("Introduce las ventas del mes "+meses[i]);
					al.add(new Venta(meses[i], a1.excepcionint()));
				}
				break;
			case 2:
				while (a.hasNext()) {
					v = a.next();
					System.out.println(v);
				}
				break;
			case 3:
				temp=0;
				while (a.hasNext()) {
					v = a.next();
					temp += v.getVentas_mes();
				}
				System.out.println(temp);
				break;
			case 4:
				temp=0;
				while (a.hasNext()) {
					v = a.next();
					if (v.getNombre_mes().charAt(0) == 'a') {
						temp += v.getVentas_mes();
					}
				}
				System.out.println(temp);
				break;
			case 5:
				temp=0;
				String nombre = null;
				int ventas=0;
				while (a.hasNext()) {
					v = a.next();
					if (v.getVentas_mes()>temp) {
						nombre = v.getNombre_mes();
						ventas = v.getVentas_mes();
						temp = ventas;
					}
				}
				System.out.println(nombre);
				break;
			case 6:
				
				break;
				
			default:
				System.out.println("Opción inválida");;
			}
		} while (n1 != 8);
		
	}
	
	public void menutexto() {
		System.out.println("1. Rellenar ventas de coches mensuales.\r\n" + 
				"2. Mostrar las ventas.\r\n" + 
				"3. Mostrar ventas totales en el año.\r\n" + 
				"4. Ventas totales de los meses que empiezan por A.\r\n" + 
				"5. Mes con más ventas.\r\n" + 
				"6. Salir del programa.\r\n");
	}

}
