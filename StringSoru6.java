package replitsorulari;

import java.util.Scanner;

public class StringSoru6 {

	public static void main(String[] args) {

		// Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye
		// doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
		// Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu
		// yazın.
//
//		Scanner scan = new Scanner(System.in);
//		String word = scan.nextLine();
//		word = word.toLowerCase().replace(" ", "");
//
//		StringBuilder stb = new StringBuilder(word);
		//System.out.println(lutfen polidrom bir kelime giriniz);
//		String str1 = stb.reverse().toString();
//		System.out.println(str1.equals(word));

		
		///2.yol
		Scanner sc =new Scanner (System.in);
		System.out.println("lütfen Polindron keime giriniz.");
		String str =sc.nextLine();
		
		String tersStr = "";
		int count =str.length()-1;
		
		for (;count>=0;count--) {
			tersStr =tersStr +str.charAt(count);
					
		}
		if(tersStr.equals(str)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

		
	}

}
