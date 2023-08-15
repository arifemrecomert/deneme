package day0_SampleQuestions;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        // SORU 3= Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.

        Scanner scanner = new Scanner(System.in);
        double toplam = 0;
        for (int i = 1; i <6 ; i++) {
            System.out.println("lütfen "+i+". sayıyı giriniz");
            double sayı = scanner.nextDouble();
            toplam += sayı;
        }
        System.out.println("ortalama:" +toplam/5);
    }
}
