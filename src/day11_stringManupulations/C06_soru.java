package day11_stringManupulations;

import java.util.Scanner;

public class C06_soru {
    public static void main(String[] args) {
        // SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa “gecersiz mail”
        // - mail @gmail.com icermiyorsa, “mail gmail olmali”
        // - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
        //nyazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen mail adresi giriniz");
        String str = scan.nextLine();
        if (!str.contains("@")){
            System.out.println("geçersiz mail");}
        else if (!str.contains("@gmail.com")){
            System.out.println("mail gmail olmalı");
        } else if (!str.endsWith("gmail.com")) {
            System.out.println("mailde yazım hatası var");
        } else System.out.println("geçerli mail.");


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen mail adresinizi giriniz");
        String mail = scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("geçersiz mail");
        }
        else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmalı");
        }else if (!mail.endsWith("gmail.com")){
            System.out.println("mailde yazım hatası var");
        }

    }
}
