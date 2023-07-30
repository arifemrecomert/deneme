package day10_SwitchCase_StringManipulations;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //         ve girilen harfin karsiligini yazdirin.
        //	I : International
        //	S : Software
        //	T : Testing
        //	Q : Qualifications
        //	B: Board

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen anlamını girmek istediğiniz harfi giriniz");
        char harf = scan.next().toUpperCase().charAt(0);
        switch (harf){
            case 'I':
                System.out.println("international");
                break;
            case 'S':
                System.out.println("softwere");
                break;
            case'T':
                System.out.println("testing");
                break;
            case 'Q':
                System.out.println("qualifications");
                break;
            case 'B':
                System.out.println("board");
                break;
            default:
                System.out.println("yazdığınız harf ISTQB' de yok");
        }

    }
}
