package day17_MethodOlusturma_methodOverLoading;

import day16_methodOlusturma_Kullanma.C01_MethodOlusturma;
import day16_methodOlusturma_Kullanma.C03_MethodOlusturma;

public class C03_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {
        C01_MethodOlusturma.altString("Method budur...",7,8);
        System.out.println(C03_MethodOlusturma.isimdüzenle("ömer", "GOK"));
        System.out.println(C01_AsalSayiBulma.asalSayiMi(59));
        System.out.println(C02_TamBölenlerSayısınıBulma.tamBolenlerSayisi(12));

    }
}
