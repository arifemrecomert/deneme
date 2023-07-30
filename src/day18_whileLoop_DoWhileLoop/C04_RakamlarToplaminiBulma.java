package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen rakamlar toplamını bulmak istediğiniz sayıyı yazınız");

        int girilensayi = scanner.nextInt();
        int sayi=girilensayi;
        int birlerbasamagi = 0;
        int rakamlartoplami =0;

        while(sayi>0){
            birlerbasamagi=sayi%10;
            rakamlartoplami+=birlerbasamagi;
            sayi/=10;
        }
        System.out.println("girilen"+girilensayi+"nin rakamlar toplamı:"+rakamlartoplami);


    }
}
