package day37lambda;

import day26overriding.Mammal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ornek {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);
        System.out.println(printE1(myList));
        System.out.println();
        System.out.println(printE2());
        System.out.println();
        System.out.println(printE3());
    }
    //1)Verilen list'deki tum sayilarin toplamini veren method'u olusturunuz
    public static int printE1(List<Integer> myList){
    return myList.stream().reduce(Math::addExact).get();


    }
    //2)7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz,
    public static int printE2(){
      return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }
    //3)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    public static int printE3(){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }
}
