package replitsorulari;

import java.util.Arrays;

public class ArraysSoru {

	public static void main(String[] args) {

		/*Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
		not: Test datadaki değerleri kullanınız. */
		
		int arr[]= {1232, 1134,2345,1022};
		String str[]= {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
		Arrays.sort(arr);
		Arrays.sort(str);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(str));
		
	}

}
