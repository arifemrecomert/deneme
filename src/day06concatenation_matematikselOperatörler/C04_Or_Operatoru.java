package day06concatenation_matematikselOperatörler;

public class C04_Or_Operatoru {
    public static void main(String[] args) {
        System.out.println(3<5||6<4); // true
        System.out.println(3<5||6>4); // true
        System.out.println(3<5||6<4); // true
        System.out.println(3>5||6<4); //false
int sayi =14;
        System.out.println(sayi % 3==0 || sayi % 5 == 0); // false
        System.out.println(sayi>0 || sayi<100); // true
    }
}
