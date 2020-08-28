package in.codebootcamp;

import java.util.Comparator;
import java.util.TreeSet;

class Employee 
{
	
	String name;
	int eid;
	
	Employee(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"--->"+eid;
	}
	
}

class MyComparator1 implements Comparator
{
public int compare(Object o1, Object o2) {
		
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		String eid1=e1.name;
		String eid2=e2.name;
		
		return eid1.compareTo(eid2);
		
		
	}
}

public class CompareEmployeeId {

	public static void main(String[] args) {
		
		Employee e3=new Employee("Gaurav",150);
		Employee e5=new Employee("Abhishek",550);
		Employee e1=new Employee("Shubham",100);
		Employee e2=new Employee("Rajat",50);
		
		Employee e4=new Employee("Ravi",20);
		
		Employee e6=new Employee("Zoya",250);
		
		TreeSet t=new TreeSet(new MyComparator1());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
		System.out.println(t);
		

	}

}


