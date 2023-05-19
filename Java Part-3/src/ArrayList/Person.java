package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
class Person implements Comparable<Person>
{
String name;
int height;
	public Person(String name,int height) 
	{
		this.name=name;
		this.height=height;
	}
	public String toString()
	{
		return name+" "+height;
	}
	public int compareTo(Person ob)
	{
		return this.name.compareTo(ob.name);
	}
	public static void main(String[] args) 
	{
ArrayList<Person> a=new ArrayList<Person>();
Person p1=new Person("Seenu",180);
Person p2=new Person("Bala",178);
Person p3=new Person("Venkat",175);
a.add(p1);
a.add(p2);
a.add(p3);
System.out.println("Before Sorting");
System.out.println(a);
System.out.println("After Sorting");
Collections.sort(a);
System.out.println(a);
}
}
