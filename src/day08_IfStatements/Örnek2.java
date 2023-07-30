package day08_IfStatements;

import java.util.Scanner;

public class Örnek2 {
    public static void main(String[] args) {
        /*
        Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için
        bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
        Ipucu:  IF/Else kullanabilirsiniz.
                Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 123456
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        long sayı1= scanner.nextLong();
        System.out.println("lütfen 2. sayıyı giriniz");
        long sayı2=scanner.nextLong();
        long toplam= sayı1+sayı2;
        if (!(sayı1>1000000000 && sayı2>1000000000 && toplam>1000000000)){
            System.out.println("sayıların toplamı:" +toplam);
        }else {
            System.out.println("fazla yükleme");
        }
    }
}
