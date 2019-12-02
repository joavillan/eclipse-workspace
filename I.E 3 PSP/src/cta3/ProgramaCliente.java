package cta3;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
		Alumno a=null;
		int puerto=12345;
		String cadena="";
		do{

			System.out.println("Introduce ID alumno: ");
			cadena=sc.nextLine();
	
			byte[] enviados=new byte[1024];
			enviados=cadena.getBytes();
			
			//Enviamos datagrama
			DatagramPacket envio=new DatagramPacket(enviados, enviados.length,IPServidor,puerto);
			clientSocket.send(envio);
			
			
			//Recibimos
			byte[] recibidos=new byte[1024];
			System.out.println("Esperando datagrama...");
			
			DatagramPacket recibo=new DatagramPacket(recibidos,recibidos.length);
			clientSocket.receive(recibo);

			ByteArrayInputStream bais=new ByteArrayInputStream(recibidos);
			ObjectInputStream in=new ObjectInputStream(bais);
			a=(Alumno) in.readObject();
			System.out.println(a);
			System.out.println(a.getIdAlumno());
			System.out.println(a.getNombre());
			System.out.println("Curso:");
			System.out.println("\t"+a.getCurso().getId());
			System.out.println("\t"+a.getCurso().getDescripcion());
			System.out.println("\tNota: "+a.getNota());
			
			in.close();

			
		}while(!cadena.equalsIgnoreCase("*"));
		
		//Cerramos
		clientSocket.close();
	}

}
