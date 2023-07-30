package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //         dikdortgenin alanini yazdirin.

        // benim çalıştığım bölüm
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin iki kenar uzunluğunu giriniz");
        double kenar11 = scanner1.nextDouble();
        double kenar22 = scanner1.nextDouble();
        System.out.println("dikdörtgenin alanı =" + kenar11*kenar22);



        // hocanın anlattığı bölüm
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin iki kenarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " + kenar2*kenar1);
    }
}
