package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        // kullanıcıdan toplanmak üzere pozitif sayılar isteyin
        // kullanıcı işlemi bitirmek için sıfıra basmalıdır
        // kullanıcı sıfıra bastığında kaç pozitif sayı girdiğini
        // ve toplamlarının kaç olduğunu yazdıın

        // önce while loop ile yapalım
/*
        Scanner scanner ;
        int sayac = 0;
        int toplam = 0;
        int girilensayı = 9;

        while(girilensayı !=0){
            scanner=new Scanner(System.in);
            System.out.println("lütfen toplanmak üzere pozitif sayı giriniz");
            girilensayı = scanner.nextInt();

            if (girilensayı !=0){
                toplam+=girilensayı;
                sayac++;
            }

        }
        System.out.println("Girilen"+sayac+"adet sayının toplamı"+toplam);
 */
        // do while ile yapalim

        Scanner scanner;
        int sayac = 0 ;
        int toplam = 0 ;
        int girilensayi;


        do {
            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere pozitif sayi giriniz");
            girilensayi = scanner.nextInt();

            if (girilensayi != 0){
                toplam += girilensayi;
                sayac++;
            }

        }while (girilensayi != 0);

        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);

    }
}
