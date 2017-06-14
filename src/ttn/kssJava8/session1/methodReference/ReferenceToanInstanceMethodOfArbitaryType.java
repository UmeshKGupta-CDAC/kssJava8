package ttn.kssJava8.session1.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class ReferenceToanInstanceMethodOfArbitaryType {

    //Todo 3:
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(1,2,3,4);

        BiPredicate<List<Integer>,Integer> isPartOf=List::contains;
        BiPredicate<List<Integer>,Integer> isPartOfLambda=(List<Integer> listInt, Integer value) -> listInt.contains(value);

        System.out.println("Is 1 a part of the intList - "+ isPartOf.test(intList, 1));
        System.out.println("Is 1 a part of the intList - "+ isPartOfLambda.test(intList, 1));

    }

}
