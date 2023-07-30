package day08_IfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        // SORU 2 Kullanıcıdan bir karakter girmesini isteyin
        // girilen krakterin büyük harf olup olmadığını yazdırın.


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char girilenkarakter = scanner1.next().charAt(0);
        // kullanıcı ne kadar uzun kelime veya kelimeler girsede ilk karakteri alır.
        if (girilenkarakter>='A' && girilenkarakter<='Z'){
            System.out.println("girilen karakter büyük harf");}
        else{
            System.out.println("girilen karakter küçük harf");
        }
    }
}
