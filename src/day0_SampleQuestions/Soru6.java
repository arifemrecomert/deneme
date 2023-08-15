package day0_SampleQuestions;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        /* Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayınç
        Ipuclari:
·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("günde kaç bardak çay içiyorsunuz? Sayı olarak giriniz.");
        int bardak= scanner.nextInt();
        System.out.println("Bir bardak çay için kaç adet şeker kullanıyorsunuz?");
        int seker = scanner.nextInt();
        int biryıldaiçilençay = 365*bardak;
        int yıldakullanılanşeker= biryıldaiçilençay*seker;
        System.out.println("yılda içilen çay:" + biryıldaiçilençay);
        double kg = (yıldakullanılanşeker*1.5)/1000;
        System.out.println("bir yılda kullanılan şeker:"+kg+ "kg'dir");

    }
}
