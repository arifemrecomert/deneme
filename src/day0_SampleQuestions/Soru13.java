package day0_SampleQuestions;

import java.util.Scanner;

public class Soru13  {
    public static void main(String[] args) {
        // Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
        // Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
        // Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
        // Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
        //  Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.

        Scanner scanner=new Scanner(System.in);
        System.out.println( "lütfen cevap harflerini giriniz");
        char harf = scanner.next().toLowerCase().charAt(0);
        switch (harf) {
            case 'a':
                System.out.println("isteğiniz işleniyor");
                break;
            case 'b':
                System.out.println("değerlendirmeniz için yinede teşekkür ederiz");
                break;
            case 'c':
                System.out.println("üzgünüm şuanda yardımcı olamıyorum");
                break;
            default:
                System.out.println("geçersiz giriş, lütfen tekrar deneyiniz");
        }
    }
}