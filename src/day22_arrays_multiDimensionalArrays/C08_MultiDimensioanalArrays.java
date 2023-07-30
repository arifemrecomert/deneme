package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MultiDimensioanalArrays {
    public static void main(String[] args) {
         /*
            Array'ler sayesinde
            birden fazla element barindirabilen yapilara giris yaptik

            bir okul dusunsek
            tum ogrencileri tek bir array'e koymak mantikli olmaz

            ogrencileri sinif ve subelere gore ayirmaliyiz

            Okul = { {5.siniflar}, {6.siniflar}, {7.siniflar}, {8.siniflar} }

            Okul = { { {5-A sinifi},{5-B Sinifi} } , {6.siniflar}, {7.siniflar}, {8.siniflar} }

            boylece 5-A sinifindaki bir ogrenciyi
            tum okulda aratmak yerine
            once 5.siniflar array'ine gider
            onun icinde de 5-A array'ine bakarim
         */

        int arr[] = {3, 2, 3, 4, 4, 5,};

        int count = 0;

        for(int i=0; i<arr.length; i++) {

            if(arr[i]==3) {

                count++;

            }

        }

        System.out.println(count);
        }

        }


