package day08_IfStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {
    public static void main(String[] args) {
        // Kullanicidan bir tam sayi isteyin
// Sayi 3' e bolunuyorsa 3'un kati
// sayi 5'e bolunuyorsa 5'in kati
// ikisine birden bolunuyorsa super sayi yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayı = scanner.nextInt();

        if (sayı%3==0 && sayı%5==0){
            System.out.println("süper sayı");
        }
        else if (sayı%3==0) {
            System.out.println("3ün katı");
        }
        else if (sayı%5==0){
            System.out.println("5İn katı");
        }
    }
}
