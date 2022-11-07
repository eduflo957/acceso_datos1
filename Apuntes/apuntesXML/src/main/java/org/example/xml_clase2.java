package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.io.IOException;

public class xml_clase2 {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File f = new File(("FichEmpleados.xml"));

        DocumentBuilderFactory dbF = DocumentBuilderFactory.newInstance();
        DocumentBuilder dB = dbF.newDocumentBuilder();

        Document docL = dB.parse(f);

        NodeList empleados = docL.getElementsByTagName(("empleado"));
        System.out.println(empleados.getLength());

        Element element = null;

        for (int i=0; i<empleados.getLength();i++){
            //Cada nodo tiene una numeración
            //Es de arriba a abajo y empieza en el cero.
            Node emp = empleados.item(i);
            element = (Element) emp;
            //Esto lo que hace es que te dice el número de item
            // System.out.println(element.getElementsByTagName("id").item(i));
            //System.out.println(element.getElementsByTagName("id").item(0).getTextContent());
            System.out.println(element.getElementsByTagName("id").item(0).getTextContent());
            System.out.println(element.getElementsByTagName("apellido1").item(0).getTextContent());
            Element elemAt = (Element) element.getElementsByTagName("apellidos").item(0);
            System.out.println(element.getAttribute("orden"));
        }
    }
}
