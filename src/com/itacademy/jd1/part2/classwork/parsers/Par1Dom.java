package com.itacademy.jd1.part2.classwork.parsers;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Par1Dom {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File fXmlFile = new File("src/com/itacademy/jd1/part2/classwork/xml/task7/task7.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		Element documentElement = doc.getDocumentElement();
		NodeList pointElements = documentElement.getElementsByTagName("point");
		int pointsCount = pointElements.getLength();
		System.out.println("points count:" + pointsCount);
		determineMaxY(pointElements);
		determineLastNodeUnit(pointElements, pointsCount);
	}

	private static void determineLastNodeUnit(NodeList pointElements, int pointsCount) {
		Node lastPointNode = pointElements.item(pointsCount - 1);
		Node unitAttribute = lastPointNode.getAttributes().getNamedItem("unit");
		System.out.println("unit value of the last node:" + unitAttribute.getNodeValue());
	}

	private static void determineMaxY(NodeList pointElements) {
		Integer maxY = null;
		for (int i = 0; i < pointElements.getLength(); i++) {
			Node currentNode = pointElements.item(i);
			NodeList childNodes = currentNode.getChildNodes();
			for (int j = 0; j < childNodes.getLength(); j++) {
				Node currentChildNode = childNodes.item(j);
				if ("y".equals(currentChildNode.getNodeName())) {
					Integer y = Integer.valueOf(currentChildNode.getTextContent());
					if (maxY == null || y > maxY) {
						maxY = y;
					}
				}
			}
		}
		System.out.println("max y:" + maxY);
	}
}