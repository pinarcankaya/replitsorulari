package replitsorulari;

import java.util.Scanner;

public class MetniTerstenYazdirma {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("metin gir");
		String sentence = scan.nextLine();
	   StringBuilder str= new StringBuilder(sentence);
	    str.reverse();
	    System.out.println(str);
		
//		for (int i =sentence.length()-1 ; i >= 0; i--) {
//			System.out.print(sentence.charAt(i));
		}
		
	}


