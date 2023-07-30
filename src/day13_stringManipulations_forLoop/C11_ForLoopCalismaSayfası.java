package day13_stringManipulations_forLoop;

public class C11_ForLoopCalismaSayfası {
    public static void main(String[] args) {
        // kullanıcının verdiği input değerinden başlayıp
        // ardışık 10 tam sayı yazdırın.

      // int sayı = 10;
       /*
        for (int i = sayı; i <sayı+10 ; i++) {
            System.out.print(i + " ");}

        */

            //kullanıcının verdiği sayıdan başlayın
            // 100 e kadar 5er 5er artırarak yazdırın
      /*  for (int i = 10; i <100 ; i+=5) {
            System.out.print(i+" ");

        }

       */

            // 100 den başlayıp 1 e kadar geri geri gidin
            // 7 nin katı olan sayıları yazdırın
        /*
        for (int i = 100; i >=1 ; i--) {
            if (i%7==0){
            System.out.print(i+" ");
            }

        }
         */

        // kullanıcının verdiği başlangıç ve bitiş değerleri dahil olarak
        // aranan sayıya tam bölünebilen bir sayı varsa
        // "aranan sayı ile tam bölünebilen bir sayı var" yazdırın

        int başlangıç = 201;
        int bitiş =237;

        int aranansayı=43;
        for (int i = başlangıç; i <=bitiş ; i++) {

            if (i%aranansayı==0){
                System.out.println("aranan sayı ile tam bölünebilen bir sayı var");
                break;
            }}

    }}







