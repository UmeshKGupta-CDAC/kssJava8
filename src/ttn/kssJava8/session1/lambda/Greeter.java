package ttn.kssJava8.session1.lambda;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();

        greeter.greet(helloWorldGreeting);


        greeter.greet(new Greeting() {
            @Override
            public void perform() {
                System.out.print("Hello world using annoyms inner class");
            }
        });

        Greeting greeting = ()->System.out.print("Hello world using lambda");

    }
}
