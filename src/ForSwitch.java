import java.util.Random;

public class ForSwitch {
    public static void main(String[] args) {
        //initialization
        String information = "";
        String IIFResult = "";
        Random r = new Random();
        for(int i=0; i<10; i++){
            information += r.nextInt(10);
        }

        //IIF Start
        for(int i=0; i<10; i++){
            char c = information.charAt(i);
            switch (c){
                case '0': IIFResult += '0'; break;
                case '1': IIFResult += '1'; break;
                case '2': IIFResult += '2'; break;
                case '3': IIFResult += '3'; break;
                case '4': IIFResult += '4'; break;
                case '5': IIFResult += '5'; break;
                case '6': IIFResult += '6'; break;
            }
        }
        //IIF End

        //IIF Result
        System.out.println();
        System.out.println("*** For Switch ***");
        System.out.println("Original Information:"+information);
        System.out.println("IIFResult:"+IIFResult);
    }
}