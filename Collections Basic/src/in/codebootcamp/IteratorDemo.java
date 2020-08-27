package in.codebootcamp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		
		
		
		ArrayList l=new ArrayList();
		
		for(int i=0;i<15;i++)
		{
			l.add(i);
		}
		
		System.out.println(l);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			Integer item=(Integer) itr.next();
			
			if(item%2==0)
			{
				System.out.println(item);
			}
			else
			{
				itr.remove();
			}
		}
		
		System.out.println(l);
		

	}

}
