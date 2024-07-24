interface Shape
{
abstract public double CalculateArea();
abstract public double CalculatePerimeter();
abstract public void display();
}


class Circle implements Shape
{
double radius;
public Circle(double radius)
{
this.radius=radius;
}
public double CalculateArea()
{
return Math.PI*radius*radius;
}
public double CalculatePerimeter()
{
return 2*Math.PI*radius;
}
public void display()
{
System.out.println(CalculateArea());
System.out.println(CalculatePerimeter());
}

}

class Rectangle implements Shape
{
double length;
double breadth;
public Rectangle(double length, double breadth)
{
this.length=length;
this.breadth=breadth;
}
public double CalculateArea()
{
return length*breadth;
}
public double CalculatePerimeter()
{
return 2*(length+breadth);
}
public void display()
{
System.out.println(CalculateArea());
System.out.println(CalculatePerimeter());
}

}

public class InterfaceShape
{
public static void main(String args[])
{
Circle obj1 = new Circle(7.0);
Rectangle obj2 = new Rectangle(5.0, 4.0);
System.out.println("Circle:");
obj1.display();
System.out.println("\nRectangle:");
obj2.display();}
}