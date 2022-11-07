package org.example;

import org.w3c.dom.*;

//Tener cuidado y no importar la de element, porque da error.
//import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.awt.geom.RectangularShape;
import java.io.File;

public class xml_clase1 {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        File f = new File( ("FichEmpleados.xml"));

        Element raiz, elem, elemSub, elemAttr;

        Text text;

        Attr attr;

        DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();
        DocumentBuilder dB = dBF.newDocumentBuilder();

        DOMImplementation imp = dB.getDOMImplementation();

        //La raíz se crea aquí
        Document doc = imp.createDocument(null,"Empleados", null);
        doc.setXmlVersion("1.0");


        ////////////////////////////////EMPLEADO1////////////////////////

        raiz = doc.createElement("empleado");
        doc.getDocumentElement().appendChild((Node) raiz);

        elem = doc.createElement("id");
        text=doc.createTextNode("1");
        raiz.appendChild(elem);
        elem.appendChild(text);

        elem = doc.createElement("apellidos");
        raiz.appendChild(elem);
        attr=doc.createAttribute("orden");
        attr.setValue("primero");
        elem.setAttributeNode(attr);

        elemSub=doc.createElement("apellido1");
        text=doc.createTextNode("Pérez");
        elem.appendChild(elemSub);
        elemSub.appendChild(text);

        elemSub=doc.createElement("apellido2");
        text=doc.createTextNode("Sanz");
        elem.appendChild(elemSub);
        elemSub.appendChild(text);

        elem=doc.createElement("dep");
        text=doc.createTextNode("150");
        raiz.appendChild(elem);
        elem.appendChild(text);

        ////////////////////////////////EMPLEADO2////////////////////////
        raiz = doc.createElement("empleado");
        doc.getDocumentElement().appendChild(raiz);

        elem = doc.createElement("id");
        text=doc.createTextNode("2");
        raiz.appendChild(elem);
        elem.appendChild(text);

        elem = doc.createElement("apellidos");
        raiz.appendChild(elem);
        attr=doc.createAttribute("orden");
        attr.setValue("segundo");
        elem.setAttributeNode(attr);

        elemSub=doc.createElement("apellido1");
        text=doc.createTextNode("Flores");
        elem.appendChild(elemSub);
        elemSub.appendChild(text);

        elemSub=doc.createElement("apellido2");
        text=doc.createTextNode("López");
        elem.appendChild(elemSub);
        elemSub.appendChild(text);

        elem=doc.createElement("dep");
        text=doc.createTextNode("300");
        raiz.appendChild(elem);
        elem.appendChild(text);



        Source source = new DOMSource(doc);
        Result result = new StreamResult(f);
        Transformer transf = TransformerFactory.newInstance().newTransformer();
        transf.transform(source, result);

        System.out.println("FIN");
    }
}
