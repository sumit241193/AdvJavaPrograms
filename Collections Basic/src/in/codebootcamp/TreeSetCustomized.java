package in.codebootcamp;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String I1=(String)o1;
		String I2=(String)o2;
		//Various implementation of compare method
		//return I1.compareTo(I2); //[0, 5, 10, 12, 17, 20]
		//return -I1.compareTo(I2);//[20, 17, 12, 10, 5, 0]
		//return I2.compareTo(I1);//[20, 17, 12, 10, 5, 0]
		return -I2.compareTo(I1);//[0, 5, 10, 12, 17, 20]
		//return +1;//[10, 0, 5, 12, 20, 17]
		//return -1;//[17, 20, 12, 5, 0, 10]
		//return 0;//[10]
		
	}
}

public class TreeSetCustomized {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add("Garvish");
		t.add("Durgesh");
		t.add("Ashirwad");
		t.add("Shadab");
		t.add("Sumit");
		t.add("Zoya");
		t.add("Ketan");
		
		System.out.println(t);

	}

}
