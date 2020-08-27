package in.codebootcamp;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		ArrayList arl=new ArrayList();
		arl.add("Dell");
		arl.add("Germany");
		arl.add(250);
		
		
		LinkedList l=new LinkedList(arl);
		l.add("Sumit");
		l.add(50);
		l.add(null);
		l.add("Sumit");
		
		System.out.println(l);// [Sumit, 50, null, Sumit]
		
		l.set(0, "Software");//[Software, 50, null, Sumit]
		System.out.println(l);
		l.add(0,"Priya");//[Priya,Software, 50, null, Sumit]
		
		System.out.println(l);
		
		l.removeLast();
		
		System.out.println(l);//[Priya, Software, 50, null]
		
		l.addFirst("Lenovo");
		
		System.out.println(l);//[Lenovo, Priya, Software, 50, null]
		

	}

}
