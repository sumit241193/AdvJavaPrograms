package in.codebootcamp;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap m=new TreeMap(new MyComparator5());
		
		m.put("XXX", 10);
		m.put("AAA", 20);
		m.put("ZZZ", 30);
		m.put("LLL", 40);
		
		System.out.println(m);

	}

}

class MyComparator5 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s2.compareTo(s1);
		
		
	}
}
