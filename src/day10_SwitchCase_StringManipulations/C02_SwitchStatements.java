package day10_SwitchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan gun numarasini alip
        //        hafta ici veya hafta sonu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gün numarasını giriniz");
        int günNo = scan.nextInt();
        switch (günNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("haftaiçi");
                break;
            case 6:
            case 7:
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("gün numarası 1-7 arasında olmalıdır");

        }






    }
}
