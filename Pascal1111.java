package replitsorulari;

import java.util.Scanner;

public class Pascal1111 {

	public static void main(String[] args) {

	    int pascal,c=1,k,i,j;
	    System.out.print("bir sayi giriniz ");
	    Scanner in = new Scanner(System.in);
			    pascal = in.nextInt();
			    
	    for(i=0;i<pascal;i++)		//kullanicinin istedigi  kadar sirayi olusturur
	    {
	        for(k=1;k<=pascal-i;k++) //istenilen siradan bir eksik calisir
	        System.out.print(" ");
	        for(j=0;j<=i;j++)
	        {
	            if (j==0||i==0)
	                c=1;
	            else
	               c=c*(i-j+1)/j;
	            System.out.print(" "+c);
	        }
	        System.out.print("\n");
	    }
	}

}
