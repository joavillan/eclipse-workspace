package ej8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServidorUDP {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//Puerto 12345
		DatagramSocket socket=new DatagramSocket(12345);
		byte[] recibidos=new byte[1024];
		
		System.out.println("Esperando datagrama...");
		DatagramPacket recibo=new DatagramPacket(recibidos,recibidos.length);
		socket.receive(recibo);

		ByteArrayInputStream bais=new ByteArrayInputStream(recibidos);
		ObjectInputStream in=new ObjectInputStream(bais);
		Personas p=(Personas) in.readObject();
		System.out.println(p.toString());
		
		int puertoEnvio=recibo.getPort();
		in.close();
		
		
		p.setDni("1548464a");
		p.setNombre("Ale");
		p.setApellido("Pérez");
		
		ByteArrayOutputStream bs=new ByteArrayOutputStream();
		ObjectOutputStream out=new ObjectOutputStream(bs);
		out.writeObject(p);
		out.close();
		
		byte[] mensaje=bs.toByteArray();
		
		InetAddress destino=InetAddress.getLocalHost();
		int port=12346;
		
		DatagramPacket envio=new DatagramPacket(mensaje, mensaje.length,destino,puertoEnvio);
		
		socket.send(envio);
		socket.close();
	}

}
