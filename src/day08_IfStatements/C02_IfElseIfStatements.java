package day08_IfStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir tam sayı isteyin
        //sayı üçe bölünüyorsa 3ün katı
        //sayı 5e bölünüyorsa 5in katı
        //ikisine birden bölünüyorsa süper sayı
        //ikisinede bölünmüyorsa yaramaz sayı yazdırın
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int tamsayı = scanner1.nextInt();
        if (tamsayı % 3 == 0 && tamsayı % 5 == 0) {
            System.out.println("tamsayı= süper sayı");
        } else if (tamsayı % 5 == 0) {
            System.out.println("tamsayı= 5'in katı");
        } else if (tamsayı % 3 == 0) {
            System.out.println("tamsayı= 3Ün katı");
        } else System.out.println("yaramaz sayı");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0) System.out.println("super sayi");

        else if (girilenSayi % 5 == 0) System.out.println("5'in kati");

        else if (girilenSayi % 3 == 0) System.out.println("3'un kati");

        else System.out.println("Yaramaz sayi");
    }
}
