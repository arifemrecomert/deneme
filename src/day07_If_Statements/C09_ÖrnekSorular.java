package day07_If_Statements;

import java.util.Scanner;

public class C09_ÖrnekSorular {
    public static void main(String[] args) {
        //Soru 1 Kullanıcıdan yaşını isteyin,
        // 65 yas ve üzeri ise "emekli olabilirsin" yazdırın.
        // yoksa emekli olması için çalışması gereken yıl sayısını yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        double yas1 = scan.nextDouble();
        if (yas1>=65) System.out.println("emekli olabilirisin");
        else if (yas1<65) System.out.println(65-yas1 +  "yıl daha çalışmalısınız");


        Scanner test = new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas = test.nextInt();
        if (yas>=65) {System.out.println("emekli olabilirsin");}
        else{
            System.out.println(65-yas);
            System.out.println("yıl daha çalışmanız gerekmektedir");


    }
}}
