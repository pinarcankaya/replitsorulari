package replitsorulari;

import java.util.Scanner;

public class StringKarakterSilme {

	public static void main(String[] args) {

		//Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.
		Scanner scan=new Scanner(System.in);
	    System.out.println("bir metin giriniz");
	    String text=scan.nextLine();
	    System.out.println(text.substring(0, text.length()-1));
	
	    //2.yol
	    StringBuilder str=new StringBuilder(text);
	    str.deleteCharAt(text.length()-1);
	    System.out.println(str);
	}

}
