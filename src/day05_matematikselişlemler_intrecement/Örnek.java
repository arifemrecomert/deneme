package day05_matematikselişlemler_intrecement;

import java.util.Scanner;

public class Örnek {
    public static void main(String[] args) {
         /*
   SORU 1= Dairenin alanini ve cevresini hesaplayan java kodu yaziniz
    Ipuclari:
         * r=7;
         * Pi=3.14
         * Dairenin Cevresi : 2*Pi*r
         * Dairenin Alani : Pi*r*r
    */
/*
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen dairenin yarıçapını giriniz");
        double r = scanner.nextDouble();

        double pi = 3.14;

        System.out.println("dairenin alanı:" + pi*r*r);
        System.out.println("dairenin çevresi:" + 2*pi*r);
 */

       /*
       SORU 2= Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
       Ipuclari:
        * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        * Dikdortgenin Alani : uzun kenar * kisa kenar
        */
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin uzun kenarının uzunluğunu giriniz");
        double uzunkenar = scanner.nextDouble();
        System.out.println("lütfen dikdörtgenin kısa kenarının uzunluğunu giriniz");
        double kısakenar = scanner.nextDouble();

        System.out.println("dikdörtgenin çevresi:" + 2*(uzunkenar+kısakenar));
        System.out.println("dikdörtgenin alanı:" + uzunkenar*kısakenar);
         */

       // SORU 3= Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
/*
        Scanner scanner = new Scanner(System.in);
        double toplam = 0;
        for (int i = 1; i <6 ; i++) {
            System.out.println("lütfen "+i+". sayıyı giriniz");
            double sayı = scanner.nextDouble();
            toplam += sayı;
        }
        System.out.println("ortalama:" +toplam/5);
 */
        // Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
       /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double çarpım = 1;
        double sayı = scanner.nextDouble();
        for (int i = 1; i <=3 ; i++) {

            çarpım *=sayı;
        }
        System.out.println("girilen sayının küpünün yarsı" + çarpım/2);
        */

        //SORU 5: Kullanıcıdan karenin kenar uzunluğunu alın.
        // Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen karenin kenar uzunluğunu giriniz");
        double kenar = scanner.nextDouble();

        double kareninalanı = kenar*kenar;
        double kareninçevresi = kenar*4;

        System.out.println("karenin alanı:"+ kareninalanı);
        System.out.println("karenin çevresi:" + kareninçevresi);
    }

}
