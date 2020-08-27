package in.codebootcamp;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		System.out.println(v.capacity());//10
		System.out.println("Initial Size-->"+v.size());
		
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
			
			System.out.println("After Adding Element-->"+v.size());
		}
		
		System.out.println(v);
		System.out.println(v.capacity());//10
		
		v.addElement("Sumit");// 11th position
		
		System.out.println("After adding Sumit element-->"+v.capacity());//20
		
		System.out.println(v);
		
		System.out.println("Number of elements in vector--->"+v.size());
	}

}
