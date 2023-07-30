package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C03_MethodOlusturma {
    // Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    // isim bosluk soyisim seklinde bize donduren bir method olusturun
    // input : isim : Ali soyisim :YILMAZ.    output : Ali Yilmaz

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz:"); // tek isim istiyoruz
        String isim = scanner.next(); // tek isim istediği için next dedik. fazla isteseydi nextLine yapıyorduk

        System.out.println("lütfen soyisminizi giriniz");
        String soyisim = scanner.next();

        System.out.println(isimdüzenle(isim, soyisim)); // istersek direk döndürdüğü sonucu yazdırabilir.
        String düzenliisim= isimdüzenle(isim,soyisim); // istersekte ilerde kullanmak üzere kaydedebiliriz.

    }  // main sonu

    public static String isimdüzenle(String isim, String soyisim){
        isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();

        String istenenformattaIsimSoyısım= isim+" "+soyisim;
        return istenenformattaIsimSoyısım;
    }
}
