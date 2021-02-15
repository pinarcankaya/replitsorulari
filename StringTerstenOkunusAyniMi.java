package replitsorulari;

import java.util.Scanner;

public class StringTerstenOkunusAyniMi {

	public static void main(String[] args) {

		//Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir. 
		//Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

		
			Scanner scan = new Scanner(System.in);
			System.out.println("metin gir");
		    String word = scan.nextLine();
		    word = word.toLowerCase().replace(" ", "");
		   
		    StringBuilder str=new StringBuilder(word);
		    String str1=str.reverse().toString();
		    
		    System.out.println(str1.equals(word));
		
		
		
		
		
		
		
		
	}
}
