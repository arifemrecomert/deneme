package day0_SampleQuestions;

import java.util.Scanner;

public class Soru21 {
    public static void main(String[] args) {


    /*
    BONUS !    Soru 21-)  ---> Mülakat Sorusu / Interview Sorusu / Leak Year
    Bir aydaki gün sayısını bulmak için bir Java programı yazın

    Örnek:
    Bir ay numarası girin: 2
    Bir yıl girin: 2016Şubat 2016'da 29 gün vardıripucu:Switch Case kullanarak çözebiliriz.
    Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
    Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!ipucu2:
    ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
            1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
            Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
            2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
    Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz");
        int yil = scanner.nextInt();

        System.out.println("Lütfen ay numarasını giriniz");
        int ayNo = scanner.nextInt();


        switch (ayNo){
            case 1:
                System.out.println("Girdiğiniz ay OCAK 31 gün çekmektedir");
                break;
            case 2:
                artilYil(yil);
                break;
            case 3:
                System.out.println("Girdiğiniz ay MART 31 gün çekmektedir");
                break;
            case 4:
                System.out.println("Girdiğiniz ay NİSAN 31 gün çekmektedir");
                break;
            case 5:
                System.out.println("Girdiğiniz ay MAYIS 31 gün çekmektedir");
                break;
            case 6:
                System.out.println("Girdiğiniz ay HAZİRAN 30 gün çekmektedir");
                break;
            case 7:
                System.out.println("Girdiğiniz ay TEMMUZ 31 gün çekmektedir");
                break;
            case 8:
                System.out.println("Girdiğiniz ay AĞUSTOS 31 gün çekmektedir");
                break;
            case 9:
                System.out.println("Girdiğiniz ay EYLÜL 30 gün çekmektedir");
                break;
            case 10:
                System.out.println("Girdiğiniz ay EKİM 31 gün çekmektedir");
                break;
            case 11:
                System.out.println("Girdiğiniz ay KASIM 30 gün çekmektedir");
                break;
            case 12:
                System.out.println("Girdiğiniz ay ARALIK 31 gün çekmektedir");
                break;
            default:
                System.out.println("hatalı giriş yaptınız");
        }
    }

    public static void  artilYil (int yil){
        /*
        1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
                Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
                Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.
         */

        if ((yil % 100 != 0 && yil % 4 == 0) || yil % 400 == 0){
            System.out.println(yil +" " + " yılı artık yıldır ve Şubat ayı 29 gün çekmektedir");
        }
        else System.out.println(yil +" "+ "yılı artık yıldır ve Şubat ayı 28 gün çekmektedir");

    }
}
