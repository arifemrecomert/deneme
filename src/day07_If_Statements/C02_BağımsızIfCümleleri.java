package day07_If_Statements;

public class C02_BağımsızIfCümleleri {
    public static void main(String[] args) {
        /*
            Dikkat edilecekler
            1- eger boolean sarttan sonra {} kullanilmazsa
               Java if body'si olarak ilk ; e kadar olan bolumu alir
               digerleri if body'sinin disinda kalir
            2- if cumlesinde {} kullanmaz ve
               boolean sartin sonuna ; yazarsaniz
               if cumlesi hic bir islem yapmaz
               cunku body'si yoktur

               OZETLE
               if body'si tek satirdan olusuyorsa {} kullanmasaniz da olur
               ancak if body'si birden fazla satirdan olusuyorsa MUTLAKA {} kullanmalisiniz
         */

        int a = 35;
        int b =30;
        if (a<b){
            System.out.println("a b den küçük 1");
            System.out.println("a b den küçük 2");
            System.out.println("a b den küçük 3");
        }

        if (a%2==0) // buraya ; koyarsak if bu satırda biter. alt satırlarla ilgisi olmaz
            System.out.println("a 2 ile tam bölünüyor 1"); // ilk virgüle kadar olan kısım if body sidir
            System.out.println("a 2 ile tam bölünüyor 2"); // sonraki satırların if ile alakası yoktur
            System.out.println("a 2 ile tam bölünüyor 3");


    }
}
