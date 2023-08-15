package day0_SampleQuestions;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {


    /*
       SORU 2= Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
       Ipuclari:
        * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        * Dikdortgenin Alani : uzun kenar * kisa kenar
        */


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin uzun kenarının uzunluğunu giriniz");
        double uzunkenar = scanner.nextDouble();
        System.out.println("lütfen dikdörtgenin kısa kenarının uzunluğunu giriniz");
        double kısakenar = scanner.nextDouble();

        System.out.println("dikdörtgenin çevresi:" + 2*(uzunkenar+kısakenar));
        System.out.println("dikdörtgenin alanı:" + uzunkenar*kısakenar);


}}
