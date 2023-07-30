package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_İstenmeyenİsimleriSil {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun.

        String[] arr = {"Mehmet","Ramazan","Ozan","Berk","Nergiz","Ayfer","Bugra"};
        List<String> isimler = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            isimler.add(arr[i]);
        }
        System.out.println("İsimler Listesi:" + isimler);

        System.out.println(istenmeyenleriSil(isimler, "e"));

        // isimler listesinin kalıcı olarak yeni hali almasını istersek

        isimler=istenmeyenleriSil(isimler,"a");

    }
    public static List<String> istenmeyenleriSil(List<String>isimler,String istenmeyenHarf){
        /*
        isim sildiğimizde index kayacaktır.
        Buda bazı elementlerin kontrol edilmemesine
        ve IndexOutofBounds hatasına sebep olabilir.

        verilen listeden isim silmek yerine
        başka boş bir liste oluşturalım
        ve SİLİNMEYECEK elemanları o listeye ekleyip
        yeni listeyi döndürelim
         */
        List<String> yeniList = new ArrayList<>();
        for (int i = 0; i <isimler.size() ; i++) {
            if (!isimler.get(i).contains(istenmeyenHarf)){
                yeniList.add(isimler.get(i));
            }
        }
        return yeniList;
    }
}
