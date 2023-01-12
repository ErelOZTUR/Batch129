package ssglistarraylist;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        List<Integer> tekrarsızList = new ArrayList<>();
       for (Integer w:sayilar){
           if (!tekrarsızList.contains(w)){
               tekrarsızList.add(w);
           }

        }
        System.out.println(tekrarsızList);
    }
}
