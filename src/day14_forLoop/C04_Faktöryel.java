package day14_forLoop;

import java.util.Scanner;

public class C04_Faktöryel {
    public static void main(String[] args) {
// Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan = new Scanner(System.in);
        System.out.println("20den küçük bir sayı giriniz");
        int sayı = scan.nextInt();
        int çarpım = 1;

        for (int i = 1; i <=sayı ; i++) {
            çarpım*=i;
        }
        System.out.println("faktöryel:" + çarpım);



/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();


        int carpim = 1;

        for (int i = 1; i <=sayi ; i++) {

            carpim *= i ;
        }

        System.out.println("girilen sayi olan " + sayi+"! = " + carpim);

 */
    }
}
