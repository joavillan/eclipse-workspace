package ej6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServidorUDP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
				//Puerto 12345
				DatagramSocket socket=new DatagramSocket(12345);
				
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
					System.out.println("Servidor recibe: "+mensaje);
					//direccion origen
					InetAddress IPOrigen=recibo.getAddress();
					int puerto=recibo.getPort();
					
					//Convertir a mayus
					String respuesta=mensaje.toUpperCase();
					byte[] enviados=new byte[1024];
					enviados=respuesta.getBytes();
					
					//Devolvemos
					DatagramPacket envio=new DatagramPacket(enviados, enviados.length,IPOrigen,puerto);
					socket.send(envio);
					
				}while(!mensaje.equalsIgnoreCase("*"));
				
				//Cerrar socket
				System.out.println("Cerrando conexion...");
				socket.close();
	}

}
