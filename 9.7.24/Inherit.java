public class Inherit
{
public static void main(String args[])
{
System.out.println("The Class A is");
A objA = new A();
objA.displayA();

System.out.println("The Class B is");
B objB = new B();
objA.displayA();
objB.displayB();

System.out.println("The Class C is");
C objC = new C();
objA.displayA();
objC.displayC();

System.out.println("The Class D is");
D objD = new D();
objA.displayA();
objB.displayB();
objD.displayD();
}
}

class A
{
public void displayA()
{System.out.println("A");}
}

class B extends A
{
public void displayB()
{System.out.println("B");}
}

class C extends A
{
public void displayC()
{System.out.println("C");}
}

class D extends B
{
public void displayD()
{System.out.println("D");}
}