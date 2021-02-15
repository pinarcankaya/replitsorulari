package replitsorulari;

import java.util.TreeSet;

public class TreeSetler {

	public static void main(String[] args) {

		TreeSet<String> tSet1=new TreeSet<>();
	    tSet1.add("mavi");
	    tSet1.add("yesil");
	    tSet1.add("kirmizi");
	    tSet1.add("sari");
	    System.out.println(tSet1);
	    TreeSet<String> tSet2=new TreeSet<>();
	    tSet2.add("yesil");
	    tSet2.add("mavi");
	    tSet2.add("pembe");
	    tSet2.add("turuncu");
	    System.out.println(tSet2);
	    System.out.println("Karsilastirma Sonucu:");
	    
	    for(int i=0; i< tSet1.size(); i++){
	       for(int j=0; j< tSet2.size(); j++){
	         if(i==j){
	           System.out.println("yes");
	         }else{
	            System.out.println("no");
	         }
	       }
	    }
	}

}
