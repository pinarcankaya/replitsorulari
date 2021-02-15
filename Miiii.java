package replitsorulari;

import java.util.Scanner;

public class Miiii {

	public static void main(String[] args) {

		
		//Girilecek iki String nesnesinin aynı verileri içerip içermediğini kontrol etmek için 
		//bir Java programı yazın
		
	  Scanner scan =new Scanner(System.in);
		  String str1=scan.nextLine().toLowerCase();
		  String str2=scan.nextLine().toLowerCase();
		  System.out.println(str1.equals(str2));
		  
		  //Girilen String değerin uzunluğunu yazdıran Java kodunu yazınız.
		  Scanner sc =new Scanner(System.in);
		  String str=sc.nextLine();
		  System.out.println(str +" "+str.length() + " karakterdir" );
	}

}
