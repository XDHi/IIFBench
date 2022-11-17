import java.util.Random;

public class ScreenShot {
    public static void main(String[] args) {
        System.out.println(iif());
    }
    public static String iiif() {
        String information = "1a2c3f";
        String IIFResult = "";
        //IIF start
        for (int i=0; i<6; i++) {
            char c = information.charAt(i);
            if (Character.isDigit(c)) {
                if(c=='0') IIFResult += '0';
                else if(c=='1') IIFResult += '1';
                else if(c=='2') IIFResult += '2';
                else if(c=='3') IIFResult += '3';
                else if(c=='4') IIFResult += '4';
                else if(c=='5') IIFResult += '5';
                else if(c=='6') IIFResult += '6';
                else if(c=='7') IIFResult += '7';
                else if(c=='8') IIFResult += '8';
                else if(c=='9') IIFResult += '9';
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
                }
            }
        }
        //IIF end
        return IIFResult;
    }


    public static String iif() {
        int information = 123456789;
        String IIFRrsult = "";
        if (information<0) IIFRrsult = "information < 0";
        else IIFRrsult = "information >= 0";
        return IIFRrsult;
    }
}
