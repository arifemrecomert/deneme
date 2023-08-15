package day0_SampleQuestions;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
         /*
   SORU 1= Dairenin alanini ve cevresini hesaplayan java kodu yaziniz
    Ipuclari:
         * r=7;
         * Pi=3.14
         * Dairenin Cevresi : 2*Pi*r
         * Dairenin Alani : Pi*r*r
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen dairenin yarıçapını giriniz");
        double r = scanner.nextDouble();

        double pi = 3.14;

        System.out.println("dairenin alanı:" + pi * r * r);
        System.out.println("dairenin çevresi:" + 2 * pi * r);

    }}