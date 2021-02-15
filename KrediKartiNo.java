package replitsorulari;

import java.util.Arrays;

public class KrediKartiNo {

	public static void main(String[] args) {

		//Kredi kartı numarası alan ve yalnızca son dört karakteri görüntüleyen bir method yazın. 
		//Kart numarasının geri kalanı ************ ile değiştirilmelidir
		//cardHide("1234123456785678")======"************5678"
			String c="1234123456785678";
			String on="************";
			String son=c.substring(c.length()-4);
			
			String gizliKart=on+son;
			System.out.println(gizliKart);
//	///2.yol
		//	String son=c.replace(c.substring(0, c.length()-4), "************");
//			System.out.print(son);
			
			///3.yol
//			String arr[]=c.split("");	
//			for (int i = 0; i < arr.length-4; i++) {
//				arr[i]="*";
			}
		//	System.out.print(Arrays.toString(arr));
//			String kart="";
//			for (String w : arr) {
//				kart=kart+w;
//			}
//		System.out.println(kart);
		
		
		
	}
		
		
			
	
