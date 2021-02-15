package replitsorulari;

import java.util.Scanner;

public class MetniUcUcaEkleme {

	public static void main(String[] args) {

//		 Scanner input = new Scanner(System.in);
//		    String str1 = input.nextLine();
//		     String str2 = input.nextLine();
//		     
//		     
//		     System.out.println(str1.concat(" ").concat(str2));
//		     
		     
	//Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.
		     Scanner input1 = new Scanner(System.in);
		     System.out.println("metin giriniz");
		     String metin=input1.nextLine();		     
		     String aranan=input1.nextLine();
		     
		     if(metin.contains(aranan)) {
		    	 System.out.println("True");
		     }else {
		    	 System.out.println("False");
		     }
		    
		     
		     
		     
		     
		     
		     

	}

}
