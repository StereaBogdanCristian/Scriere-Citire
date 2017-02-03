package Prob2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Problema2 {
	
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("Fisier.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linie = "";
			int nrCuv = 0, nrLinii = 0;
			
			
			while ((linie = br.readLine()) != null) {
				nrCuv += nrCuvinte.cate(linie);
			}
			
			fr.close();
			
			System.out.println("Nr cuvinte = " + nrCuv);
		}
		
		catch (FileNotFoundException e) {
			System.out.println("Fisierul nu a fost gasit");
		}
		
		catch (IOException e) {
			System.out.println("Eroare la citire");
		}
		
	}

}
