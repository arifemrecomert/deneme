package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C08_SwitchStatements {
    public static void main(String[] args) {
        // kullanıcıdan ay numarasını alıp ay ismini yazdırın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("yazdırmak istediğiniz ay kaçıncı ay?");
        int aynumarası = scanner.nextInt();
        if (aynumarası==1) System.out.println("ocak");
        else if (aynumarası==2) System.out.println("şubat");
        else if (aynumarası==3) System.out.println("mart");
        else if (aynumarası==4) System.out.println("nisan");
        else if (aynumarası==5) System.out.println("mayıs");
        else if (aynumarası==6) System.out.println("haziran");
        else if (aynumarası==7) System.out.println("temmuz");
        else if (aynumarası==8) System.out.println("agustos");
        else if (aynumarası==9) System.out.println("eylül");
        else if (aynumarası==10) System.out.println("ekim");
        else if (aynumarası==11) System.out.println("kasım");
        else if (aynumarası==12) System.out.println("aralık");
        else System.out.println("ay numarası yanlış");


        switch (aynumarası){
            case 1:System.out.println("ocak");
            break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("ay numarası yanlış");
        }
    }
}
