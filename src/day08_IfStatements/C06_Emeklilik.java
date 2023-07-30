package day08_IfStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

      //  Kullanicidan cinsiyetini ve yasini alin,
        //  Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //  Cinsiyet ve yasini dikkate alarak
        //  “Emekli olabilirsin” veya
        //  “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz E: Erkek K: Kadın");
        char cinsiyet1 = scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        double yas1 = scan.nextInt();

        if (cinsiyet1== 'E' && yas1>=65){
            System.out.println("erkek emekli olabilir");
        } else if (cinsiyet1=='E'&& yas1<65) {
            System.out.println("emekli olmak için" + (65-yas1) + "yıl daha çalışmalısınız");
        } else if (cinsiyet1=='K' && yas1>=60) {
            System.out.println("kadın emekli olabilir");
        } else if (cinsiyet1=='K' && yas1<60) {
            System.out.println("emekli olmak için" +(60-yas1)+ "yıl daha çalışmalısınız");
        }else System.out.println("hatalı değer girdiniz");


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz E: Erkek, K: Kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0); // toUpperCase eklersek küçük harfde yazsak kabul eder.
        System.out.println("lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();
        if (cinsiyet=='E' && yas>=65){
            System.out.println("erkek emekli olabilir");
        }
        else if (cinsiyet=='E' && yas<65){
            System.out.println("erkek emekli olamaz" + (65-yas) +  " yıl daha çalışmalısınız");
        }
        else if (cinsiyet=='K' && yas>=60){
            System.out.println("kadın emekli olabilir");
        }
        else if (cinsiyet=='K' && yas<60){
            System.out.println("kadın emekli olamaz" + (60-yas)+ "yıl daha çalışmalısın");
        }

    }
}
