package ttn.kssJava8.session1.iterator;

import java.util.Arrays;
import java.util.List;

public class Iterator {

    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Tom", "Dick", "Harry");

        //external iterator
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        //external iterator - with few improvement since java 1.5

        for (String s : namesList) {
            System.out.println(s);
        }


        //interal iterators
        namesList.forEach(System.out::println);


    }


}
