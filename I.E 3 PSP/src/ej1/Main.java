package ej1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import utiles.Libreria;

public class Main {

	public static void main(String[] args) throws IOException {
        Libreria a1 = new Libreria();
        InetAddress[] direcciones = null;
        String dir = a1.excepcionstringcontexto("Introduce la dirección: ");
        try {
            direcciones = InetAddress.getAllByName(dir);
            System.out.println("Direcciones ip de : "+dir);
            for (int i = 0; i < direcciones.length; i++) {
                System.out.println(direcciones[i].toString());
                System.out.println("-----------------------------------");
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

}
