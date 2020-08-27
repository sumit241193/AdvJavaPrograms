package in.codebootcamp;

import java.util.ArrayList;

class Student
{
	void show()
	{
		System.out.println("This is Student class");
	}
}



public class ArrayListDemo {

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		
		
		ArrayList<Student> ls=new ArrayList<Student>();
	
		
		ls.add(s1);
		
		ls.add(s2);
		
		System.out.println(ls.get(0).hashCode());
		System.out.println(ls.get(1).hashCode());
	
		
		ls.get(1).show();
		ls.get(0).show();
		
		/*System.out.println(ls);//[A,10,A,null]
		
		ls.remove(2);
		System.out.println(ls);//[A,10,null]
		
		
		
		System.out.println(ls);//[A,10,S,null]
		
		
		System.out.println(ls);//[A,10,S,null,N]
		
		
		*//*******//*System.out.println(ls.get(3));//C
		
		System.out.println(ls.get(3));//Z
*/		
		
		
		
		
		
		

	}

}
