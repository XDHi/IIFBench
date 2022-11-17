import java.util.Random;

public class Complex3 {
    public static void main(String[] args) {
        //initialization
        String charList = "abcdefghijklmnopqrstuvwxyz0123456789";
        String information = "";
        String IIFResult = "";
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            information += charList.charAt(r.nextInt(36));
        }

        //IIF start
        for(int i=0; i<16; i=i+2){
            char c1 = information.charAt(i/2);
            int j = 0;
            if(!Character.isDigit(c1))
            while (j<26){
                char c2 = charList.charAt(j);
                if (c1==c2){
                    IIFResult += c2;
                }
                j++;
            }
            else{
                try{
                    int tryNumber = 100/(c1-'0');
                }catch (Exception e){
                    IIFResult+='0';
                }
                try{
                    int tryNumber = 100/(c1-'1');
                }catch (Exception e){
                    IIFResult+='1';
                }
                try{
                    int tryNumber = 100/(c1-'2');
                }catch (Exception e){
                    IIFResult+='2';
                }
                try{
                    int tryNumber = 100/(c1-'3');
                }catch (Exception e){
                    IIFResult+='3';
                }
                try{
                    int tryNumber = 100/(c1-'4');
                }catch (Exception e){
                    IIFResult+='4';
                }
                try{
                    int tryNumber = 100/(c1-'5');
                }catch (Exception e){
                    IIFResult+='5';
                }
                try{
                    int tryNumber = 100/(c1-'6');
                }catch (Exception e){
                    IIFResult+='6';
                }
                try{
                    int tryNumber = 100/(c1-'7');
                }catch (Exception e){
                    IIFResult+='7';
                }
                try{
                    int tryNumber = 100/(c1-'8');
                }catch (Exception e){
                    IIFResult+='8';
                }
                try{
                    int tryNumber = 100/(c1-'9');
                }catch (Exception e){
                    IIFResult+='9';
                }
            }
        }
        //IIF end

        //IIF Result
        System.out.println();
        System.out.println("*** Complex 3 ***");
        System.out.println("Original Information:"+information);
        System.out.println("IIFResult:"+IIFResult);
    }
}
