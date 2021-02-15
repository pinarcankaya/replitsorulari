package replitsorulari;

public class ArraydeCiftSayiBulma {

	public static void main(String[] args) {

//		Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
//		Array: [1,2,3,4,5,6,7,8,9]
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int count1=0;
		int count2=0;
		for (int w : arr) {
			if (w%2==0) {
				count1++;
			}else {
				count2++;
			}
			
		}
		System.out.println("tek sayi" + count1);
		System.out.println("cift sayi" + count2);
		
		
	}
	

}
