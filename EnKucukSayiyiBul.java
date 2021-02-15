package replitsorulari;

import java.util.Scanner;

public class EnKucukSayiyiBul {

	public static void main(String[] args) {

		//Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen uc  sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		
		 kucukSayi(sayi1,sayi2,sayi3);
	}
		public static void kucukSayi(double sayi1,double sayi2,double sayi3) {
		
		
		if(sayi1<sayi2 && sayi1<sayi3) {
			System.out.println("kucuk sayi: " +sayi1);
		}else if(sayi2<sayi1 && sayi2<sayi3) {
			System.out.println("kucuk sayi: " + sayi2);
		}else {
			System.out.println("kucuk sayi: " + sayi3);
		}
	
	

	
		
}
}
