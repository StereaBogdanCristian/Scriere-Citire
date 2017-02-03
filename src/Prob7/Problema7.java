package Prob7;

import java.util.Scanner;

public class Problema7 {
	
	public static void main(String[] args) {
		
		Scanner tastatura = new Scanner(System.in);
		
		System.out.println("Introduceti un test: ");
		String text = tastatura.nextLine();
		System.out.println(text);
		
		tastatura.close();
	}

}
