package in.codebootcamp;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		
		h.add(20);
		h.add("Z");
		h.add(20);
	
		h.add(10);
		h.add(null);
		h.add("A");
		
		h.hashCode();
		
		System.out.println(h);// output will be random we can not predict bcoz set never preserves insertion order

	}

}
