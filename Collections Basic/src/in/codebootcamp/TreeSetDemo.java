package in.codebootcamp;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
						
		t.add("K");  
		t.add("Z"); // "Z".compareTo("K")--> O.P ["K","Z"]
		t.add("A");// "A".compareTo("K")--> ["A","K","Z"]
		t.add("A");//"A".compareTo("A")--> ["A","K","Z"]
		System.out.println(t);
	}

}
