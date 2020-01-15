package ej2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;


public class SubirFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FTPClient cliente=new FTPClient();
		String servidor="localhost";
		String user="usuario";
		String pass="usuario";
		
		try {
			System.out.println("Conectandose a "+servidor);
			cliente.connect(servidor);
			cliente.enterLocalPassiveMode();
			boolean login=cliente.login(user, pass);
			
			cliente.setFileType(FTP.BINARY_FILE_TYPE);
			String direc="/subidas";
			
			if(login) {
				System.out.println("Login correcto");
				
				if(!cliente.changeWorkingDirectory(direc)) {
					String directorio="subidas";
					if(cliente.makeDirectory(directorio)) {
						System.out.println("Directorio creado");
						cliente.changeWorkingDirectory(directorio);
					}else {
						System.out.println("No se ha podido crear el directorio");
						System.exit(0);
					}
				}
				
				System.out.println("Directorio actual: "+cliente.printWorkingDirectory());
				JFileChooser jfc=new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				String ruta="";
				String archivo="";
				int returnValue = jfc.showOpenDialog(null);
				// int returnValue = jfc.showSaveDialog(null);

				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc.getSelectedFile();
					System.out.println(selectedFile.getAbsolutePath());
					ruta=selectedFile.getAbsolutePath();
					archivo=selectedFile.getName();
				}
				
				BufferedInputStream in=new BufferedInputStream(new FileInputStream(ruta));
				cliente.storeFile(archivo,in);
				in.close();
				cliente.logout();
				cliente.disconnect();
				
			}else
				System.out.println("Login incorrecto");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
