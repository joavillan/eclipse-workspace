package cta3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServidorUDP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
				//Puerto 12345
				DatagramSocket socket=new DatagramSocket(12345);
				
				Curso c1 = new Curso("1","primero");
				Curso c2 = new Curso("2","segundo");
				
				Alumno aa = null;
				
				Alumno[] a = new Alumno[5];
				a[0] = new Alumno("a1","Joaquin", c1, 7);
				a[1] = new Alumno("a2","Ale", c2, 8);
				a[2] = new Alumno("a3","Jaime", c1, 5);
				a[3] = new Alumno("a4","Adri", c2, 7);
				a[4] = new Alumno("a5","Fran", c2, 10);
				
				//Esperando
				System.out.println("Servidor esperando datagrama...");
				DatagramPacket recibo;
				String mensaje="";
				do{
					//recibimos
					byte[] bufer=new byte[1024];
					recibo=new DatagramPacket(bufer, bufer.length);
					socket.receive(recibo);
					//pintamos
					mensaje=new String(recibo.getData()).trim();
					System.out.println("Servidor recibe identificador: "+mensaje);
					//direccion origen
					InetAddress IPOrigen=recibo.getAddress();
					int puerto=recibo.getPort();
					
					//Comprobar array
					for (int i = 0; i < a.length; i++) {
						Alumno aux = a[i];
						if (mensaje.equals(aux.getIdAlumno())) {
							aa = a[i];
							System.out.println(aa);
							break;
						}
					}
					if (aa != null) {
						ByteArrayOutputStream bs=new ByteArrayOutputStream();
						ObjectOutputStream out=new ObjectOutputStream(bs);
						out.writeObject(aa);
						out.close();
						
						byte[] mensajeEnvio=bs.toByteArray();
						
						InetAddress destino=InetAddress.getLocalHost();
						int port=12346;
						
						DatagramPacket envio=new DatagramPacket(mensajeEnvio, mensajeEnvio.length,destino,port);
						
				
						socket.send(envio);
					}else {
						System.out.println("No exixte el alumno");
					}
				}while(!mensaje.equalsIgnoreCase("*"));
				
				//Cerrar socket
				System.out.println("Cerrando conexion...");
				socket.close();
	}

}
