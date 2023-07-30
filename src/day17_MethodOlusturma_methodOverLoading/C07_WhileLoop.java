package day17_MethodOlusturma_methodOverLoading;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //Soru 4 : Main method'da kullanicidan sifre isteyip,
        //          olusturacagimiz bir method'da asagidaki sartlari kontrol edin
        //          ve method'dan true veya false dondurun
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglanincaya kadar tekrar deger isteyin
        //         ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali
        boolean sonuc = false;
        while (!sonuc){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String sifre = scanner.nextLine();
        sonuc = sifreKontrolEt(sifre);

        } System.out.println(sonuc);


    }
    public static boolean sifreKontrolEt(String sifre){
        int sayac = 0;
        char ilkharf = sifre.charAt(0);
        if (!(ilkharf>='a' && ilkharf<='z')){
            System.out.println("ilk karakter küçük harf olmalı");
            sayac++;
        }
        char sonkarakter = sifre.charAt(sifre.length()-1);
        if (!(sonkarakter>='0' && sonkarakter<='9')){
            System.out.println("son karakter rakam olmalı");
            sayac++;
        }
        if (sifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli ");
            sayac++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("şifrenin uzunluğu en az 10 karakter olmalı");
            sayac++;
        }
        if (sayac==0){
            return true;
        }else {
            return false;
        }

    }

    }





