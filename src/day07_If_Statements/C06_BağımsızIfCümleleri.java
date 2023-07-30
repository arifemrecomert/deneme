package day07_If_Statements;

import java.util.Scanner;

public class C06_BağımsızIfCümleleri {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tam sayi isteyin
        // sayi 3 veya 5 ile bolunebiliyorsa
        // "Guzel sayi" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int tamsayı1 = scan.nextInt();
        if (tamsayı1%5==0 || tamsayı1%3==0) System.out.println("güzel bir sayı");
        else System.out.println("güzel bir sayı değil");


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int tamsayı = scanner.nextInt();
        if (tamsayı%3==0)
        if (tamsayı%5==0){
            System.out.println("güzel sayı");

            // yukarıda olduğu gibi aşağıdakide doğru..
            // if (girilenSayi % 3 == 0 || girilenSayi % 5 == 0) System.out.println("Guzel sayi");
        }
    }
}
