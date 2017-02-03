package Prob8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Problema8 {
	
	public static void main(String[] args) throws Exception {
		
		RandomAccessFile raf = new RandomAccessFile("Problema8.txt", "r");
		
		long lungime = raf.length();
		byte[] b = new byte[(int)lungime];
		raf.readFully(b);
		
		for (byte c : b) {
			System.out.print((char)c);
		}
		
		System.out.println();
		
		raf.seek(0);
		String linie;
		
		while ((linie = raf.readLine()) != null) {
			System.out.println(linie);
		}
	}

}
