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
	static List < Individual > LIST_OUTPUT= new ArrayList < Individual > ();

	public static void main(String[] args) {
		SpringApplication.run(FileConvertorApplication.class, args);
	}


	


	 private static Individual getIndividual(Node node,String firstname) {
	        // XMLReaderDOM domReader = new XMLReaderDOM();
//		 Individual user=null;
	        Individual user = new Individual();
	        String usersFirstName="";
	        String dummyUserName=firstname;
	        dummyUserName= dummyUserName.toUpperCase();
	        if (node.getNodeType() == Node.ELEMENT_NODE)
	        {
	            Element element = (Element) node;
	            user.setdataid(Integer.parseInt(getTagValue("DATAID", element)));
	           user.setFirstName(getTagValue("FIRST_NAME", element));
	           usersFirstName = user.getFirstName();
	           	if(usersFirstName.equals(dummyUserName)) {
	        	    try {
		            	 user.setSecondName(getTagValue("SECOND_NAME", element));
		        	}
		        	catch(NullPointerException e){
		        		System.out.println("NullPointerException thrown!");
		        	}
		            try {
		            	user.setComments1(getTagValue("COMMENTS1", element));
		            }
		            catch(NullPointerException e){
		            	System.out.println("NullPointerException thrown!");
		            }
	           }
	           else {
	        	   user=null;
	           }
	        }
   return user;
	    }
	 
	 private static String getTagValue(String tag, Element element) {		
	        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
	        Node node = (Node) nodeList.item(0);
	        return node.getNodeValue();
	    }


	public static List<Individual> readFile(String firstname) {
		// TODO Auto-generated method stub
		 String filePath = "C:\\Users\\suriya.ganesh\\Downloads\\consolidated.xml";
		 //string changes to identify
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
	            	if(getIndividual(nodeList.item(i), firstname)!=null) {
	            		IndividualList.add(getIndividual(nodeList.item(i), firstname));
	            	}
	            }
	            LIST_OUTPUT = IndividualList;
	        } catch (SAXException | ParserConfigurationException | IOException e1) {
	            e1.printStackTrace();
	        }
		return LIST_OUTPUT;
		
	}


}


