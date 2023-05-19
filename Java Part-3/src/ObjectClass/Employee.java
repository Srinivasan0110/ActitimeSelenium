package ObjectClass;

public class Employee {
int eid;
double salary;
String name;
String designation;
public Employee(int eid, double salary, String name, String designation) {
	this.eid = eid;
	this.salary = salary;
	this.name = name;
	this.designation = designation;
}
public static void main(String[] args)
{
Employee e1=new Employee(123,45000d,"Seenu","Testing");
Employee e2=new Employee(456,45000d,"Bala","Testing");
Employee e3=new Employee(789,45000d,"Venkat","Testing");
System.out.println(e1);
System.out.println(e2);
System.out.println(e3);	
System.out.println(e1.equals(e2));
System.out.println(e1.hashCode());
}
public String toString()
{
	return eid+" "+salary+" "+name+" "+designation;
}
public boolean equals(Employee e2)
{
	if(this.eid==e2.eid)
		return true;
	else
		return false;
}
}