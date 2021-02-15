package replitsorulari;

import java.util.Arrays;

public class ArrayiTerstenYazdirma {
	  public static void main(String[] args) {
		  
		  int arr[]={1,2,3,4};
			int ters[]=new int[arr.length];
			for (int i =0; i < arr.length; i++) {
				ters[i]=arr[(arr.length-1)-i];
			}
		  System.out.println(ters[0]);
		  
		  
		  
		
	
	}
		  public static int[] reverse() {
			
			  int arr[]={1,2,3,4};
			int ters[]=new int[arr.length];
			for (int i =0; i < arr.length; i++) {
				ters[i]=arr[(arr.length-1)-i];
				
			}
			  
			  return ters;

					
	}

}
