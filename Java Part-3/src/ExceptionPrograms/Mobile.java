package ExceptionPrograms;

public class Mobile{
String brand;
double price;
String color;
int battery;
	public Mobile(String brand,double price,String color,int battery)
	{
	this.brand=brand;
	this.price=price;
	this.color=color;
	this.battery=battery;
	}
	public static void main(String[] args) {
		Mobile m=new Mobile("oneplus",45000d,"Black",3700);
		Mobile m1=new Mobile("Mi",15000d,"Blue",4000);
		System.out.println(m+" "+m1);
	}
public String toString()
{
	return brand+" "+price+" "+color+" "+battery;
}
}

