package day26_forEachLoop_constructor;

public class C08_Car {

    String marka = "marka belirtilmemiş";
    String model = "model belirtilmemiş";
    int yil = 1900;
    int fiyat;
    String renk = "renk belirtilmemiş";


    public String toString() {
        return "Araba Bilgileri==>" +
                "marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat +
                ", renk:'" + renk + '\'' +
                ' ';
    }
}
