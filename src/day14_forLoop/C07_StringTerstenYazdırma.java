package day14_forLoop;

import java.util.Scanner;

public class C07_StringTerstenYazdırma {
    public static void main(String[] args) {
        // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen tersten yazdırmak istediğiniz metni giriniz");
        String str = scanner.nextLine();

        // Java Candir

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        // terse çevrilmiş halini kaydedelim
        String tersmetin = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersmetin += str.charAt(i);
        }
        System.out.print("terse çevrilen metin:"+tersmetin);

    }
}
