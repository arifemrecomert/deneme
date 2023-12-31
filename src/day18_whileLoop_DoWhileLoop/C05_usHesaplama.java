package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C05_usHesaplama {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip
        // yazdiran bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üssünü hesaplayacağımiz pozitif bir sayı giriniz");
        double sayi = scanner.nextDouble();

        System.out.println("Lütfen hesaplanacak üs için pozitif bir tamsayı giriniz");
        int us = scanner.nextInt();

        usHesapla(sayi, us);

    }
    public static void usHesapla(double sayi, int us) {

        double sonuc = 1;
        while (us > 0) {
            sonuc *= sayi;
            us--;
        }
        System.out.println("sonuç:" + sonuc);
    }
}
