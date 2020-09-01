package in.codebootcamp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap m=new HashMap();
		m.put("Chirag",1000);
		m.put("Bablu", 3000);
		m.put("Vivek", 4000);
		m.put("Nitish", 2500);
		
		System.out.println(m);// {Nitish=2500, Bablu=3000, Vivek=4000, Chirag=1000}
		
		System.out.println(m.put("Chirag", 7000));// <-- Is it right??//1000
		
		System.out.println(m); //{Nitish=2500, Bablu=3000, Vivek=4000, Chirag=7000}
		
		Set AllKeys = m.keySet();
		
		System.out.println(AllKeys); // [Nitish, Bablu, Vivek, Chirag]
		
		Collection AllValues = m.values();
		
		System.out.println(AllValues);//[2500, 3000, 4000, 7000]
		
		
		Set entrySet = m.entrySet();
		System.out.println(entrySet);//[Nitish=2500, Bablu=3000, Vivek=4000, Chirag=7000]
		
		
		Iterator itr=entrySet.iterator();
		
		System.out.println("\n\n");
		while(itr.hasNext())
		{
			Map.Entry singleEntry=(Map.Entry)itr.next();
			
			System.out.println(singleEntry.getKey()+"--->"+singleEntry.getValue());
			
			if(singleEntry.getKey().equals("Bablu"))
			{
				singleEntry.setValue(8000);
			}
			
			
		}  
		
//		Nitish--->2500
//		Bablu--->3000
//		Vivek--->4000
//		Chirag--->7000
		
		System.out.println(m);//{Nitish=2500, Bablu=8000, Vivek=4000, Chirag=7000}

	}

}
