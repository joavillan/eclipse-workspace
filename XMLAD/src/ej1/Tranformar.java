package ej1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.OutputStream;

import javax.xml.transform.Source;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

import javax.xml.transform.stream.StreamResult;

import javax.xml.transform.stream.StreamSource;


public class Tranformar {

	public static void main(String[] args) throws FileNotFoundException, TransformerException {
		// TODO Auto-generated method stub

		TransformerFactory tFactory = TransformerFactory.newInstance();

		Source xslDoc = new StreamSource("alumnosPlantilla.xsl");
		Source xmlDoc = new StreamSource("alumnos.xml");
		String outputFileName = "alumnos.html";
	
		OutputStream htmlFile = new FileOutputStream(outputFileName);
		Transformer trasform = tFactory.newTransformer(xslDoc);
		trasform.transform(xmlDoc, new StreamResult(htmlFile));
	}

}
