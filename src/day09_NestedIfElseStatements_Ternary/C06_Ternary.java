package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();
        System.out.println(sayı1>sayı2 ?sayı2 : sayı1);
    }
}
