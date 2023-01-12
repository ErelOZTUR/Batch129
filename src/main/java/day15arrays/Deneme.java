package day15arrays;

import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {
         /*
        4.soru Verilen 3 elemanli bir array in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
        Ornek; array (1,2,3) ise output (2, 3, 1) olacak
         */
//        int arr[]={1,2,3,4,5};
//int atama =arr[0];
//
//        for (int i = 1; i <arr.length ; i++) {
//            arr[i-1]=arr[i];
//
//        }
//        arr[arr.length-1]= atama;
//        System.out.println(Arrays.toString(arr));
         /*
5.soru Verilen bir int array'deki en buyuk sayiyi yazdiran bir method olusturun.
 */
        int sayilar[]={2,1,3,4,5,6,-1,78};

        makssayi(sayilar);

    }public static void makssayi(int [] sayilar){
int maks=0;
        for (int i = 0; i < sayilar.length ; i++) {
            if (maks<sayilar[i]){
                maks=sayilar[i];
            }

        }
        System.out.println(maks);
    }
}
