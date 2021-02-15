package replitsorulari;

import java.util.Scanner;

public class StringSoru4 {

	public static void main(String[] args) {

		// girilen kelimenin son karakterini silen ekrana yazdiran kod yazalim
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen  string giriniz");
		String str = scan.nextLine();
		System.out.println(str.substring(0, str.length()-1));   //son karakteri almayacak

		
		scan.close();
	}

}
