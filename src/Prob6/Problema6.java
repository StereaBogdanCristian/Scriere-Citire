package Prob6;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema6 {

	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(System.in);
		
		System.out.println("Introduceti un text: ");
		String text = dis.readLine();
		System.out.println(text);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader tastatura = new BufferedReader(isr);
		System.out.println("Introduceti inca un text: ");
		System.out.println(tastatura.readLine());
		
		
	}
}
