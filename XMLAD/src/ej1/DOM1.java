package ej1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
	      
		//LEER
		try {
			DocumentBuilder builder=factory.newDocumentBuilder();
			
			Document d=builder.parse("alumnos.xml");
			NodeList alumnos= d.getElementsByTagName("alumno");
			for (int i = 0; i < alumnos.getLength(); i++) {
				Node p=alumnos.item(i);
				if(p.getNodeType()==Node.ELEMENT_NODE) {
					Element alumno=(Element) p;
					String nombre=alumno.getElementsByTagName("nombre").item(0).getTextContent();
					String edad=alumno.getElementsByTagName("edad").item(0).getTextContent();
					System.out.println("Alumno: "+nombre);
					System.out.println("Edad: "+edad);
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
