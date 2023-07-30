package day08_IfStatements;

import java.util.Scanner;

public class C07_NestedİfElseStatements {
    public static void main(String[] args) {
        //  Kullanicidan cinsiyetini ve yasini alin,
        //  Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //  Cinsiyet ve yasini dikkate alarak
        //  “Emekli olabilirsin” veya
        //  “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz E: Erkek, K: Kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0); // toUpperCase eklersek küçük harfde yazsak kabul eder.
        System.out.println("lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();

        /*
        birden fazla değişken varsa içlerinden  birini birincil
        değişken olarak alıp ona göre bir if - else if - else kuralım
         */
        if (cinsiyet=='E'){
            if (yas<0 || yas>100) System.out.println("geçersiz yaş girişi");
            else if (yas>=65) {
                System.out.println("erkek emekli olabilir");
            }else System.out.println("erkeğin emekli olması için" +(65-yas)+"yıl daha çalışması gerekiyor");
        }
        else if (cinsiyet=='K'){
            if (yas<0 || yas>100) System.out.println("geçersiz yaş girişi");
            else if (yas>=60) {
                System.out.println("kadın emekli olabilir");
            }else System.out.println("kadının emekli olması için" + (60-yas)+ "yıl daha çalışması gerekiyor");
        }
        else System.out.println("cinsiyet hatalı girildi");


        /*
        if (cinsiyet=='E'){
            if (yas<0 || yas>100){
                System.out.println("geçersiz yaş girişi");
        }else if (yas>=65){
                System.out.println("erkek emekli olabilir");}
            else {
                System.out.println("emekli olmak için daha" + (65-yas) + "yıl çalışmalısın");
            }

        }

        else if (cinsiyet=='K'){
            if (yas<10 || yas>800){
                System.out.println("geçersiz yaş girişi");
            } else if (yas>=60){
                System.out.println("kadın emekli olabilir");
            }
            else {
                System.out.println("emekli olmak için daha" + (60-yas)+ "yıl daha çalışmalısın");
            }


        }
        else{
            System.out.println("cinsiyet hatalı girildi");
        }



         */



    }
}
