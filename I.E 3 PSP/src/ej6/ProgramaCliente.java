package ej6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ProgramaCliente {

private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DatagramSocket clientSocket=new DatagramSocket();
		
		InetAddress IPServidor=InetAddress.getLocalHost();
		int puerto=12345;
		String cadena="";
		do{

			System.out.println("Introduce mensaje: ");
			cadena=sc.nextLine();
	
			byte[] enviados=new byte[1024];
			enviados=cadena.getBytes();
			
			//Enviamos datagrama
			DatagramPacket envio=new DatagramPacket(enviados, enviados.length,IPServidor,puerto);
			clientSocket.send(envio);
			
			
			//Recibimos
			byte[] recibidos=new byte[1024];
			DatagramPacket recibo=new DatagramPacket(recibidos, recibidos.length);
			System.out.println("Esperando datagrama...");
			//tiempo max de espera
			clientSocket.setSoTimeout(4000);
			try{
				clientSocket.receive(recibo);
				String respuesta=new String(recibo.getData());
				System.out.println(respuesta);
			}catch (InterruptedIOException e) {
				System.out.println("Error");
				cadena="*";
			}
			
		}while(!cadena.equalsIgnoreCase("*"));
		
		//Cerramos
		clientSocket.close();
	}

}
