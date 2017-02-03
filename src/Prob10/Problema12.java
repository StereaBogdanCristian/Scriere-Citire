package Prob10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problema12 {

	public static void main(String[] args) throws IOException {
		
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = new FileInputStream("Fisiermare.txt");
		FileOutputStream fos = new FileOutputStream("Fisiermarecopiat.txt");
		
		int citire;
		
		while ((citire = fis.read()) != -1) {
			fos.write(citire);
		}
		
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("Cu FileInputStream/OutputStream copierea fisierului a durat: " + elapsedTime);
	    
	    fis.close();
	    fos.close();
	    
	    //****************************************************************
	    
	    startTime = System.currentTimeMillis();
	    FileReader fr = new FileReader("Fisiermare.txt");
	    FileWriter fw = new FileWriter("Fisiermarecopiat1.txt");
		
		while ((citire = fr.read()) != -1) {
			fw.write(citire);
		}
		
		stopTime = System.currentTimeMillis();
	    elapsedTime = stopTime - startTime;
	    System.out.println("Cu FileReader/Writer copierea fisierului a durat: " + elapsedTime);
	    
	    fr.close();
	    fw.close();
	    
	    //****************************************************************
	    
	    startTime = System.currentTimeMillis();
	    FileReader fr1 = new FileReader("Fisiermare.txt");
	    BufferedReader br = new BufferedReader (fr1);
	    FileWriter fw1 = new FileWriter("Fisiermarecopiat2.txt");
	    BufferedWriter bw = new BufferedWriter(fw1);
		
	    String linie;
		while ((linie = br.readLine()) != null) {
			bw.write(citire);
		}
		
		stopTime = System.currentTimeMillis();
	    elapsedTime = stopTime - startTime;
	    System.out.println("Cu BufferedReader/Writer copierea fisierului a durat: " + elapsedTime);
	    
	    br.close();
	    fr1.close();
	    bw.close();
	    fw1.close();
	}
}
