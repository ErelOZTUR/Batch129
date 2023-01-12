package ssglistarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir list  olarak yazdiran bir method olusturun

        int arr[]={3,4,2,0,0,3,5,7,1,3,8,5,6,9,2,4};

        int istenmeyenEleman= (int) (Math.random()*9);
        List<Integer> list=new ArrayList<>();
        System.out.println(istenmeyenEleman);
        for (Integer w:arr){
            if (w!=istenmeyenEleman){
                list.add(w);
            }


        }
        System.out.println(list);
    }
}
