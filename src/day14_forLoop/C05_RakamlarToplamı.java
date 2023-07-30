package day14_forLoop;

import java.util.Scanner;

public class C05_RakamlarToplamı {
    public static void main(String[] args) {
      //  Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Rakamlarını toplamak üzere pozitif bir tamsayı giriniz");
        int girilensayı=scanner.nextInt();
        int sayı = girilensayı;
        int birlerbasamağı=0;
        int rakamlartoplamı=0;

        int basamaksayısı =(sayı+"").length();
        for (int i = 1; i <=basamaksayısı ; i++) {
        birlerbasamağı = sayı % 10;
        rakamlartoplamı+=birlerbasamağı;
        sayı/=10;
        }
        System.out.println("Girilen"+girilensayı+"sayının rakamlar toplamı:"+rakamlartoplamı);


    }
}
