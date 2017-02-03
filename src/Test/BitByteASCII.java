package Test;

import java.io.Console;

public class BitByteASCII {
	
	public static void main(String[] args) {
		
		String s = "Acesta este un text\nscris pe doua randuri È";
		
		System.out.println(s);
		
		byte[] transformat = s.getBytes();
		for (byte b : transformat) {
			System.out.print(b + " ");
		}
		
		System.out.println();
		
		for (byte b : transformat) {
			System.out.print((char)b);
		}
		
		Console tastatura = System.console();
		
		
	}

}