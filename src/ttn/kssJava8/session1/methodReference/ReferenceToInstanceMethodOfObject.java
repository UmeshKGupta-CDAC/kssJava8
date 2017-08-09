package ttn.kssJava8.session1.methodReference;

import java.util.function.Consumer;

public class ReferenceToInstanceMethodOfObject {

    //Todo :2
    public static void main(String[] args) {
        Consumer<String> stringPrinterLambda=(String s) -> System.out.println(s);
        Consumer<String> stringPrinter=System.out::println;

        stringPrinterLambda.accept("Print from instance created from Lambda");

        stringPrinter.accept("Print from method reference based instance");
    }
}
