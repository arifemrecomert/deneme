package day06concatenation_matematikselOperatörler;

public class C02_karşılaştırmaOperatörleri {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        b = 2 * a;
        System.out.println(b == 2 * a); //true

        System.out.println(3*b>5*a); //true

        System.out.println(b>=b-a); //true

        System.out.println(a<=b-a);//true

        System.out.println(a<b); //true
        System.out.println(! (a<b)); //false

        System.out.println(a != b); //true
    }
}
