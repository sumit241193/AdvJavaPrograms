package in.codebootcamp;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap m=new LinkedHashMap();
		m.put(101, "Ajay");
		m.put(104, "Sumit");
		m.put(102, "Varun");
		m.put(100, "Ketan");
		
		System.out.println(m);//{101=Ajay, 104=Sumit, 102=Varun, 100=Ketan}

	}

}
