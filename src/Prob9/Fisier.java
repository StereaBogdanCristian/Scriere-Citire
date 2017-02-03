package Prob9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fisier {
	
	public static boolean gasit(String nume, String sir) throws IOException {
		
		boolean gasit = false;
		
		if (nume.substring(nume.lastIndexOf(".") + 1).equals("txt")) {
			
			FileReader fr = new FileReader(nume);
			BufferedReader br = new BufferedReader(fr);
			String linie;
			
			while ((linie = br.readLine()) != null) {
				
				if (linie.lastIndexOf(sir) > 0) {
					gasit = true;
				}
			}
			br.close();
		}
		return gasit;
	}

}
