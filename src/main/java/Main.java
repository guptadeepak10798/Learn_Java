public class Main implements InterfaceA{
    @Override
    public void doSomething() {
        System.out.println("Main class implemented method called ..... " );
    }

    public static void main(String[] args) {
        System.out.println("Starting ..... " );

        InterfaceA objA = new InterfaceA() {
            @Override
            public void doSomething() {
                System.out.println("InterfaceA method objA called ..... " );
            }
        };
        objA.doSomething();

        InterfaceImpl obj2 = new InterfaceImpl();
        obj2.doSomething();

        InterfaceA obj3 = new InterfaceImpl();
        obj3.doSomething();
    }


}
