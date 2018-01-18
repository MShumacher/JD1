package com.itacademy.jd1.classwork.lection11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializationSample {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		serializeSimpleObjects();
		deSerializeSimpleObjects();
	}

	private static void serializeSimpleObjects() throws IOException {
		FileOutputStream fos = new FileOutputStream("t.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeInt(12345);
		oos.writeObject("Today");
		oos.writeObject(new Date());
		oos.close();
		// ��������� ������ ������ � try. 
		// ��� ��������������� ��������:
		// try(FileOutputStream fos = new FileOutputStream("t.tmp");
		// ObjectOutputStream oos = new ObjectOutputStream(fos);)
		// {oos.writeInt(12345);
		// oos.writeObject("Today");
		// oos.writeObject(new Date());}

	}

	private static void deSerializeSimpleObjects() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("t.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		int i = ois.readInt();
		String today = (String) ois.readObject();
		Date date = (Date) ois.readObject();
		ois.close();
	}

}
