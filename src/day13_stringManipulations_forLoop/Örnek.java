package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class Örnek {
    public static void main(String[] args) {
        // Kullanicidan bir metin isteyin
        // metin'deki tum sayilari ve space disindaki ozel karakterleri temizleyin
        // metnin sonuna da . koyun.
        // ornek    input : J1*2av4.a C67//an=+dir--_
        //          output "Java Candir."

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String metin = scanner.nextLine();

        metin=metin.replaceAll("\\d","");
        metin=metin.replaceAll("\\s","1");
        metin=metin.replaceAll("\\W","");
        metin=metin.replace("1"," ");
        metin=metin.replace("_",".");
        System.out.println(metin);

          /*
        Regex (Regular Expressions)
            \\s : space     \\S : space olmayan hersey
            \\s+ : yanyana birden fazla space
            \\d : digits        \\D : digit olmayan hersey
            \\w : harf, rakam veya alt çizgi(_)   \\W : harf veya rakam olmayan hersey
         */


        // kullanıcının verdiği başlangıç ve bitiş değerleri dahil olarak
        // aranan sayıya tam bölünebilen bir sayı varsa
        // "aranan sayı ile tam bölünebilen bir sayı var" yazdırın

        int baslangıc = 15;
        int bitis = 35;
        int aranansayi = 6;
        for (int i = baslangıc; i <=bitis ; i++) {
            if (i%aranansayi==0){
                System.out.println("aranan sayıyıa tam bölünen sayı var" +i);
            }

        }

    }
}
