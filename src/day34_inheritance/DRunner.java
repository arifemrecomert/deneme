package day34_inheritance;

public class DRunner {
    public static void main(String[] args) {

        Corolla corolla = new Corolla();
        // Corolla class'ındaki özellikler
        System.out.println(corolla.uretimYeri); // C Sakarya / Türkiye
        System.out.println(corolla.model); // C Corolla
        System.out.println(corolla.akü); // C inci akü
        System.out.println(corolla.sanziman); // C Cvt

        // Toyota class'ındaki özellikler
        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.lastik); // Tüm toyota araçlar pirelli lastik kullanır
        System.out.println(corolla.guvenlik); // Tüm toyota araçlar extra güvenlik içerir.
        System.out.println(corolla.fren); // Tüm toyota araçlar abs fren sistemi kullanır.

        // Araba class'ından aldığı özellikler
        System.out.println(corolla.yakit); // Yakıt türü belirtilmedi
        corolla.yakit= "Benzin";
        System.out.println(corolla.yakit); // Benzin
        System.out.println(corolla.yil); // 1900
        System.out.println(corolla.renk); // Renk belirtilmedi



    }
}
