package ssglistarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List04 {
    public static void main(String[] args) {
        // verilen bir array'i listeye cevirin
        String arr[]={"A" , "B" , "C"};
        List<String> yeniList=new ArrayList<>();
        for (String w:arr){
            yeniList.add(w);

        }
        System.out.println(yeniList);

        //2.yol
        List<String>yenilist= Arrays.asList(arr);
        System.out.println(yeniList);
        //3.yol
        ArrayList list3=new ArrayList<>(List.of(arr));
        System.out.println(list3);
    }
}
