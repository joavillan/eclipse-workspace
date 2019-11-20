package ej3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProgramaCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		String Host = "localhost";
		int Puerto = 6000;
		
		Socket Cliente = new Socket(Host, Puerto);
		
		DataInputStream flujoentrada = new DataInputStream(Cliente.getInputStream());
		
		DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
		flujoSalida.writeUTF(flujoentrada.readUTF().toLowerCase());
		
		flujoentrada.close();
		flujoSalida.close();
		Cliente.close();
	}

}
