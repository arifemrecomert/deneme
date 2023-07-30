package day14_forLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Örnek {
    public static void main(String[] args) {
       /* Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayınç
        Ipuclari:
·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin
        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("günde kaç bardak çay içiyorsunuz? Sayı olarak giriniz.");
        int bardak= scanner.nextInt();
        System.out.println("Bir bardak çay için kaç adet şeker kullanıyorsunuz?");
        int seker = scanner.nextInt();
        int biryıldaiçilençay = 365*bardak;
        int yıldakullanılanşeker= biryıldaiçilençay*seker;
        System.out.println("yılda içilen çay:" + biryıldaiçilençay);
        double kg = (yıldakullanılanşeker*1.5)/1000;
        System.out.println("bir yılda kullanılan şeker:"+kg+ "kg'dir");
         */
        /*
        Soru 7-)  Kullanicidan Double türünde bir sayi alin.
        Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin
        bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        ( Data Casting -> Auto Widening ve Explicit Narrowing )
         */
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen float bir sayı giriniz");
        float sayı = scanner.nextFloat();

        short sayı1 = (short) sayı;
        System.out.println(sayı1);
         */
        /*
        Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        ipuclari:
        Matematiksel Islemler konusuna bakalim.
        Bölme islemi kullanarak sayinin basamaklarini alalim
        ve toplam adli bir konteynira (Variable) atalim.
         */
        /*
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
         */

    }}