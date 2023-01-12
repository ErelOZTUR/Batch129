package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_arrays {
    public static void main(String[] args) {
        /*
8.soru Kullanicidan bir array'in boyutunu ve tum elementlerini alarak bir array olusturup,
bu array bize donduren bir method olusturun
 */
        arrayolustur();

    }public static int arrayolustur(){
        Scanner scan=new Scanner(System.in);
        System.out.println("kac elemanli bir array olusturmak istersiniz");
        int uzunluk= scan.nextInt();
        int olusturulan []= new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i+". indexteki deger icin sayi giriniz");
            olusturulan[i]=scan.nextInt();


        }
        System.out.println(Arrays.toString(olusturulan));
        return arrayolustur();
    }
}
