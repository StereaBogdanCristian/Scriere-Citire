package Prob3;

import java.io.FileReader;
import java.io.FileWriter;

public class Problema3 {

	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("Fisier.txt");
		FileWriter fw = new FileWriter("FisierM.txt");
		
		int c;
		
		while ((c = fr.read()) != -1 ) {
			
			System.out.print((char) c);
			fw.write(Character.toUpperCase((char) c));
		}
		
		fr.close();
		fw.close();
		
	}
}
