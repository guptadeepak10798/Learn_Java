package Java_Composition;

/*
* CompClassA, CompClassB, CompClassC and Superclass are used to illustrate Composition
* */
public class CompClassC {

    SuperClass obj= null;

    public CompClassC(SuperClass o){
        this.obj = o;
    }

    public void test(){
        obj.doSomething();

        if(obj instanceof CompClassA){obj.doSomethingDifferent();}
        //else it will use method doSomethingDifferent from superclass method if child class CompClassB is not implemented yet
        else obj.doSomethingDifferent();
        System.out.println("object calling method => "+obj.toString()+"\n");
    }

    public static void main(String args[]){
        CompClassC obj1 = new CompClassC(new CompClassA());
        CompClassC obj2 = new CompClassC(new CompClassB());

        obj1.test();
        obj2.test();
    }
}
