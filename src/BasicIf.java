import java.util.Random;

public class BasicIf {
    public static void main(String[] args) {
        //initialization
        int information;
        String IIFResult = "";
        Random r = new Random();
        information = r.nextInt(10);

        //IIF Start
        if(information == 1){
            IIFResult = "1";
        }
        //IIF End

        //IIF Result
        System.out.println();
        System.out.println("*** Basic If ***");
        System.out.println("Original Information:"+information);
        System.out.println("IIFResult:"+IIFResult);
    }
}
