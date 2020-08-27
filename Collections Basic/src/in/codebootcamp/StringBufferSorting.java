package in.codebootcamp;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparatorString implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1<l2)
			return -1;
		else if(l1>l2)
			return +1;
		else
		return s1.compareTo(s2);
		
	} 

}

public class StringBufferSorting {

	
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparatorString());
		
		t.add(new StringBuffer("Shaktiman"));
		t.add(new StringBuffer("Jackal"));
		t.add(new StringBuffer("sanju"));
		t.add(new StringBuffer("Ironman"));
		t.add(new StringBuffer("Sanju"));
		
		
		
		
		
		
		System.out.println(t);

		
		
		

	}

}
