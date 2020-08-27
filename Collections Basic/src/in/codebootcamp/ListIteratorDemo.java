package in.codebootcamp;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		Set s;
		
		l.add("Ram");
		l.add("Ravan");
		l.add("Vishnu");
		l.add("Shiva");
		
		System.out.println(l);//[Ram, Ravan, Vishnu, Shiva]
		
		ListIterator ltr=l.listIterator();
		
		while(ltr.hasNext())
		{
			String str=(String)ltr.next();
			
			
			if(str.equals("Ravan"))
			{
				ltr.remove();
			}
			
			else if(str.equals("Ram"))
			{
				ltr.add("Lakshman");
			}
			
			else if(str.equals("Shiva"))
			{
				ltr.set("Bholenath");
			}
			
		}
		
		System.out.println(l);
		
	}

}
