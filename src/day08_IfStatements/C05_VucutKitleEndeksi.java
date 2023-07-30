package day08_IfStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu, 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.
Scanner scan = new Scanner(System.in);
        System.out.println("lütfen boyunuzu giriniz");
        double boy1 = scan.nextDouble();
        System.out.println("lütfen kilonuzu giriniz");
        double kilo1 = scan.nextDouble();
        double vke1 = kilo1*1000/(boy1*boy1);
        System.out.println("vke" + kilo1*10000/ boy1*boy1);
        if (vke1>=30){
            System.out.println("obezsiniz");
        } else if (vke1>=25) {
            System.out.println("kilolusunuz");
        } else if (vke1>=20) {
            System.out.println("kilonuz normal");
        }else System.out.println("zayıfsınız");



        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        double kilo = scanner.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy = scanner.nextDouble();
        double boykiloendeksi = kilo*10000 / (boy*boy);
        System.out.println("vücut kitle endeksi" + kilo*10000/ boy*boy);

        if (boykiloendeksi>=30) {
            System.out.println("obez");
        }
        else if (boykiloendeksi>=25) {
            System.out.println("kilolu");
        }
        else if (boykiloendeksi>=20) {
            System.out.println("normal");
        }
        else {
            System.out.println("zayıf");
        }
    }}
