package day07_If_Statements;

import java.util.Scanner;

public class C03_BağımsızIfCümleleri {
    public static void main(String[] args) {
     // SORU1= kullanıcıdan bir pozitif tam sayı isteyin
        // sayıyı kontrol edip 5 ile bölünebiliyorsa
        // sayı 5 in tam katı yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı giriniz");
        int girilensayı = scanner.nextInt();

        if (girilensayı%5==0) {
            System.out.println("sayı 5 in tam katıdır");
        }


    }
}
