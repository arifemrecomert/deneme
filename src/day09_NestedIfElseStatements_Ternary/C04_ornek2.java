package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C04_ornek2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir gün giriniz");
        String gun=scanner.next().toUpperCase();


        if (gun.contains("PAZARTESİ"))

            System.out.println("şimdi çalışma zamanı, tatile 4 gün var");
        else if (gun.contains("SALİ")) {
            System.out.println("şimdi çalışma zamanı, tatile 3 gün var");
        } else if (gun.contains("ÇARŞAMBA")) {
            System.out.println("şimdi çalışma zamanı, tatile 2 gün var");

        } else if (gun.contains("PERŞEMBE")){
            System.out.println("şimdi çalışma zamanı, tatile 1 gün var");

        } else if (gun.contains("CUMA")) {
            System.out.println("şimdi çalışma zamanı, yarın tatil");

        } else if (gun.contains("CUMARTESİ")||gun.contains("PAZAR")) {
            System.out.println("şimdi tatil zamanı");

        }else System.out.println("gün yanlış girildi");


    }
}
