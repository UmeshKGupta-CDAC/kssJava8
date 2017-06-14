package ttn.kssJava8.session1.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class ReferenceToStaticMethod {

    //Todo:1
    public static void main(String[] args) {

        Function<String, Double> doubleConvertor = Double::parseDouble;
        Function<String, Double> doubleConvertorLambda = (String s) -> Double.parseDouble(s);

        System.out.println("double value using method reference - " + doubleConvertor.apply("0.254"));
        System.out.println("double value using Lambda - " + doubleConvertorLambda.apply("0.254"));

    }



}


