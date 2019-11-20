package ej1;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAX2 {

	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		// TODO Auto-generated method stub

		SAXParserFactory fact=SAXParserFactory.newInstance();
		SAXParser saxParser=fact.newSAXParser();
		
		DefaultHandler handle=new DefaultHandler() {
			boolean bnombre=false;
			boolean bedad=false;
			
			public void startElement(String uri, String localName, String qName, Attributes atributos) throws SAXException {
				if(qName.equalsIgnoreCase("nombre"))
					bnombre=true;
				if(qName.equalsIgnoreCase("edad"))
					bedad=true;
			}
			
			public void endElement(String uri, String localName, String qName, Attributes atributos) throws SAXException {
				
			}
			
			public void characters(char ch[], int start, int lenght) throws SAXException {
				if(bnombre) {
					System.out.println("Nombre: "+new String(ch,start,lenght));
					bnombre=false;
				}
				if(bedad) {
					System.out.println("Edad: "+new String(ch,start,lenght));
					bedad=false;
				}
			}
		};
		
		saxParser.parse("alumnos.xml",handle);
	}

}
