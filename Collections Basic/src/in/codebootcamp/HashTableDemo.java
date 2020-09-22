package in.codebootcamp;

import java.util.Hashtable;

class TempSumit
{
	private int i;
	
	TempSumit(int i)
	{
		this.i=i; //
	}
	
	public int hashCode()
	{
		return i%9;
	}
	
	public String toString()
	{
		return i+"";
	}
}


public class HashTableDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Hashtable h=new Hashtable(6,1.0f);
		h.put(new TempSumit(5), "A");
		h.put(new TempSumit(2), "B");
		h.put(new TempSumit(6), "C");
		h.put(new TempSumit(15), "D");
		h.put(new TempSumit(23), "E");
		h.put(new TempSumit(16), "F");
		
		
		System.out.println(h);// {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
		
		

	}

}
