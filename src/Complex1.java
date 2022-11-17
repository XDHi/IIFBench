import java.util.Random;

public class Complex1 {
    public static void main(String[] args) {
        //initialization
        String charList = "abcdefghijklmnopqrstuvwxyz0123456789";
        String information = "";
        String IIFResult = "";
        Random r = new Random();
        for (int i=0; i<10; i++) {
            information += charList.charAt(r.nextInt(36));
        }

        //IIF start
        for (int i=0; i<10; i++) {
            char c = information.charAt(i);
            if (Character.isDigit(c)) {
                int number = (int)c;
                if(number=='0') IIFResult += '0';
                else if(number=='1') IIFResult += '1';
                else if(number=='2') IIFResult += '2';
                else if(number=='3') IIFResult += '3';
                else if(number=='4') IIFResult += '4';
                else if(number=='5') IIFResult += '5';
                else if(number=='6') IIFResult += '6';
                else if(number=='7') IIFResult += '7';
                else if(number=='8') IIFResult += '8';
                else if(number=='9') IIFResult += '9';
            }
            else {
                switch(c) {
                    case 'a': IIFResult += 'a'; break;
                    case 'b': IIFResult += 'b'; break;
                    case 'c': IIFResult += 'c'; break;
                    case 'd': IIFResult += 'd'; break;
                    case 'e': IIFResult += 'e'; break;
                    case 'f': IIFResult += 'f'; break;
                    case 'g': IIFResult += 'g'; break;
                    case 'h': IIFResult += 'h'; break;
                    case 'i': IIFResult += 'i'; break;
                    case 'j': IIFResult += 'j'; break;
                    case 'k': IIFResult += 'k'; break;
                    case 'l': IIFResult += 'l'; break;
                    case 'm': IIFResult += 'm'; break;
                    case 'n': IIFResult += 'n'; break;
                    case 'o': IIFResult += 'o'; break;
                    case 'p': IIFResult += 'p'; break;
                    case 'q': IIFResult += 'q'; break;
                    case 'r': IIFResult += 'r'; break;
                    case 's': IIFResult += 's'; break;
                    case 't': IIFResult += 't'; break;
                    case 'u': IIFResult += 'u'; break;
                    case 'v': IIFResult += 'v'; break;
                    case 'w': IIFResult += 'w'; break;
                    case 'x': IIFResult += 'x'; break;
                    case 'y': IIFResult += 'y'; break;
                    case 'z': IIFResult += 'z'; break;
                }
            }
        }
        //IIF end

        //IIF Result
        System.out.println();
        System.out.println("*** Complex 1 ***");
        System.out.println("Original Information:"+information);
        System.out.println("IIFResult:"+IIFResult);
    }
}
