public class Class
{
public static void main(String args[])
{
Cse obj1 = new Cse();

obj1.setdata();
obj1.display();
}
}

class Cse
{
int regno;
String name;

public void setdata()
{
regno= 990;
name="monk";
}

public void display()
{
System.out.println("the name is "+name);
System.out.println("the Reg no is "+regno);

}
}