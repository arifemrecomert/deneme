package day02_datatürleri;

public class C04_Stringdatatürü {
    public static void main(String[] args) {
        int sayi = 20;

        System.out.println(sayi); // 20

        String isim = "Berk Yilmaz";

        System.out.println(isim.toUpperCase()); // BERK YILMAZ

        System.out.println(isim.toLowerCase()); // berk yilmaz


        System.out.println(isim); // Berk Yilmaz


        String str1 = "Java";
        String str2 = "Candir";

        System.out.println(str1 + str2);
        // iki tane String + isareti ile toplanmaya calisilirsa
        // Java o iki String'i BIRLESTIRIR
        // JavaCandir

        String str3 = "30";
        String str4 = "40";

        System.out.println(str3 + str4); // 3040

        // Verilen isim ve soyismi
        // Girilen ramazan tatar database'e kaydedildi
        // seklinde yazdirin

        String adi = "Ramazan";
        String soyadi = "Tatar";

        System.out.println("Girilen "+ adi + " " + soyadi + " database'e kaydedildi");

        // " " arasindaki bosluklar konsolda yazdirilan metne yansir
        // ancak kodlar arasinda birakilan bosluklar metne yansimaz
        // System.out.println("Girilen "+        adi         + " " + soyadi + " database'e kaydedildi");
    }
}
