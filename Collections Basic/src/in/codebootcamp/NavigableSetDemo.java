package in.codebootcamp;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		
		System.out.println(t);
		
		System.out.println(t.floor(2500));//2000
		
		System.out.println(t.lower(2000));//1000
		
		System.out.println(t.ceiling(3400));//4000
		
		System.out.println(t.higher(4000));//5000
		
		System.out.println(t.pollFirst());//1000
		
		System.out.println(t);//[2000, 3000, 4000,5000]
		
		System.out.println(t.pollLast());//5000
		
		System.out.println(t);//[2000, 3000, 4000]
		
		System.out.println(t.descendingSet());//[4000, 3000, 2000]
		
		System.out.println(t);//[2000, 3000, 4000]

	}

}
