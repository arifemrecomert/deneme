package day0_SampleQuestions;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        /* Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        Ipucu:
        Saati alıp saniyeye cevirebilirsiniz.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir zaman giriniz");
        System.out.println("Saat: ");
        int saat = scanner.nextInt();
        System.out.println("Dakika: ");
        int dakika = scanner.nextInt();
        System.out.println("Saniye: ");
        int saniye = scanner.nextInt();

        System.out.println("Girilen zaman saniye cinsinden:" + (saat*3600) + (saniye*60) + (saniye) + "saniyedir");
    }
}
