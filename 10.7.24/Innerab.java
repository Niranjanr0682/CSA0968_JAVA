
    abstract class ab {
    abstract void display();
        
    }
    class bs extends ab
    {void display()
    {System.err.println("class b");}}

    class cs extends ab{
        void display()
    {System.err.println("class c");}
    }

    public class Innerab {
    public static void main(String[] args) {
        ab obj = new bs();
        obj.display();
        obj= new cs();
        obj.display();
    }
        
    }

