package day13_stringManipulations_forLoop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C10_Ödev3 {
    public static void main(String[] args) {
        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 26.70 €

        Scanner scanner=new Scanner(System.in);
        String input1 = "15,30 €";
        String input2 = "11,40 €";

        input1=input1.replaceAll("\\D","");
        input2=input2.replaceAll("\\D","");
        double toplam=Double.parseDouble(input1)+Double.parseDouble(input2);
        /* farklı çözüm
        DecimalFormat df = new DecimalFormat("0,00");
        String formatlisayi = df.format(toplam);
        System.out.println(formatlisayi);
         */
        System.out.println(toplam/100);

    }
}
