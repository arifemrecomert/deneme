package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class Örnek1 {
    public static void main(String[] args) {
        /*
         while loop ile baslagic degeri ile bitis degeri arasindaki
         sayilari toplayip yazdirin (sinirlar dahil)
         baslangic degeri bitis'ten buyukse, toplama olmamali
         */
        /*
        int baslangıc = 20;
        int bitis = 40;
        int toplam = 0;

        while (baslangıc<=bitis){
        toplam+=baslangıc;
        baslangıc++;
        }
        System.out.println(toplam);

         */
        int baslangıc = 20;
        int bitis = 40;
        int toplam = 0;
        do {
            toplam+=baslangıc;
            baslangıc++;
        }while(baslangıc<=bitis);
        System.out.println(toplam);
        }

        }



