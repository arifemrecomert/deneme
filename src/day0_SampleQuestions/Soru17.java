package day0_SampleQuestions;

import java.util.Scanner;

public class Soru17 {
    public static void main(String[] args) {
        /*
        Soru 17-)
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
        Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
                İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
                değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
                Ipucu:
        IF/Else - Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir isim giriniz");
        String isim = scanner.nextLine();

        int uzunluk =isim.length();
        char birinciharf = isim.charAt(0);
        char ikinciharf = isim.charAt(1);
        char ucuncuharf = isim.charAt(2);

        if (uzunluk==3){
        if (birinciharf==ikinciharf || birinciharf==ucuncuharf || ikinciharf==ucuncuharf){
            System.out.println("Dize yinelenen karakterlere sahip");
        }
        else {
            System.out.println("Dize benzersiz karakterlere sahip");
        }
        }
    else System.out.println("isim hatalı girildi. Lütfen uzunluğu 3 harfli olan bir isim giriniz");


    }
}
