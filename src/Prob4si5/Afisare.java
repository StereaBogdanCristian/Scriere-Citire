package Prob4si5;

import java.io.RandomAccessFile;

public class Afisare {

	static void afisare(String numeFisier) throws Exception {
		
		RandomAccessFile raf = new RandomAccessFile(numeFisier, "r");
		for (int i = 0; i < raf.length(); i++) {
			
			System.out.print((char)raf.read());
		}
		raf.close();
	}
}
