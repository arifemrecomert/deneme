package day16_methodOlusturma_Kullanma;

public class C04_BaskaClassdanMethodKullanımı {
    public static void main(String[] args) {
        C01_MethodOlusturma.altString("method",1,3);

        System.out.println(C03_MethodOlusturma.isimdüzenle("bugra", "CAN"));//istersek yazdırırız.

        String isimDüzenli = C03_MethodOlusturma.isimdüzenle("mehmet","kemal");// bunu kaydettik,
        // sonuç ekranında karşımıza çıkmaz

        // düzenlenmiş ismin uzunluğunu yazdırın.
        System.out.println(isimDüzenli.length());
        // düzenlenmiş ismi büyük harflerle yazdırın.
        System.out.println(isimDüzenli.toUpperCase());


        // void olan method da sonucu kaydedemeyiz, sadece yazdırırız.
        // bize değer döndüren method da ise sonucu
        // istersek direk yazdırır, istersekte sonra kullanmak için kaydederiz.

    }
}
