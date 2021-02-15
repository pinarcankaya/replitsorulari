package replitsorulari;

import java.util.Scanner;

public class StringSoru2 {

	public static void main(String[] args) {

		//iki stringi birlestiriniz
		 Scanner scan = new Scanner(System.in);
		 System.out.println("lutfen iki farkli string giriniz");
		    String str1 = scan.nextLine();
		    String str2=scan.nextLine();
		    
		    System.out.println(str1.concat(str2));
	
	
	scan.close();
	}

}
