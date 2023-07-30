package day14_forLoop;

import java.util.Scanner;

public class Örnek1 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
                Örnek:
        char ch1=            'a'
        String name =     "Ali bakkala geç gitti."
        Beklenen Çıktı=    a sayısı = 3
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String isim = scanner.nextLine();
        System.out.println("lütfen bir karakter giriniz");
        char ch1 = scanner.next().charAt(0);
         int sayac = 0;
         int index = 0;

        for (int i = index; i < isim.length() ; i++) {
            if (isim.charAt(index)==ch1)
                sayac++;
            index++;
        }
        System.out.println(sayac);

}}

/* İkinci Yöntem
while (index<isim.length()){
        if (isim.charAt(index) == ch1){
        sayac++;
        }
        index++;
        }
        System.out.println(sayac);
        */
