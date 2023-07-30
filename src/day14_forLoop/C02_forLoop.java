package day14_forLoop;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
       // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        // dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        // baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
    Scanner scan = new Scanner(System.in);
        System.out.println("lütfen başlangıç değerini tam sayı olarak giriniz");
        int baslangıc = scan.nextInt();
        System.out.println("lütfen bitiş değerini tam sayı olarak giriniz");
        int bitis = scan.nextInt();
        int toplam = 0;
        if (bitis<baslangıc){
            System.out.println("bitiş değeri başlangıç değerinden küçük olamaz");
        }
        else {for (int i = baslangıc; i <=bitis ; i++) {
            toplam+=i;}
        }
        System.out.println("aradaki sayıların toplamı:" + toplam);


/*
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen başlangıç değeri için pozitif bir tamsayı giriniz");
        int baslangıç=scanner.nextInt();
        System.out.println("lütfen bitiş değeri için pozitif bir tamsayı giriniz");
        int bitis=scanner.nextInt();

        if (bitis<baslangıç){
            System.out.println("başlangıç değeri bitiş değerinden büyük olamaz");
        }else{
            int toplam = 0;
            for (int i = baslangıç; i <=bitis ; i++) {
                toplam +=i;
            }
            System.out.println("sınırlar arasındaki sayıların toplamı:"+toplam);
        }

 */
    }
}
