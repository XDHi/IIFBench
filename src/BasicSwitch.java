import java.util.Random;

public class BasicSwitch {
    public static void main(String[] args) {
        //initialization
        Random r = new Random();
        int information = r.nextInt(10);
        String IIFResult = "";

        //IIF Start
        switch (information){
            case 1: IIFResult = "1"; break;
            case 3: IIFResult = "3"; break;
            case 5: IIFResult = "5"; break;
            case 7: IIFResult = "7"; break;
            case 9: IIFResult = "9"; break;
        }
        //IIF End

        //IIF Result
        System.out.println();
        System.out.println("*** Basic Switch ***");
        System.out.println("Original Information: "+information);
        System.out.println("IIF Result: "+IIFResult);
    }
}
