package ttn.kssJava8.session1.lambda;


public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello world");
    }
}
