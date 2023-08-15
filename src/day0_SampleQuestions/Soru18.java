package day0_SampleQuestions;

import java.util.Scanner;

public class Soru18 {
    public static void main(String[] args) {
        /*
        Soru 18-) Method Sorusu
        Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
         Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        İpucu:
        yol=Hız*zaman
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aracınızın hızını giriniz");
        int hız = scanner.nextInt();
        System.out.println("Lütfen yol uzunluğunu km olarak giriniz");
        int yoluzunluğu = scanner.nextInt();
        varıssüresi(hız,yoluzunluğu);
        System.out.println("Gidilen yere varıs süresi " + varıssüresi(hız,yoluzunluğu) + " saattir");

    }
    public static int varıssüresi (int hız, int yoluznluğu){

        int varıssüresi = yoluznluğu/hız;
     return varıssüresi;
    }


}
