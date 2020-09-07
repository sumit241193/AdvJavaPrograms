package in.codebootcamp;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Myself";
	}
	
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize Called");
	}
}


public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		Temp t=new Temp();
		WeakHashMap m=new WeakHashMap();
		
		m.put(t, "Code BootCamp");
		
		System.out.println(m);
		
		t=null;
		System.gc();
		
		Thread.sleep(5000);
		
		System.out.println(m);
		
	}

}
