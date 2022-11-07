package org.example;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class xml_clase3 {
    public void main(String[] args) throws SAXException, IOException {
        XMLReader pXML = XMLReaderFactory.createXMLReader();
        MiDefaultHandler mDF = new MiDefaultHandler();
        pXML.setContentHandler(mDF);

        //Para decirle qué fichero vamos a tratar
        InputSource fichXML = new InputSource("FichEmpleados.xml");

        pXML.parse(fichXML);
        System.out.println("hola");
    }


    class MiDefaultHandler extends DefaultHandler {
        MiDefaultHandler() {
            super();
        }

        public void startDocument() {
            System.out.println("Comienzo SAX");
        }

        public void endDocument() {
            System.out.println("Final SAX");
        }

        public void startElement(String uri, String nombre, String nobreC, Attributes atts) {
            System.out.printf("Comienzo elemento $s", nombre);
        }

        public void characters(char[] ch, int inicio, int longitud) {
            String st = new String(ch, inicio, longitud);
            System.out.println(st);
        }
    }
}