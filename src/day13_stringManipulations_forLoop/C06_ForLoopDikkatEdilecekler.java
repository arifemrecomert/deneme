package day13_stringManipulations_forLoop;

public class C06_ForLoopDikkatEdilecekler {
    public static void main(String[] args) {
        // verdiğiniz başlangıç değeri, bitiş şartını sağlamazsa
        // for loop çalışır ANCAK for loop body'si DEVREYE GİRMEZ

        for (int i = 0; i > 10; i++) {
            System.out.println(i);
        }

        // başlangıç değeri ve değişim şekli, hiç bir zaman bitiş değerine ulaşmazsa
        // sonsuz loop oluşur. PC çöker.
        /*
         for (int i = 0; i >=0 ; i++) {
            System.out.println(i+" ");
        }
         */
        // kullanıcının verdiği başlangıç ve bitiş değerleri dahil olarak
        // aranan sayıya tam bölünebilen bir sayı varsa
        // "aranan sayı ile tam bölünebilen bir sayı var" yazdırın

       int baslangic = 56;
       int bitis = 60;
       int aranansayı = 5;

        for (int i = baslangic; i <=bitis ; i++) {
            if (i%aranansayı==0){
                System.out.println("aranan sayı ile tam bölünebilen bir sayı var: " + i);
                break;
            }

        }

       /*
        int başlangıç = 201;
        int bitiş =237;

        int aranansayı=43;
        for (int i = başlangıç; i <=bitiş ; i++) {
            System.out.println(i);
            if (i%aranansayı==0){
                System.out.println("aranan sayı ile tam bölünebilen bir sayı var");
           break;
            }

        */
            /*
            bir loop devam ederken
            eğer bir değerde istediğimiz işlem gerçekleşir
            ve loop'un geri kalanına ihtiyacımız olmazsa
            orada break kullanabiliriz.
            Java break; komutunu gördüğünde loop'u çalıştırmayı bırakır.
             */
        }
    }

