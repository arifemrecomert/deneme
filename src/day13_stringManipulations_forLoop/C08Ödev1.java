package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class C08Ödev1 {
    public static void main(String[] args) {
        /*
        : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        input : java1 ogRe2@nMek3 #ne +Gu=zel
        output : Java ogrenmek ne guzel.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen mesajınızı giriniz");
        String metin = scan.nextLine();
       metin=metin.replaceAll("\\d","");
       metin=metin.replaceAll(" ","1");
       metin=metin.replaceAll("\\W","");
       metin=metin.replaceAll("1"," ");
        metin = metin + ".";

        System.out.println(metin.substring(0,1).toUpperCase()+metin.substring(1).toLowerCase());


        /*
        Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen yazı giriniz");
        String yazi =scanner.nextLine();

        int uzunluk = yazi.length();
        int orta =(uzunluk-1)/2;
        if (uzunluk%2==0){
            yazi=yazi.substring(0,uzunluk/2)+ ":)"+yazi.substring(2);
            System.out.println(yazi);
        }
        else System.out.println(yazi.replace(yazi.substring(orta,orta+1),":("));

    }
}
