package day0_SampleQuestions;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
        /*Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup
        bunları özel forma dönüştürün.
         Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
            Ipucu: IF ile çözebilirsiniz.
            Giriş :
		        > Gandalf Grey 563245879632
            Çıktı :
		        > İsim : G****** G***
		        > CCN : **** **** 9632
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();
        System.out.println("Lütfen 16 haneli kredikartı numaranızı giriniz");
        String ccn = scanner.nextLine();
        ccn=ccn.replaceAll("\\D","");
        if (ccn.length()!=16){
            System.out.println("Geçersiz Kart Numarası");
        }else {
            String name = isim;
            String surname = soyisim;
            name=name.toUpperCase().charAt(0)+name.substring(1).replaceAll("\\w","*");
            surname=surname.toUpperCase().charAt(0)+surname.substring(1).replaceAll("\\w","*");

            String kredikartıno= ccn.substring(0,4).replaceAll("\\d","*")+ " " +
                    ccn.substring(4,8).replaceAll("\\d","*")+ " " +
                    ccn.substring(8,12).replaceAll("\\d","*")+ " " +
                    ccn.substring(12);
            System.out.println("İSİM:" + name+surname);
            System.out.println("CCN:"+ kredikartıno);
        }
    }}
