package day12_StringManipulations;

public class C05_Örnek {
    public static void main(String[] args) {
        // Metne bakmadan e harfinin 2 kere veya daha fazla kullanilip kullanilmadigini kontrol edin

        String str1 = "Javayi ogrenecegiz, baska yolu yok";
        int birinciindex = str1.indexOf("e");
        System.out.println(birinciindex);
        int ikinciindex =str1.indexOf("e",birinciindex+1);
        System.out.println(ikinciindex);

        if (birinciindex==-1) System.out.println("'e' harfi hiç kullanılmamış");
        else   {
            if (ikinciindex==-1) {
            System.out.println("'e' harfi iki kere kullanılmamış");
        }else {
            System.out.println("'e' harfi en az iki kere kullanılmıştır");
        }

        }
    }
}
