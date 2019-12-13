package ej8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ProgramaCliente {

private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		DatagramSocket clientSocket=new DatagramSocket(12346);
		
		InetAddress IPServidor=InetAddress.getLocalHost();
		Personas p = new Personas("46545648f", "Joaquin", "Villegas");
		int puerto=12345;
		//String cadena="";
		System.out.println(p.toString());
		ByteArrayOutputStream bs=new ByteArrayOutputStream();
		ObjectOutputStream out=new ObjectOutputStream(bs);
		out.writeObject(p);
		out.close();
		
		byte[] mensaje=bs.toByteArray();
		
		DatagramPacket envio=new DatagramPacket(mensaje, mensaje.length,IPServidor,puerto);
		DatagramSocket socket=new DatagramSocket();
		
		socket.send(envio);
		
		byte[] recibidos=new byte[1024];
		System.out.println("Esperando datagrama...");
		
		DatagramPacket recibo=new DatagramPacket(recibidos,recibidos.length);
		socket.receive(recibo);

		ByteArrayInputStream bais=new ByteArrayInputStream(recibidos);
		ObjectInputStream in=new ObjectInputStream(bais);
		p =(Personas) in.readObject();
		System.out.println(p.toString());
		
		in.close();
		socket.close();
	}

}
