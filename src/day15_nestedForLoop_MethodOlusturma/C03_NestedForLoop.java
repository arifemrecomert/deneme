package day15_nestedForLoop_MethodOlusturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {
      /*
        1           1. satir 1’den 1’e kadar yazdir
        1 2         2. satir 1’den 2’e kadar yazdir
        1 2 3         3. satir 1’den 3’e kadar yazdir
        1 2 3 4.      4. satir 1’den 4’e kadar yazdir

       */

        for (int i = 1; i <=4 ; i++) { //satırları kontrol ediyor
            for (int j = 0; j <= i ; j++) { // sütünları kontrol ediyor
                System.out.print(j + "  ");
            }
            System.out.println("");

        }
   }

}
