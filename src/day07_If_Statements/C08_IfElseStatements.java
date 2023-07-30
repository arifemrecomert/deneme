package day07_If_Statements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //        degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();
        if (kenar1==kenar2&&kenar2==kenar3&&kenar2>0){
            System.out.println("eşkenar üçgen");
        }
        else System.out.println("eşkenar üçgen değil");


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen üçgenin 3 kenar uzunluklarını giriniz");
        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();
        double sayı3 = scanner.nextDouble();
        if (sayı1==sayı2&&sayı1==sayı3&&sayı1>0){
            System.out.println("eşkenar üçgen");
        }
        else {System.out.println("eşkenar değil"); }

    }
}
