package replitsorulari;

import java.util.Arrays;
import java.util.Scanner;
class AnagramSorusu {
	
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		System.out.println(isAnagram(word1,word2));
		 
  }

	//Anagram, bir kelimenin harflerinden başka bir kelime oluşturmaya denir.
	//Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
	
 public static boolean isAnagram(String word1, String word2) {
   
  
		 String arr[]=word1.split("");
		 String arr1[]=word2.split("");
		 Arrays.sort(arr);
		 Arrays.sort(arr1);
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(arr1));
		// System.out.println(Arrays.equals(arr, arr1));
		   return Arrays.equals(arr, arr1);
    
  }
}