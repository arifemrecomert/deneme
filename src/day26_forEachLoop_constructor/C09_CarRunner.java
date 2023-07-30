package day26_forEachLoop_constructor;

public class C09_CarRunner {
    public static void main(String[] args) {
        C08_Car car1 = new C08_Car();
        System.out.println(car1.marka); // marka belirtilmemiş
        System.out.println(car1.model); // model belirtilmemiş

        System.out.println(car1);
        car1.marka="Toyota";
        car1.model="Corolla";
        car1.yil=2011;
        car1.fiyat=750000;
        car1.renk="Beyaz";
        System.out.println(car1);
        // Araba Bilgileri==>marka:'Toyota', model:'Corolla', yil:2011, fiyat:750000, renk:'Beyaz'

        C08_Car car2 = new C08_Car();
        System.out.println(car2);
       // Araba Bilgileri==>marka:'marka belirtilmemiş', model:'model belirtilmemiş', yil:1900, fiyat:0, renk:'renk belirtilmemiş'
        car2.marka="Honda";
        car2.fiyat=825000;
        car2.renk="Mavi";
        System.out.println(car2);
       // Araba Bilgileri==>marka:'Honda', model:'model belirtilmemiş', yil:1900, fiyat:825000, renk:'Mavi'

        C08_Car car3 = new C08_Car();
        System.out.println(car3);
        // Araba Bilgileri==>marka:'marka belirtilmemiş', model:'model belirtilmemiş', yil:1900, fiyat:0, renk:'renk belirtilmemiş'

    }
}
