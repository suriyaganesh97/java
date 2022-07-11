package com.test.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


@SpringBootApplication
public class FileConvertorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FileConvertorApplication.class, args);
		 String filePath = "C:\\Users\\suriya.ganesh\\Downloads\\consolidated.xml";
	        File xmlFile = new File(filePath);
	        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder;
	        try {
	            dBuilder = dbFactory.newDocumentBuilder();
	            Document doc = dBuilder.parse(xmlFile);
	            doc.getDocumentElement().normalize();
	            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	            NodeList nodeList = doc.getElementsByTagName("INDIVIDUAL");
	            // now XML is loaded as Document in memory, lets convert it to Object List
	            List < Individual > IndividualList = new ArrayList < Individual > ();

	            for (int i = 0; i < nodeList.getLength(); i++) {
	            	IndividualList.add(getIndividual(nodeList.item(i)));
	            }
	            // lets print User list information
	            for (Individual emp: IndividualList) {
	                System.out.println(emp.toString());
	            }
	        } catch (SAXException | ParserConfigurationException | IOException e1) {
	            e1.printStackTrace();
	        }

	}
	
	
	 private static Individual getIndividual(Node node) {
	        // XMLReaderDOM domReader = new XMLReaderDOM();
	        Individual user = new Individual();
	        if (node.getNodeType() == Node.ELEMENT_NODE) {
	            Element element = (Element) node;
	            user.setdataid(Integer.parseInt(getTagValue("DATAID", element)));
	            user.setFirstName(getTagValue("FIRST_NAME", element));
//	            user.setSecondName(getTagValue("SECOND_NAME", element));
//	            user.setThirdName(getTagValue("THIRD_NAME", element));
	            user.setVersionNum(Integer.parseInt(getTagValue("VERSIONNUM", element)));
//	            user.setComments1(getTagValue("COMMENTS1", element));
	        }
	        return user;
	    }
	 
	 private static String getTagValue(String tag, Element element) {
		
	        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		 
	        Node node = (Node) nodeList.item(0);
	        return node.getNodeValue();
	    }
	
	 

}


