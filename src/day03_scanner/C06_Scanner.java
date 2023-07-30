package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan bir cemberin yaricapini alip,
        //         cevresini ve alanini yazdirin.


        // benim çalıştığım bölüm=
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("yarıçap giriniz");
        double yarıçap1 = scanner1.nextDouble();
        System.out.println("cemberın cevresi" + 2*3.14*yarıçap1);
        System.out.println("cemberin alanı:" + 3.14*yarıçap1*yarıçap1);

        // hocanın anlattığı bölüm=
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap = scanner.nextDouble();

        System.out.println("Cemberin cevresi : " + 2 * 3.14*yaricap);

        System.out.println("Dairenin alani : " + 3.14*yaricap*yaricap);
    }
}
