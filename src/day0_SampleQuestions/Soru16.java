package day0_SampleQuestions;

import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
        -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
        -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
        Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
        Örn:
	     isim1= masa
         isim2= ali
	     Konsol => maalisa
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen ilk ismi giriniz");
        String isim1 = scanner.nextLine();
        System.out.println("lütfen ikinci ismi giriniz");
        String isim2 = scanner.nextLine();

        if (isim1.length()%2==0 ){
            int kelimeninortası = isim1.length()/2;
            String birincikısın = isim1.substring(0,kelimeninortası);
            String ikincikısım = isim1.substring(kelimeninortası);
            String yeniisim = birincikısın+isim2+ikincikısım;
            System.out.println("kelimenin ortasına yazılan isim:" + yeniisim);
        }else {
            System.out.println("isim2, isim1'e eklenemez");
        }
    }
}