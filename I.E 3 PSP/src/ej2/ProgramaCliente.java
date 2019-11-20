package ej2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProgramaCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		String Host = "localhost";
		int Puerto = 6000;
		
		Socket Cliente = new Socket(Host, Puerto);
		
		InetAddress i = Cliente.getInetAddress();
		
		System.out.println("Puerto local: "+ Cliente.getLocalPort());
		System.out.println("Puerto remoto: "+ Cliente.getPort());
		System.out.println("Nombre host/IP: "+ Cliente.getInetAddress());
		System.out.println("Host remoto: "+ i.getHostName().toString());
		System.out.println("IP Host remoto: "+ i.getHostAddress().toString());
		
		Cliente.close();
	}

}
