import java.sql.SQLOutput;

public class NestedTryBlock {

    public static void main(String[] args) {

       try {
           System.out.println("inside try block 1");
           try {
               System.out.println("start of try block 2");
               int b =39/0;
               System.out.println("end of try block 2");
           }catch (ArithmeticException  e) {
               System.out.println("start catch block2");
               System.out.println(e);
               System.out.println(e.getMessage());
               System.out.println("end of catch block2");
           }

           try {
               System.out.println("start of try block 3");
               int a[]=new int[5];
               //assigning the value out of array bounds
               a[6]=4;
               System.out.println("end of try block 3");
           }catch (ArrayIndexOutOfBoundsException  e) {
               System.out.println("start catch block3");
               System.out.println(e);
//               e.printStackTrace();
               System.out.println(e.getMessage());
               System.out.println("end of catch block3");
           }

       }catch (Exception    e) {
           System.out.println(e);
           System.out.println("inside catch block1");
       }

    }

}
