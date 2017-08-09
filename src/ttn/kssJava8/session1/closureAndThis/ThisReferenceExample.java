package ttn.kssJava8.session1.closureAndThis;

/**
 * Created by umesh on 10/8/17.
 */
public class ThisReferenceExample {

    public void doProcess(int i, Process p) {
        p.process(i);
    }


    public static void main(String[] args) {

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is " + i);
                System.out.println(this);
            }
        });


        //Todo:1
		/* thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			// System.out.println(this); will this work??
		});
		*/




		//Todo:2
       // thisReferenceExample.execute();
    }

    public void execute() {

        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);
        });
    }

    //Todo:3 uncomment
   /* public String toString() {
        return "This is the main ThisReferenceExample class instance";
    }*/
}
