package replitsorulari;

import java.util.Scanner;

public class KacTaneSesliHarfVar {

	public static void main(String[] args) {

		//Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.
		Scanner scan=new Scanner(System.in);
		System.out.println("bir metin giriniz");
		String str=scan.nextLine();
		String sesli="aeiou";
		int sayac=0;
		harf(sesli,str,sayac);
		
		}
	public static void harf(String sesli,String str, int sayac) {
		
		sesli="aeiou";
		sayac=0;
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < sesli.length(); j++) {
				if (str.charAt(i)==sesli.charAt(j)) {
					sayac++;
				}
			}
			
				
			}
		System.out.println("Stringdeki sesli harf sayisi:" +sayac);
		
		
		
	}
	
	
	
	}



