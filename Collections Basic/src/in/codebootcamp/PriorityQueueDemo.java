package in.codebootcamp;

import java.util.Comparator;
import java.util.PriorityQueue;


class MyComparatorQueue implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=o2.toString();
		
		return s2.compareTo(s1);
		
	}
	
}

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue(15,new MyComparatorQueue());
		
		//System.out.println(q.peek()); //null
		//System.out.println(q.element());// R.E NoSuchElementException
		
		q.offer("A");
		q.offer("X");
		q.offer("L");
		q.offer("V");
		q.offer("P");
		
		System.out.println(q);

	}

}
