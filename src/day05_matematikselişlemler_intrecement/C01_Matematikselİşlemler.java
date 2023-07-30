package day05_matematikselişlemler_intrecement;

import java.sql.SQLOutput;

public class C01_Matematikselİşlemler {
    public static void main(String[] args) {
        int a = 27;
        int b = 4;
        // Java iki tam sayıyı bölerseniz sonucu tamsayı olarak size verir.
        System.out.println(a/b); // 27/4=6,75==>6
        System.out.println(32/5); // 32/5=6,4==>6

        // Eğer bölünen sayı veya bölen sayıdan double olan varsa sonucu double olarak verir.
        double c = 27;
        System.out.println(c/b); // 27/4=6,75

        // a'yı b'ye böldürüp sonucu ondalıklı olarak yazdırın

        double sonuc = a/b;  //  27/4=6,75==>6 sonuc=6

        System.out.println("sonuc :" + sonuc); //6,0

        double sonuc2 = (double)(a/b);
        System.out.println("sonuc2:" + sonuc2);

        double sonuc3 = (double)a/b;
        System.out.println("sonuc3:" + sonuc3);

        System.out.println(2567/10); //256,7==>256
        System.out.println(2567%10); // 7  -- (%) iki sayının bölümünden kalanı verir.

        System.out.println(256/10);  //25,6==>25
        System.out.println(256%10);  // 6

        System.out.println(25/10);  //  2,5==>2
        System.out.println(25%10);  // 5

        System.out.println(2/10); //0,2==>0
        System.out.println(2%10); // 2

        System.out.println("Rasim Fatma ile evlenecek 25.06.2023");


    }
}
