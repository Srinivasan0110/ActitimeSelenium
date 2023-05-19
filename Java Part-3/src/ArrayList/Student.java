package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
class Student 
{
	String name;
	int id;
	public Student(String name,int id) 
	{
	this.name=name;
	this.id=id;
	}
	public String toString()
	{
		return name+" "+id;
	}
	public static void main(String[] args) 
	{
	ArrayList<Student> a=new ArrayList<Student>();
	a.add(new Student("Seenu",101));
	a.add(new Student("Seenu",102));
	a.add(new Student("Seenu",103));
	Iterator<Student> it=a.iterator();
	while(it.hasNext()==true)
	{
		System.out.println(it.next());
	}
	}
}
