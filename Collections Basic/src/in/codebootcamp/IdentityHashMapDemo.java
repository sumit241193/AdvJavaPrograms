package in.codebootcamp;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdentityHashMap m=new IdentityHashMap();
		Integer I1=new Integer(101);
		Integer I2=new Integer(101);
		
		m.put(I1, "garvish");
		m.put(I2, "Shadab");
		
		System.out.println(m);
		
	}

}
