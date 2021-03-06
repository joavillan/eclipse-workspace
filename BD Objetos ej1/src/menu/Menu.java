package menu;

import java.io.IOException;
import java.util.ArrayList;

import modelos.C1Asignaturas;
import modelos.C1Centros;
import modelos.C1Profesores;
import utiles.Libreria;

public class Menu {

	public void menu() throws IOException {
		 int opcion;
		 
		 C1Asignaturas a = new C1Asignaturas();
		 C1Centros c = new C1Centros();
		 C1Profesores p = new C1Profesores();
	     Libreria a1 = new Libreria();
	     
	     do {
	         opcion = a1.excepcionintcontexto(
	                   " 1-Comprobar si un objeto existe en la base de datos. \n"
	                 + " 2-Insertar objeto. \n"
	                 + " 3-Eliminar objeto. \n"
	                 + " 4-Modificar objeto. \n"
	                 + " 5-Profesores en un centro. \n"
	                 + " 6-Asignatura que imparte un profesor. \n"
	                 + " 7-Salir"
	                 );
	         switch(opcion) {
	         case 1:
	        	 do {
	        		 opcion = a1.excepcionintcontexto("�Que quieres comprobar? (1)Asignatura, (2)Centro, (3)Profesor, (4)Salir");
	        		 switch (opcion) {
					case 1:
						a.comprobarAsignatura(a= new C1Asignaturas(a1.excepcionstringcontexto("Codigo:"),null,null));
						break;
					case 2:
						c.comprobarCentros(c = new C1Centros(a1.excepcionintcontexto("Codigo:"),null,null,null,null,null));
						break;
					case 3:
						p.comprobarProfesores(p= new C1Profesores(a1.excepcionintcontexto("Codigo:"),null,null,null,null,null));
						break;
					case 4:
						System.out.println("Saliendo...");
						break;

					default:
						System.out.println("ERROR");
						break;
					}
				} while (opcion != 4);
	             break;
	         case 2:
	        	 do {
	        		 opcion = a1.excepcionintcontexto("�Que quieres insertar? (1)Asignatura, (2)Centro, (3)Profesor, (4)Salir");
	        		 switch (opcion) {
					case 1:
						ArrayList<C1Profesores> temp = new ArrayList();
	                    String nom="";
	                    do {
	                        temp.add(p.obtenerProfesor(a1.excepcionintcontexto("ID profesor:")));
	                        nom=a1.excepcionstringcontexto("Desea continuar insertando profesores en asignaturas? Y/N");
	                    }while(!nom.equalsIgnoreCase("n"));
	                    a= new C1Asignaturas(a1.excepcionstringcontexto("Codigo:"),a1.excepcionstringcontexto("Nombre:"),temp);
	                    a.insertarAsignatura(a);
						break;
					case 2:
						int id = a1.excepcionintcontexto("Codigo centro:");
						if (c.comprobarCentros(new C1Centros(id,null,null,null,null,null))==true) {
							System.out.println("Centro ya insertado");
							break;
						}else {
							c.insertarCentros(c = new C1Centros(id,a1.excepcionstringcontexto("Nombre:"),p.obtenerProfesor(a1.excepcionintcontexto("ID profesor:")),a1.excepcionstringcontexto("Direccion:"),a1.excepcionstringcontexto("Localidad:"),a1.excepcionstringcontexto("Provincia")));
						}
						break;
					case 3:
						id = a1.excepcionintcontexto("Codigo profesor:");
						if (p.comprobarProfesores(new C1Profesores(id,null,null,null,null,null))) {
							System.out.println("Profesor ya insertado");
							break;
						}else {
							p.insertarProfesores(p= new C1Profesores(id,a1.excepcionstringcontexto("Nombre profesor:"),a1.excepcionstringcontexto("Especialidad:"),a1.excepcionstringcontexto("Fecha nacimiento:"),a1.excepcionstringcontexto("Sexo:"),c.obtenerCentros(a1.excepcionintcontexto("ID centro"))));
						}
						break;
					case 4:
						System.out.println("Saliendo...");
						break;

					default:
						System.out.println("ERROR");
						break;
					}
				} while (opcion != 4);
	             break;
	         case 3:
	        	 do {
	        		 opcion = a1.excepcionintcontexto("�Que quieres Eliminar? (1)Asignatura, (2)Centro, (3)Profesor, (4)Salir");
	        		 switch (opcion) {
					case 1:
						a.borrarAsignatura(a= new C1Asignaturas(a1.excepcionstringcontexto("Codigo:"),null,null));
						break;
					case 2:
						c.borrarCentros(c = new C1Centros(a1.excepcionintcontexto("Codigo:"),null,null,null,null,null));
						break;
					case 3:
						p.borrarProfesores(p= new C1Profesores(a1.excepcionintcontexto("Codigo:"),null,null,null,null,null));
						break;
					case 4:
						System.out.println("Saliendo...");
						break;

					default:
						System.out.println("ERROR");
						break;
					}
				} while (opcion != 4);
	             break;
	         case 4:
	        	 do {
	        		 opcion = a1.excepcionintcontexto("�Que quieres actualizar? (1)Asignatura, (2)Centro, (3)Profesor, (4)Salir");
	        		 switch (opcion) {
					case 1:
						//a.actualizarAsignatura(a1.excepcionstringcontexto("Codigo:"),a1.excepcionstringcontexto("Nombre:"));
						ArrayList<C1Profesores> temp = new ArrayList();
	                    String nom="";
	                    do {
	                        temp.add(p.obtenerProfesor(a1.excepcionintcontexto("ID profesor:")));
	                        nom=a1.excepcionstringcontexto("Desea continuar insertando profesores en asignaturas? Y/N");
	                    }while(!nom.equalsIgnoreCase("n"));
	                    //a= new C1Asignaturas(a1.excepcionstringcontexto("Codigo:"),a1.excepcionstringcontexto("Nombre:"),temp);
	                    a.actualizarAsignatura(a1.excepcionstringcontexto("Codigo asignatura:"), a1.excepcionstringcontexto("Nombre:"), temp);
						break;
					case 2:
						c.actualizarCentros(a1.excepcionintcontexto("Codigo"), a1.excepcionstringcontexto("Nombre:"), p.obtenerProfesor(a1.excepcionintcontexto("ID profesor:")), a1.excepcionstringcontexto("Direccion:"),  a1.excepcionstringcontexto("Localidad:"),  a1.excepcionstringcontexto("Provincia:"));
						//c.actualizarCentros(a1.excepcionintcontexto("Codigo:"),a1.excepcionstringcontexto("Nombre:"),p = new C1Profesores(a1.excepcionintcontexto("Codigo profesor:"),a1.excepcionstringcontexto("Nombre profesor:"),a1.excepcionstringcontexto("Especialidad:"),a1.excepcionstringcontexto("Fecha nacimiento:"),a1.excepcionstringcontexto("Sexo:"),null),a1.excepcionstringcontexto("Direccion:"),a1.excepcionstringcontexto("Localidad:"),a1.excepcionstringcontexto("Provincia"));
						break;
					case 3:
						p.actualizarProfesores(a1.excepcionintcontexto("Codigo profesor:"),a1.excepcionstringcontexto("Nombre profesor:"),a1.excepcionstringcontexto("Especialidad:"),a1.excepcionstringcontexto("Fecha nacimiento:"),a1.excepcionstringcontexto("Sexo:"),c.obtenerCentros(a1.excepcionintcontexto("ID centro:")));
						break;
					case 4:
						System.out.println("Saliendo...");
						break;

					default:
						System.out.println("ERROR");
						break;
					}
				} while (opcion != 4);
	             break;
	         case 5:
	        	 c.verProfesores(a1.excepcionintcontexto("Codigo:"));
	             break;
	         case 6:
	        	 p.consultarAsignaturas(p = new C1Profesores(a1.excepcionintcontexto("Codigo:"),null,null,null,null,null));
	             break;
	         case 7:
	        	 System.out.println("Saliendo...");
	        	 break;
	         default:
	        	 System.out.println("ERROR. Vuelva a elegir opcion");
	             break;
	         }


	         }while(opcion!=7);
	
	}
}
