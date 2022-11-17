import java.util.Random;

public class BasicIfElse {
    public static void main(String[] args) {
        //initialization
        int information;
        String IIFResult = "Unknown";
        Random r = new Random();
        information = r.nextInt(10);

        //IIF Start
        if(information == 0) IIFResult = "0";
        else if(information < 5) IIFResult = "information < 5";
        else IIFResult = "information >= 5";
        //IIF End

        //IIF Result
        System.out.println();
        System.out.println("*** Basic If-Else ***");
        System.out.println("Original Information: "+information);
        System.out.println("IIFResult: "+IIFResult);
    }
}
