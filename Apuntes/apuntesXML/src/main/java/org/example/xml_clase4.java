package org.example;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.File;
import java.io.IOException;

public class xml_clase4 {
    public static void main(String[] args) throws SAXException, IOException {
        File f = new File("FichEmpleados.xml");
        XMLReader pXML = XMLReaderFactory.createXMLReader();
        MiDefaultHandler4 mDF = new MiDefaultHandler4();
        pXML.setContentHandler(mDF);

        //Para decirle qué fichero vamos a tratar
        InputSource fichXML = new InputSource("FichEmpleados.xml");

        pXML.parse(fichXML);
        System.out.println("hola");
    }
}

class MiDefaultHandler4 extends DefaultHandler {
    boolean bId = false;
    MiDefaultHandler4() {
        super();
    }

    public void startDocument() {
        //Lo quito porque aquí no hace falta
        //System.out.println("Comienzo SAX");
    }

    public void endDocument() {
        //Lo quito porque aquí no hace falta
        //System.out.println("Final SAX");
    }

    public void startElement(String uri, String nombre, String nombreC, Attributes atts) {
        //Lo que hago con esto es que sólo leo cuando encuentro un ID
        if (nombreC.equals("id"))
            bId=true;
    }

    //Lo dejamos sin nada porque no vamos a utilizarlo
    public void endElement(String uri, String nombre, String nombreC, Attributes atts) {
    }

    public void characters(char[] ch, int inicio, int longitud) {
        if (bId) {
            String st = new String(ch, inicio, longitud);
            System.out.println(st);
            bId=false;
        }

    }
}
