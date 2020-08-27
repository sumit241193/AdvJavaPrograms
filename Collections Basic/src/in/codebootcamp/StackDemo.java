package in.codebootcamp;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		 Stack s=new Stack();
		 
		 s.push("A");
		 s.push("B");
		 s.push("C");
		 
		 System.out.println(s);//[A,B,C]
		 System.out.println(s.peek());//C
		 System.out.println(s);//[A,B,C]
		 
		 System.out.println(s.search("A")); // 3
		 System.out.println(s.search("D"));// -1

	}

}
