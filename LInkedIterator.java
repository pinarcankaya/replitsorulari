package replitsorulari;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LInkedIterator {

	public static void main(String[] args) {

//		 LinkedList<String> renk=new LinkedList<>();
//		    renk.add("sari");
//		    renk.add("mavi");
//		    renk.add("turuncu");
//		    renk.add("siyah");
//		    renk.add("yesil");
//		    renk.add("beyaz");
//		    System.out.println(renk);
//		    
//		    Iterator<String> iterator=renk.iterator();
//		   
//		      while (iterator.hasNext()) {
//			    	Object eleman=iterator.next();
//			    	if(eleman.equals(renk.get(0))){
//			    	  System.out.println("ilk eleman :" +eleman);
//			    	}if(eleman.equals(renk.get(renk.size()-1))) {
//			    		System.out.println("son eleman :" +eleman);
//			    	}
//		      } 
		LinkedList<String> renk=new LinkedList<>();
		   renk.add("sari");
		   renk.add("mavi");
		   renk.add("yesil");
		   renk.add("kirmizi");
		   renk.add("beyaz");
		   renk.add("mor");
		   System.out.println("Orijinal linked list: "+renk);
		   
		   ListIterator<String> iterator=renk.listIterator();
		    while(iterator.hasNext()){
		      Object eleman=iterator.next();
		    }
		    System.out.println("linkedList Tersi: ");
		    while(iterator.hasPrevious()){
		      Object eleman2=iterator.previous();
		     
		      System.out.println(eleman2);
		    }
		   
		  }
}

	
	

