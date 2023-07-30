package day09_NestedIfElseStatements_Ternary;

import javax.swing.*;
import java.util.Scanner;

public class C02_İndirimHesaplama {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen aldığınız ürün adedini giriniz");
        int ürünadedi = scan.nextInt();
        System.out.println("lütfen liste fiyatını giriniz");
        double listefiyati = scan.nextDouble();
        System.out.println("müşteri kartınız varmı? \n E: evet H: hayır");
        char müsterikartıvarmı = scan.next().toUpperCase().charAt(0);

        if (müsterikartıvarmı=='E') {
            if (ürünadedi>10) {
                System.out.println("%20 indirimli fiyat:" + ürünadedi*listefiyati*80/100);
            }else {
                System.out.println("%15 indirimli fiyat:"+ ürünadedi*listefiyati*85/100);
            }
        } else if (müsterikartıvarmı=='H') {
            if (ürünadedi>10){
                System.out.println("%15 indirimli fiyat:" + ürünadedi*listefiyati*85/100);
            }else {System.out.println("%10 indirimli fiyat:"+ ürünadedi*listefiyati*90/100);}

        } else System.out.println("yanlış giriş yaptınız");

    /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen ürün adedini giriniz");
        int ürünsayısı = scanner.nextInt();
        System.out.println("lütfen liste fiyatını giriniz");
        double listefiyatı = scanner.nextDouble();
        System.out.println("müşteri kartınız var mı? \n E:evet, H : hayır");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);
        // ana değişken kart varmı bilgisi olsun
        if (kartVarMi == 'E') { //kartı olanlar
            // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
            if (ürünsayısı > 10) {
                System.out.println("%20 indirimli toplam fiyat:" + ürünsayısı * listefiyatı * 80 / 100);
            } else {
                System.out.println("%15 indirimli toplam fiyat:" + ürünsayısı * listefiyatı * 85 / 100);
            }
        } else if (kartVarMi == 'H') {// kartı olmayanlar
            if (ürünsayısı > 10) {
                //        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.
                System.out.println("%15 indirimli toplam fiyat:" + ürünsayısı * listefiyatı * 85 / 100);
            } else {
                System.out.println("%10 indirimli toplam fiyat:" + ürünsayısı * listefiyatı * 90 / 100);
            }

        } else { // hatalı kart bilgisi
            System.out.println("kart bilgisi hatalı");
        }

     */
    }}
