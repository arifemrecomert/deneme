package day0_SampleQuestions;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
        /*
        Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın.
        Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun
        ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                Loopun içerisinde String methodlarından  yararlanalım!
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen uzunluğu en az 5 harfli bir kelime giriniz");
        String kelime = scanner.nextLine();

        while (!(kelime.length()>=5)){
            System.out.println("lütfen uzunluğu en az 5 harf olan bir kelime giriniz");
        }
        String sonUcKarakter=kelime.substring(kelime.length()-3);
        System.out.println(sonUcKarakter +" "+  sonUcKarakter );



    }
}
