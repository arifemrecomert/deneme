package day25_arrayLists;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr ={20,30,5,45};

        // array'in tüm elementlerini toplayın
        // array'in tüm elementerini yazdırın
        // array'in elementlerinden çift sayı olanları yazdırın
        // array'in elementlerinden en buyuk olanı bulun

        /*
        Array'in tüm elementlerini gözden geçirmemiz gereken sorularda
         forloop kullanırız
        ForrLoop'un en önemli özelliği index sayesinde tüm elementleri
        sıfırıncı indexten sonuncu indexe kadar sıralı olarak getirmesidir

        ama bu sorularda elementi sırasıyla getirmesinin hiç bir önemi yok

        indexin yani sıralı getirmenin önemli olmadığı durumlarda
        forloop yerine for-eachloop kullanırız
         */
        for (int each:arr
             ) {
            System.out.print(each+ " ");
        }


    }
}
