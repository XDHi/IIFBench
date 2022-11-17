import java.util.Random;

public class IfFor {
    public static void main(String[] args) {
        //initialization
        Random r = new Random();
        int information = r.nextInt(10);
        int IIFResult = 0;

        //IIF Start
        if(information==0) {
            for(int i=0; i<0; i++){
                IIFResult += 1;
            }
        }
        if(information==1) {
            for(int i=0; i<1; i++){
                IIFResult += 1;
            }
        }
        if(information==2) {
            for(int i=0; i<2; i++){
                IIFResult += 1;
            }
        }
        if(information==3) {
            for(int i=0; i<3; i++){
                IIFResult += 1;
            }
        }
        if(information==4) {
            for(int i=0; i<4; i++){
                IIFResult += 1;
            }
        }
        if(information==5){
            for(int i=0; i<5; i++){
                IIFResult += 1;
            }
        }
        if(information==6) {
            for(int i=0; i<6; i++){
                IIFResult += 1;
            }
        }
        if(information==7) {
            for(int i=0; i<7; i++){
                IIFResult += 1;
            }
        }
        if(information==8) {
            for(int i=0; i<8; i++){
                IIFResult += 1;
            }
        }
        if(information==9) {
            for(int i=0; i<9; i++){
                IIFResult += 1;
            }
        }
        //IIF End

        //IIF Result
        System.out.println();
        System.out.println("*** If For ***");
        System.out.println("Original Information:"+information);
        System.out.println("IIFResult:"+IIFResult);
    }
}
