package day06concatenation_matematikselOperatörler;

public class C03AndOperatörü {
    public static void main(String[] args) {

        System.out.println( 5>3 && 6 > 4); //true
        System.out.println( 5 < 3 && 6 > 4); //false
        System.out.println( 5 > 3 && 6 <= 4); // false
        System.out.println( 5 <=3 && 6 <=4); //false
int sayi = 24;
        System.out.println(sayi % 2 == 0 && sayi % 3 == 0 && sayi % 5 ==0); //false

        System.out.println(sayi >= 0 && sayi <=100); // true
    }
}
