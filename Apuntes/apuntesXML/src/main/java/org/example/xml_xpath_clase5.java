package org.example;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//Xpath con java
public class xml_xpath_clase5 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        File f = new File ("FichEmpleados.xml");
        DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();
        DocumentBuilder dB = dBF.newDocumentBuilder();

        Document docL = dB.parse(f);

        XPathFactory xPF = XPathFactory.newInstance();
        XPath xP = xPF.newXPath();

        XPathExpression xExp = (XPathExpression) xP.compile("//empleado/apellidos/apellido1/text()");
        Object obj = xExp.evaluate(docL, XPathConstants.NODESET);

        NodeList nodos = (NodeList) obj;
        //Ahora recorros los nodos

        for (int i = 0;i <nodos.getLength();i++) {
            System.out.println(nodos.item(i).getNodeValue());
        }
    }
}