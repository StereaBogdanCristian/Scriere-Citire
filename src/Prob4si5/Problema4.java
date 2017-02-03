package Prob4si5;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Problema4 {

	public static void main(String[] args) throws Exception {
		
		PrintStream ps = new PrintStream(new FileOutputStream("Print.txt"));
		
		ps.print(true);
		ps.print(2);
		ps.print(3);
		ps.print(4);
		ps.println(5);
		ps.print(6);
		ps.print(7);
		ps.print(8);
		ps.print(9);
		
		ps.close();
		
		PrintWriter pw = new PrintWriter(new FileWriter("Print1.txt"));
		
		pw.print('2');
		pw.print(2);
		pw.print(3);
		pw.print(4);
		pw.println(5);
		pw.print(6);
		pw.print(7);
		pw.print(8);
		pw.print(9);
		
		pw.close();
		
		Afisare.afisare("Print.txt");
		System.out.println();
		
		Afisare.afisare("Print1.txt");
		
		System.out.println();
		
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("Print2.txt"));
		
		dos.writeInt(1);
		dos.writeInt(2);
		dos.writeInt(3);
		dos.writeInt(4);
		dos.writeInt(5);
		dos.writeInt(6);
		dos.writeInt(7);
		dos.writeInt(8);
		dos.writeInt(9);
		
		dos.close();
		
		AfisareByte.afisare("Print2.txt");
	}
}
