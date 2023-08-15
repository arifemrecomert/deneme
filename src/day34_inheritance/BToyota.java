package day34_inheritance;

public class BToyota extends Araba{
    // parent class'daki bazı özellikleri update edebiliriz.
    String marka = "Toyota";
    String uretimYeri = "Toyota araçlar Japonya ve Türkiye'de üretilir";

    // parent class'da olmayan yeni özellikler ekleyebiliriz.
    String lastik = "Tüm toyota araçlar pirelli lastik kullanır";
    String guvenlik = "Tüm toyota araçlar extra güvenlik içerir.";
    String fren = "Tüm toyota araçlar abs fren sistemi kullanır.";


}
