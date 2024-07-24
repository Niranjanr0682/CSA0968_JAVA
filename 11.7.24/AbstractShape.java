abstract class Shape
{abstract double CalculateArea();
abstract double CalculatePerimeter();
public void display()
    {System.out.println(CalculateArea());
    System.out.println(CalculatePerimeter());}}

class Circle extends Shape
    {double radius;
    public Circle(double radius)
        {this.radius=radius;}
    double CalculateArea()
        {return Math.PI*radius*radius;}
    double CalculatePerimeter()
{return 2*Math.PI*radius;}}
class Rectangle extends Shape
{double length;
double breadth;
public Rectangle(double length, double breadth)
{this.length=length;
this.breadth=breadth;}
double CalculateArea()
{return length*breadth;}
double CalculatePerimeter()
{return 2*(length+breadth);}}

public class AbstractShape
{
public static void main(String args[])
{
Circle circle = new Circle(7.0);
Rectangle rectangle = new Rectangle(5.0, 4.0);
System.out.println("Circle:");
circle.display();
System.out.println("\nRectangle:");
rectangle.display();}
}