import org.w3c.dom.*;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class xml_clase1 {
    public static void main(String[] args) throws ParserConfigurationException {
        File f = new File( ("FichEmpleados.xml"));

        Element raiz, elem, elemSub, elemAttr;

        Text text;

        Attr attr;

        DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();
        DocumentBuilder dB = dBF.newDocumentBuilder();

        DOMImplementation imp = dB.getDOMImplementation();

        Document doc = imp.createDocument(null,"Empleados", null);
        doc.setXmlVersion("1.0");
        //En eclipse no hace falta los casting element y node

        raiz = (Element) doc.createElement("empleado");
        doc.getDocumentElement().appendChild((Node) raiz);

        elem = (Element) doc.createElement("id");
        text=doc.createTextNode("1");
        ((Node) raiz).appendChild((Node) elem);
        ((Node) elem).appendChild(text);

    }
}
