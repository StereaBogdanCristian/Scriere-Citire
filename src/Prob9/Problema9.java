package Prob9;

import java.io.File;
import java.io.IOException;

public class Problema9 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Tutoriale PROGRAMARE\\Java\\Laboratoare\\1\\Rezolvari\\Lab5");
		
		String[] fisiere = file.list();
		
		for (String fis : fisiere) {
		
		
		
		if (Fisier.gasit(fis, "are")) System.out.println("In fisierul >>>>   " + fis + "   <<<<< se gasese: are");
		}
	}

}
