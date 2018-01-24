package com.itacademy.jd1.part2.classwork.parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySAXParser extends DefaultHandler {

	private Integer maxY;
	private int pointsCount;

	private int currentPointX;
	private int currentPointY;
	private String currentUnit;

	boolean xTag = false;
	boolean yTag = false;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("point")) {
			currentUnit = attributes.getValue("unit");
			pointsCount++;
		} else if (qName.equalsIgnoreCase("y")) {
			yTag = true;
		} else if (qName.equalsIgnoreCase("x")) {
			xTag = true;
		}

	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		if (yTag) {
			Integer y = Integer.parseInt(new String(ch, start, length));
			if (maxY == null || y > maxY) {
				maxY = y;
			}
			currentPointY = y;
			yTag = false;
		} else if (xTag) {
			currentPointX = Integer.parseInt(new String(ch, start, length));
			xTag = false;
		}

	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("points count:" + pointsCount);
		System.out.println("max y:" + maxY);
		System.out.println(String.format("last point x=%s, y=%s, unit=%s", currentPointX, currentPointY, currentUnit));
		super.endDocument();
	}
}