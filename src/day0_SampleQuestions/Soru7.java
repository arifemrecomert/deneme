package day0_SampleQuestions;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        /*
        Soru 7-)  Kullanicidan Double türünde bir sayi alin.
        Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin
        bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        ( Data Casting -> Auto Widening ve Explicit Narrowing )
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen float bir sayı giriniz");
        float sayı = scanner.nextFloat();

        short sayı1 = (short) sayı;
        System.out.println(sayı1);

    }
}
