package Prob4si5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AfisareByte {

	static void afisare(String nume) throws Exception {
		
		DataInputStream dis = new DataInputStream(new FileInputStream("Print2.txt"));
		
		while (dis.available() > 0) {
			System.out.println(dis.readInt());
		}
		
		dis.close();
	}
}
