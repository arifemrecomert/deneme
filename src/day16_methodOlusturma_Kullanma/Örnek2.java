package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class Örnek2 {
    public static void main(String[] args) {

        System.out.println(burcHesaplama(5, 5));

    }
    public static String burcHesaplama(int ay,int gun){
        String burc = "";
        switch (ay){
            case 3:
                if (gun >=21 && gun <=31){
                    System.out.println("Burcunuz KOÇ");
                }if (gun <=20) {
                System.out.println("Burcunuz BALIK");
            }
                break;
            case 4:
                if (gun >=21 && gun <=30){
                    System.out.println("Burcunuz BOĞA");
                }
                if (gun<=20){
                    System.out.println("Burcunuz KOÇ");
                }
                break;
            case 5:
                if (gun <= 20 ){
                    System.out.println("Burcunuz BOĞA");
                }
                if (gun >= 21 && gun <=31){
                    System.out.println("Burcunuz İKİZLER");
                }
                break;
            case 6:
                if (gun <= 20){
                    System.out.println("Burcunuz İKİZLER");
                }
                if (gun >=21 && gun<=30){
                    System.out.println("Burcunuz YENGEÇ");
                }
                break;
            case 7:
                if (gun<=22){
                    System.out.println("Burcunuz YENGEÇ");
                }
                if (gun >=23 && gun<=31){
                    System.out.println("Burcunuz ASLAN");
                }
                break;
            case 8:
                if (gun<=22){
                    System.out.println("Burcunuz ASLAN");
                }
                if (gun>=23 && gun <=31){
                    System.out.println("Burcunuz BAŞAK");
                }
                break;
            case 9:
                if (gun <=22){
                    System.out.println("Burcunuz BAŞAK");
                }
                if (gun >=23 && gun <= 30){
                    System.out.println("Burcunuz TERAZİ");
                }
                break;
            case 10:
                if (gun<=22){
                    System.out.println("Burcunuz TERAZİ");
                }
                if (gun >=23 && gun<=31){
                    System.out.println("Burcunuz AKREP");
                }
                break;
            case 11:
                if (gun <=22){
                    System.out.println("Burcunuz AKREP");
                }
                if (gun>=23 && gun<=30){
                    System.out.println("Burcunuz YAY");
                }
                break;
            case 12:
                if (gun<=21){
                    System.out.println("Burcunuz YAY");
                }
                if (gun>=22 && gun<=31){
                    System.out.println("Burcunuz OĞLAK");
                }
                break;
            case 1:
                if (gun<=19){
                    System.out.println("Burcunuz OĞLAK");
                }
                if (gun>=20 && gun<=31){
                    System.out.println("Burcunuz KOVA");
                }
                break;
            case 2:
                if (gun<=18){
                    System.out.println("Burcunuz KOVA ");
                }
                if (gun>=19 && gun <=29){
                    System.out.println("Burcunuz BALIK");
                }
                break;

        }if (gun>31) {
            System.out.println("Yanlış gün girdiniz");
        }
        if (ay>12) {
            System.out.println("Yanlış ay girdiniz");
        }
return burc ;
    }
    }

