package day07_If_Statements;

import java.util.Scanner;

public class C05_BağımsızIfCümleleri {
    public static void main(String[] args) {
        // Soru: Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın
        //üçgen eşkenar ise "eşkenar üçgen" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();
        // java da üçlü karşılaştırma OLMAZ
        // ikili karşılaştırmalar yapıp && veya || ile birleştirmeliyiz.
        if (kenar1==kenar2&&kenar1==kenar3 && kenar1>0 ){
            System.out.println("eşkenar üçgen");


        }

    }
}
