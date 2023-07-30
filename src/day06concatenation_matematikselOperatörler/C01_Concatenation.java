package day06concatenation_matematikselOperatörler;

import com.sun.tools.javac.Main;

import java.sql.SQLOutput;

public class C01_Concatenation {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "candır";
        String s3 = " ";
        String s4 = "";
        int a =3 ;
        int b =5 ;
        System.out.println(s1+a+b); //java35
        System.out.println(s1+a*b); //java15
        System.out.println(a+b+s2); //8candır
        System.out.println(b+(a+s1)); //53java
        System.out.println(s4 + b + a + s1); //53java
        System.out.println(b+s4+a+s1); //53java
        System.out.println(a+s4+b+s3+s1);//35 java
    }
}
