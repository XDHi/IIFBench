import java.util.Random;

public class TryCatch {
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
            try{
                int tryNumber = 100/(c-'0');
            }catch (Exception e){
                IIFResult+='0';
            }
            try{
                int tryNumber = 100/(c-'1');
            }catch (Exception e){
                IIFResult+='1';
            }
            try{
                int tryNumber = 100/(c-'2');
            }catch (Exception e){
                IIFResult+='2';
            }
            try{
                int tryNumber = 100/(c-'3');
            }catch (Exception e){
                IIFResult+='3';
            }
            try{
                int tryNumber = 100/(c-'4');
            }catch (Exception e){
                IIFResult+='4';
            }
            try{
                int tryNumber = 100/(c-'5');
            }catch (Exception e){
                IIFResult+='5';
            }
            try{
                int tryNumber = 100/(c-'6');
            }catch (Exception e){
                IIFResult+='6';
            }
            try{
                int tryNumber = 100/(c-'7');
            }catch (Exception e){
                IIFResult+='7';
            }
            try{
                int tryNumber = 100/(c-'8');
            }catch (Exception e){
                IIFResult+='8';
            }
            try{
                int tryNumber = 100/(c-'9');
            }catch (Exception e){
                IIFResult+='9';
            }
        }
        //IIF End

        //IIF Result
        System.out.println();
        System.out.println("*** Try Catch ***");
        System.out.println("Original Information:"+information);
        System.out.println("IIFResult:"+IIFResult);
    }
}
