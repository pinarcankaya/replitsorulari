package replitsorulari;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {

	//	Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir yil giriniz");
		int yil=scan.nextInt();
		
		System.out.println(artikYil(yil));
		
	}
	public static boolean artikYil(int yil) {
		
		if(yil%100==0 && yil%400==0) {
			return true;
		}else if (yil%100!=0 && yil%4==0) {
			return true;
		}else {
			return false;
		}
		
		
		
		
		
	}

}
