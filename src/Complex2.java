import java.util.Random;

public class Complex2 {
    public static void main(String[] args) {
        //initialization
        String information = "";
        String IIFResult = "";
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            information += r.nextInt(10);
        }

        //IIF start
        for (int i = 0; i < 3; i++) {
            switch (information.charAt(i)) {
                case '0':
                    IIFResult += "0";
                    break;
                case '1':
                    IIFResult += "1";
                    break;
                case '2':
                    IIFResult += "2";
                    break;
                case '3':
                    IIFResult += "3";
                    break;
                case '4':
                    IIFResult += "4";
                    break;
                case '5':
                    IIFResult += "5";
                    break;
                case '6':
                    IIFResult += "6";
                    break;
                case '7':
                    IIFResult += "7";
                    break;
                case '8':
                    IIFResult += "8";
                    break;
                case '9':
                    IIFResult += "9";
                    break;
            }
        }
        for (int i = 3; i < 10; i++) {
            switch (information.charAt(i)) {
                case '0':
                    IIFResult += "0";
                    break;
                case '1':
                    IIFResult += "1";
                    break;
                case '2':
                    IIFResult += "2";
                    break;
                case '3':
                    IIFResult += "3";
                    break;
                case '4':
                    IIFResult += "4";
                    break;
                case '5':
                    IIFResult += "5";
                    break;
                case '6':
                    IIFResult += "6";
                    break;
                case '7':
                    IIFResult += "7";
                    break;
                case '8':
                    IIFResult += "8";
                    break;
                case '9':
                    IIFResult += "9";
                    break;
            }
        }
        //IIF end

        //IIF Result
        System.out.println();
        System.out.println("*** Complex 2 ***");
        System.out.println("Original Information:"+information);
        System.out.println("IIFResult:"+IIFResult);
    }
}
