package ttn.kssJava8.session1.lambda;


public class TypeInferenceExample {

    public static void main(String[] args) {
        StringLengthLambda myLambda = (String s) -> s.length();
        System.out.println(myLambda.length("Hello World"));

        //Todo:1
        //  StringLengthLambda myLambda = s -> s.length();


        //Todo:2
        //printLambda(s -> s.length());

    }


    interface StringLengthLambda {
        int length(String s);
    }


    public static void printLambda(StringLengthLambda l) {
        System.out.println(l.length("Hello World"));
    }
}


