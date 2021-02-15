package replitsorulari;

import java.util.Scanner;

public class AsalSayi {

  public static void main(String[] args) {
	
	  Scanner scan=new Scanner(System.in);
	  System.out.println("sayi gir");
	  int num=scan.nextInt();
	  int count=0;
	  
		for (int i = 2; i <num; i++) {
			if (num%i==0) {
				count++;
			}
		}
	  if (count==0) {
		System.out.println("asaldir");
	}else {
		System.out.println("asal degil");
	}
	  
	  
  }
	
	
	}
	

	
	
	
	
	
	
	