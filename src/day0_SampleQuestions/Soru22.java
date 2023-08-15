package day0_SampleQuestions;

import java.util.Scanner;

public class Soru22 {
    public static void main(String[] args) {
        /*
        Soru 22-)Kullanıcıdan 2 tamsayı girmesini isteyin,
                ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120ipucu:
        Loopları kullanarak çözebiliriz.
            İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci tam sayıyı giriniz");
        int num1 = scanner.nextInt();
        System.out.println("Lütfen ikinci tam sayıyı giriniz");
        int num2 = scanner.nextInt();

        int flag =0;
        System.out.println("Girdiğiniz sayılar sırasıyla:" +num1+"-"+num2);
        int limitEbob = 0;

        if (num1<num2){
            limitEbob=num1;
        }else {
            limitEbob=num2;
        }
        for (int i = limitEbob; i >1; i--) {
            if (num1%i==0 && num2%i==0){
                System.out.println("Bu sayıların EBOB değeri:" +i);
                flag++;
                break;
            }

            }if (flag==0){
                System.out.println("Bu iki sayının ortak böleni yoktur.");
        }

        flag = 0;
        System.out.println("Lütfen EKOK değeri olabilecek maksimum limiti giriniz");
        int limitEkok = scanner.nextInt();
        for (int i = 1; i <limitEkok ; i++) {
            if (i%num1==0 && i%num2==0){
                System.out.println("girdiğiniz sayıların EKOK değeri:" +i);
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Girdiğiniz sayıların 999999999'dan küçük bir EKOK değeri yoktur ");
        }
            }
        }

