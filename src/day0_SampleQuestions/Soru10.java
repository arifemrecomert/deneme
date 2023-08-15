package day0_SampleQuestions;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
        /*
        Soru 10-)
        Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

        **indeks Hesaplama: İPUCU :
      Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
      Kullanıcıya aşağıdaki gibi mesaj verin:

        Eğer VKİ 18.5'ten az ise --> zayıfsınız
        Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        VKİ 30'a eşit veya daha fazlaysa --> agam obezsin, diyet yap!
       */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        double kilo = scanner.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double vki = (kilo)/(boy*boy);

        if (vki<=18.5){
            System.out.println("VKI Değeriniz: " + vki+" zayıfsınız");
        } else if (vki<=25) {
            System.out.println("VKI Değeriniz: " + vki+" kilonuz ideal");
        } else if (vki<30) {
            System.out.println("VKI Değeriniz: " + vki+" şişmansınız");
        } else  {
            System.out.println("VKI Değeriniz: " + vki+" agam obezsin, diyet yap");
        }
    }
}
