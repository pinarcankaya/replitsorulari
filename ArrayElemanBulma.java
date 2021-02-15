package replitsorulari;

import java.util.Arrays;

public class ArrayElemanBulma {

	public static void main(String[] args) {

		//Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
		int arr[]= {12,15,43,23,56,76,78,90,77,43};
		Arrays.sort(arr);
		
		int sayi=43;
		
		System.out.print(sayi + " sayisi arrayin "+ Arrays.binarySearch(arr, 43) + " . elemani");
		//56 sayısı arrayin 4. elemanı

	}

}
