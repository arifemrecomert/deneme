package day18_whileLoop_DoWhileLoop;

public class Örnek {
    public static void main(String[] args) {
        // Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        // bu halini bize donduren bir method olusturun.

        String metin = "ali ata bak";

        String tersmetin = "";

        int index = metin.length()-1;

        while (index>=0){
            tersmetin+=metin.charAt(index);
            index--;

        }System.out.println(tersmetin);


    }
}
