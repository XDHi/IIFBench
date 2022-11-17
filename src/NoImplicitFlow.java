import java.util.Random;

public class NoImplicitFlow {
    public static void main(String[] args) {
        //initialization
        int information;
        String IIFResult = "";
        Random r = new Random();
        information = r.nextInt(10);

        //IIF Start
        IIFResult = "0";
        //IIF End

        //IIF Result
        System.out.println();
        System.out.println("*** No Implicit Flow ***");
        System.out.println("Original Information:"+information);
        System.out.println("IIFResult:"+IIFResult);
    }
}
