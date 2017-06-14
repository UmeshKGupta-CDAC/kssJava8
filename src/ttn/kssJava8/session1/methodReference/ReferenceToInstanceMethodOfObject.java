package ttn.kssJava8.session1.methodReference;

import java.util.function.Consumer;

public class ReferenceToInstanceMethodOfObject {

    //Todo :2
    public static void main(String[] args) {
        Consumer<String> stringPrinter=System.out::println;
        Consumer<String> stringPrinterLambda=(String s) -> System.out.println(s);

        stringPrinter.accept("Print from method reference based instance");
        stringPrinterLambda.accept("Print from instance created from Lambda");
    }
}
