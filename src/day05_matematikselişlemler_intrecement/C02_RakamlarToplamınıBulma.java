package day05_matematikselişlemler_intrecement;

import java.util.Scanner;

public class C02_RakamlarToplamınıBulma {
    public static void main(String[] args) {
        //kullanıcıdan 3 basamaklı bir sayı alıp
        // sayının rakamlarını toplayıp yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı pozitif bir tam sayı giriniz:");
        int girilensayı = scanner.nextInt();
        int birlerbasamağı = 0;
        int rakamlartoplamı = 0;

        // ilk sayı için birler basamağını bulalım

        birlerbasamağı = girilensayı % 10;
        rakamlartoplamı = rakamlartoplamı + birlerbasamağı;

        // birler basamağındaki sayıyı aldık, artık ondan kurtulalım.
        girilensayı = girilensayı / 10;

        // bu satıra geldiğimizde girilen sayıyı 2 basamaklı hale dönüştürür.

        birlerbasamağı = girilensayı % 10;
        rakamlartoplamı = rakamlartoplamı + birlerbasamağı;
        girilensayı = girilensayı / 10 ;

        // buraya geldiğimizde artık sayımız tek basamaklı

        birlerbasamağı = girilensayı % 10;
        rakamlartoplamı = rakamlartoplamı + birlerbasamağı;
        girilensayı = girilensayı / 10 ;

        System.out.println("rakamlar toplamı" + rakamlartoplamı);


    }
}
