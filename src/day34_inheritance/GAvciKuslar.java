package day34_inheritance;

public class GAvciKuslar extends EHayvanlar  {
    // Bir class oluştururken
    // ilerde child class'lar olabilir diye düşünüyorsanız
    // sadece child class'larınulaşmasını istediğiniz method'ları
    // protected access modifier ile oluşturabilirsiniz
    public void hareket() {
        System.out.println("ucarlar");
    }
    public void beslenme() {
        System.out.println("et yerler");
    }
    public void pence() {
        System.out.println("pencelidir");
    }
    public void gaga() {
        System.out.println("sivri gagali");
    }
}











