package day21_Arrays;

import java.util.Arrays;

public class Örnek {
    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’in
        // tum elemanlarını 2 artirin
/*
        int[] sayı = {1,2,3,4,5};
        for (int i = 0; i < sayı.length ; i++) {
            sayı[i]+=2;

        }System.out.println(Arrays.toString(sayı));
 */

        // verilen array'in tum elementlerini
        // artis miktari kadar artirin
        /*
        int[] arr ={1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,};
        int artismiktari=5;

        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=artismiktari;
        }
        System.out.println(Arrays.toString(arr));
         */

        //Soru 2- Verilen bir array’deki
        //        pozitif tamsayilari toplayin

        int [] arr ={-5,6,5,-4};
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam += arr[i];
            }
            System.out.println(Arrays.toString(arr));
}
    }}
