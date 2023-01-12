package practice.practice_nighttime.nighttime05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
//        int arr[][]={{9, 14, 1}, {16, -22, 3}};
//        out.println(Arrays.deepToString(arr));
//
//
//    }
//    public static int m(int[][] m){
//        int result = 3;
//        for (int i = 0; i <m.length ; i++) {
//            for (int j = 0; j <m[i].length ; j++) {
//                res

            //}

        //
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz");
       String str= input.nextLine();
       String arr[]= str.split("");
        System.out.println(Arrays.toString(arr)); //[a, l, a, c, a, n]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
int counter=0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                counter++; //Aynı olanlar için 1 artır
            } else {
                System.out.println(arr[i-1]+ " karakterinin sayısı " + (counter+1) +" kez kullanılmıştır");
                counter=0;  //başka harfe geçtiği için sifirlanmali
            }if (i== arr.length-1)
            System.out.println(arr[i]+" karakterinin sayısı "+(counter+1)+" kez kullanılmıştır.");
        }

    }

}
