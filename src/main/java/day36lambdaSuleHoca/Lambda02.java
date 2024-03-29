package day36lambdaSuleHoca;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {

        Universite u1 = new Universite("hacettepe","fizik",1200,88);
        Universite u2 = new Universite("bogazici","qa",1000,90);
        Universite u3 = new Universite("odtu","dev",900,95);
        Universite u4 = new Universite("marmara","matematik",3000,60);
        Universite u5 = new Universite("ege","elektrik-elektronik",2000,83);
        Universite u6 = new Universite("a","matematik",3000,60);
        Universite u7 = new Universite("b","matematik",3000,60);
        List<Universite> unv = new ArrayList<>(Arrays.asList(u1,u2,u3,u4,u5,u6,u7));
      //  System.out.println(notOrt75tenByk(unv));
        //  System.out.println();
        // System.out.println(mtkVrmYkm(unv));//true
        //  System.out.println();
        System.out.println();
        System.out.println(printE2(unv));
        System.out.println();
        System.out.println(printE3(unv));
        System.out.println();
        System.out.println(printE4(unv));


    }//main

    // Task 01 : Butun universitelerin not ortalamasinin 75'ten buyuk oldugunu
    // gosteren bir program olusturunuz.
    public static boolean notOrt75tenByk(List<Universite> unv){
        return  unv.
                stream().
                allMatch(t->t.getNotOrtalamasi()>75);

    }

    // Task 02 : Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden
    //  bir program olusturunuz.
    public static boolean mtkVrmYkm(List<Universite> unv){
        return  unv.
                stream().
                anyMatch(t->t.getBolum().equalsIgnoreCase("matematik"));

    }

        // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayan
        //    bir program olusturunuz.

public static List<Universite> printE1(List<Universite> unv){
    return unv.
            stream().
            sorted(Comparator.comparing(Universite::getOgrenciSayisi).
                    reversed()).
            collect(Collectors.toList());
    
}

        //Task 04-->"matematik" bolumlerinin sayisini  print ediniz.
public static int printE2(List<Universite> unv){
       return (int) unv.
               stream().
               filter(t->t.getBolum().contains("matematik")).
               count();

}

        //Task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
public static Universite printE3(List<Universite> unv){
      return unv.stream().sorted(Comparator.comparing(Universite::getOgrenciSayisi).reversed()).findFirst().get();
//return unv.stream().
// filter(t->t.getOgrenciSayisi()>550).
// mapToInt(t->t.getNotOrtalamasi()). // mapToInt ile değeri güncelledik.
// max();                             // max() methodundan null gelme ihtimali wrapper classlarda var
                                        // OptionalInt return etmeni ister
    }
//Task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
public static Universite printE4(List<Universite> unv){

        return unv.stream().sorted(Comparator.comparing(Universite::getOgrenciSayisi)).findFirst().get();
        //return unv.stream().filter(t->t.getOgrenciSayisi()<1050).mapToInt(t->t.getNotOrtalamasi()).min();
}


}
