package day26_forEachLoop_constructor;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "Java her geçen gün daha zevkli hale geliyor";
        String harf = "a";

        String[] cumleArr = cumle.split("");
        int sayac = 0 ;

        for (String each: cumleArr
             ) {
            if (each.equals(harf)){
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println("aradığınız harf cümlede kullanılmamış");
        }else {
            System.out.println("aradığınız " + harf +  " harfi cümlede " + sayac + " " + "kere kullanılmış");
        }
    }
}
