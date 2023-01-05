package day16multidimensionalarrays;

import java.util.Arrays;

public class Denem {
    public static void main(String[] args) {
        //Example 1: Bir multi-dimensional array olusturunuz ve bir dimensional'li array donusturunuz.
        //           [ [2, 5], [4, 7, 11] ] ==> [ 2, 5, 4, 7, 11 ]
        int a[][] = { {4, 5},{8,-2,9,14} ,{96, 7, 11} };

        //"a" array'indeki toplam eleman sayisini bulunuz
        int totalElement=0;
        for (int [] w:a){
            totalElement=totalElement+w.length;
            System.out.println(Arrays.toString(w));
        }

        System.out.println(totalElement);
        int b[]=new int[totalElement];
        int idx=0;
        for (int [] w:a){
            for (int k:w){


                 b[idx]=k;

idx++;
            }
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println();
        int sum=0;
        for (int j:b){
            sum=sum+j;
        }
        System.out.println(sum);
    }
}

