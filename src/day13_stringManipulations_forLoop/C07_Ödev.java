package day13_stringManipulations_forLoop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C07_Ödev {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle alin
- cumlede ev geciyorsa, "home home sweet home" yazdirin
- cumlede is geciyorsa, "calismak guzeldir"
- ikisini de iceriyorsa "Hem ev lazim hem is"
- hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();

        if (cümle.contains("ev") && cümle.contains("is")) {
            System.out.println("hem ev lazım hem is");}

            else if (cümle.contains("ev")) {
                System.out.println("home home sweet home");
            }
            else if (cümle.contains("is")) {
                System.out.println("çalışmak güzelir");
            }
            else System.out.println("çok çalışman lazım");





/*
        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
                - ilk harf kucuk harf olmali
        - son karakter rakam olmali
                - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmalı
 */
        /*
       Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir şifre giriniz");
        String sifre = scan.nextLine();
        boolean flag = true;
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf küçük harf olmalı");
            flag = false;
        }
        if (sifre.charAt(sifre.length()-1)>=0 && sifre.charAt(sifre.length()-1)<=9){
            System.out.println("son karakter rakam olmalı");
            flag = false;
        }
         if (sifre.contains(" ")) {
            System.out.println("şifre boşluk içermemeli");
            flag = false;
        }
        if (!(sifre.length()>10)){
            System.out.println("şifrenin uzunluğu en az 10 olmalı");
            flag = false;
        }
        if (flag==true){
            System.out.println("şifre başarıyla kaydedilmiştir");
        }

         */

}}
