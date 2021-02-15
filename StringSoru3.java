package replitsorulari;

import java.util.Scanner;

public class StringSoru3 {

	public static void main(String[] args) {

		//kullanicidan alinan string kumesi icerisinde aranan stringi bulan java kodunu yaz
		 Scanner scan = new Scanner(System.in);
		 System.out.println("lutfen iki farkli string giriniz");
		    String str1 = scan.nextLine();
		    System.out.println("lutfen aranacak kelimeyi  giriniz");
		    String straranan=scan.nextLine();
		    System.out.println(str1.contains(straranan));
		
		
		    scan.close();
	}

}
