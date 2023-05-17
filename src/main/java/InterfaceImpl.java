import org.w3c.dom.ls.LSOutput;

import java.util.Collection;
import java.util.Collections;

public class InterfaceImpl implements InterfaceA{


    @Override
    public void doSomething() {
        System.out.println("doSomething implementation of concrete class");
    }

    public static void main(String[] args) {
        InterfaceA obj1 = new InterfaceImpl();
        obj1.doSomething();

//        () -> Collections.addAll(System.out.println(1);)
    }
}