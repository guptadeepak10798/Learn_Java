import java.sql.SQLOutput;
import java.util.UUID;

public class MyFirstProgram {
    public static void main(String[] args) {
//        System.out.println("Hello world");

//        String a = UUID.randomUUID().toString();
//        System.out.println(a);
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}

class Bank{
    static int getRateOfInterest(){return 0;}
}
//Creating child classes.
class SBI extends Bank{
    static int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    static int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    static int getRateOfInterest(){return 9;}
}