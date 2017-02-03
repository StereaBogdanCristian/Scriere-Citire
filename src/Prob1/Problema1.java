package Prob1;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Problema1 {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader(args[0]);
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String linie = "";
		int i=1;
		
		while ((linie = lnr.readLine()) != null) {
			System.out.println(linie + "   " + i++);
		}
		
		lnr.close();
		
	}

}
