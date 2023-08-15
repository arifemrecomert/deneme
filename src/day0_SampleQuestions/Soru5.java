package day0_SampleQuestions;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        //SORU 5: Kullanıcıdan karenin kenar uzunluğunu alın.
        // Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen karenin kenar uzunluğunu giriniz");
        double kenar = scanner.nextDouble();

        double kareninalanı = kenar*kenar;
        double kareninçevresi = kenar*4;

        System.out.println("karenin alanı:"+ kareninalanı);
        System.out.println("karenin çevresi:" + kareninçevresi);
    }
}
