package replitsorulari;

import java.util.Arrays;
import java.util.List;

public class ArrayListeCevirme {

	public static void main(String[] args) {

//		Array i ARRAYLIST e çeviren Java Kodunu yazınız.
//		Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
//		 String arr[]={"Python","JAVA","PHP","Perl","C#","C++"};
//		  Arrays.asList(arr);
//		  List<String> list01=Arrays.asList(arr);
//		  System.out.println(list01);
		  
		  
		  //Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
		  //Array: [1232,2345,5467,678,3454,2312,3451] 
		
		int arr1[]= {1232,2345,5467,678,3454,2312,3451};
		  Arrays.sort(arr1);
		  System.out.println(Arrays.toString(arr1));
		  System.out.println(arr1[arr1.length-2]);
		  
		  
		  
	}

}
