package day0_SampleQuestions;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
         /*
        Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        ipuclari:
        Matematiksel Islemler konusuna bakalim.
        Bölme islemi kullanarak sayinin basamaklarini alalim
        ve toplam adli bir konteynira (Variable) atalim.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı bir sayı giriniz");
        int sayı = scanner.nextInt();
        int toplam = 0;
        int birlerbasamağı = 0;

        birlerbasamağı = sayı%10;
        toplam=toplam+birlerbasamağı;

        sayı=sayı/10;
        birlerbasamağı=sayı%10;
        toplam=toplam+birlerbasamağı;

        sayı=sayı/10;
        birlerbasamağı=sayı%10;
        toplam=toplam+birlerbasamağı;

        System.out.println("rakamlar toplamı" + toplam);

    }
}
