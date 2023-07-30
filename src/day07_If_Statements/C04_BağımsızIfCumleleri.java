package day07_If_Statements;

import java.util.Scanner;

public class C04_BağımsızIfCumleleri {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
    Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayı1 = scan.nextDouble();
        if (sayı1%3==0){
            System.out.println("3 ile bölünebilen sayı");
        }
        if (sayı1%5==0){
            System.out.println("5 ile bölünebilen sayı");
        }






        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int tamsayı = scanner.nextInt();
        if (tamsayı%3==0) {
            System.out.println("3 ile bölünebilen sayı");
        }
        if (tamsayı%5==0) {
            System.out.println("5 ile bölünebilen sayı");
        }
    }
}
