package ttn.kssJava8.session1;

import com.sun.xml.internal.bind.v2.TODO;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

//        Todo: 1
//        myLambdaFunction = () -> System.out.println (" MY lambda function");

//        Todo: 2
//        FunctionType<void,void> myLambdaFunction = () -> System.out.println (" MY lambda function");


//        Todo:3
//        MyLambda myLambdaFunction = () -> System.out.println(" MY lambda function");


//        Todo:4
//          MyAdd myAdd = (int a, int b) -> a+b;


        //Todo:5

        //Greeting greeting = ()->System.out.print("Hello world using lambda");

        //Todo:6
        //difference annoy and lambda inters of performance
       /* greeter.greet(new Greeting() {
            @Override
            public void perform() {
                System.out.print("Hello world using annoyms inner class");
            }
        });*/

    }
}


interface MyLambda {
    void foo();
}


interface myAdd {
    int add(int x, int y);
}



