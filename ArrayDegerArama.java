package replitsorulari;

import java.util.Arrays;
import java.util.List;

public class ArrayDegerArama {

	public static void main(String[] args) {

		//yazılan değerin array içerisinde arayan Java Kodu yazınız.

		int arr[]={1551,1223,1443,1267,1789,1023,2020};
		int count=0;
		int count1=0;
		int num1=2020;
		int num2 =2010;
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] == num1) {
				count++;
			
				if (count>0) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
				
		for (int j = 0; j < arr.length ; j++) {
					if (arr[j] == num2) {
						count1++;
				
			}
		}	
		if (count1>0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}	

		}
	}
	
}

