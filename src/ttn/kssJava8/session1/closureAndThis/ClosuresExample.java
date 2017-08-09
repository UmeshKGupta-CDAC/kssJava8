package ttn.kssJava8.session1.closureAndThis;

/**
 * Created by umesh on 10/8/17.
 */
public class ClosuresExample {

    public static void main(String[] args) {

        int a = 10;

        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
            }
        });

        //Todo:1 System.out.println( i + b); effective final variable concept
        //Todo:2
        //doProcess(a, i -> System.out.println(i + b));

    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}


interface Process {
    void process(int i);
}
