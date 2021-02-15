package replitsorulari;

import java.util.Scanner;

public class StringSoru1 {

	public static void main(String[] args) {

		//girilen stringi tersten yazdirin
		
		  Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		    for (int i =str.length()-1; i >=0; i--) {
				System.out.print(str.charAt(i));
			}
		    
		  ///While ile cozum
		    int uzunluk=str.length();
		    while (uzunluk>0) {
			System.out.print(str.charAt(uzunluk-1));
				uzunluk--;
			}
		    
		    
		  scan.close();  
		    
	}

}
