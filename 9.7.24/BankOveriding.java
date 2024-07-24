public class BankOveriding
{
public static void main(String args[])
{
Bank b1 = new SBI();
b1.RateofInterest();
b1 = new Icici();
b1.RateofInterest();
b1 = new Axis();
b1.RateofInterest();
}
}

class Bank
{
public void RateofInterest()
{System.out.println("");}
}

class SBI extends Bank
{
public void RateofInterest()
{System.out.println("SBI - 8.4");}
}

class Icici extends Bank
{
public void RateofInterest()
{System.out.println("ICICI - 7.3");}
}

class Axis extends Bank
{
public void RateofInterest()
{System.out.println("Axis - 9.7");}
}