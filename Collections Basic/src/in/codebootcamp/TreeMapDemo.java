package in.codebootcamp;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap m=new TreeMap(new MyComparator5());
		
		m.put(101, "Sumit");
		m.put(103, "Ajay");
		m.put(105, "Vikas");
		m.put(100, "Raman");
		
		System.out.println(m);

	}

}

class MyComparator5 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		return i2.compareTo(i1);
		
		
		
		
	}
}
