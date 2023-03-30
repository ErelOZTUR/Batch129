package depoYönetimi;

import depoYönetimi.task.txt.Apartman;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaPrattik {
    public static void main(String[] args) {

        Apartman da01=new Apartman("dogu",1,7000);
        Apartman da02=new Apartman("bati",2,10000);
        Apartman da03=new Apartman("guney",3,12000);
        Apartman da04=new Apartman("dogu",5,15000);

        List<Apartman> daireler=new ArrayList<>(Arrays.asList(da01,da02,da03,da04));


        System.out.println(tumDaireKira5000denBuyukIseTrue(daireler));
        System.out.println("\n********");

        System.out.println(EnazBirininKatSayisi2iseTrue(daireler));
        System.out.println("\n********");

        System.out.println(cephesiDoguOlanlarinSayisi(daireler));
        System.out.println("\n********");
        //System.out.println(katSayisiIkidenFazlaOlanlariBuyuktenKucugeYazdirYuksekKirayiYazdir(daireler));
        System.out.println("\n********");

        System.out.println(printE1(daireler));

    }

    // SORU1: Tüm dairelerin kira'ları 5000'den buyuk ise return ederek True yazdırın

    public static  boolean tumDaireKira5000denBuyukIseTrue(List<Apartman>daireler){

        Boolean sonuc= daireler.stream().allMatch(t->t.getKira()>5000);

        return sonuc;



    }
    //Soru2;Dairelerden en az birinin katsayinin 2 ise return ederek Truee yazdirin

    public static boolean EnazBirininKatSayisi2iseTrue(List<Apartman>daireler){

        Boolean sonuc=daireler.stream().anyMatch(t->t.getKatSayi()==2);

        return sonuc;
    }

    //SORU3: Dairelerden cephesi 'dogu' olanların, sayısını return ederek yazdırınız.

    public static long cephesiDoguOlanlarinSayisi(List<Apartman>daireler){

        long sonuc=daireler.stream().filter(t->t.getCephe().contains("dogu")).count();

        return sonuc;


    }

    //SORU4: Daireleri, katSayisina göre buyukten kucuge sıralayınız.
    // List halinde return ederek yazdırınız.

    public static void katSayisinaGoreBuyuktenKucugeGoreSirala(List<Apartman>daireler){

        List<Apartman> sonuc= daireler.stream().sorted(Comparator.comparing(Apartman::getKatSayi).reversed()).collect(Collectors.toList());

    }
    public static void katSayisiIkidenFazlaOlanlariBuyuktenKucugeYazdirYuksekKirayiYazdir(List<Apartman>daireler){
         daireler.stream().filter(t->t.getKatSayi()>2).sorted(Comparator.comparing(Apartman::getKira).reversed()).
                limit(1).
         map(t->t.getKira()).collect(Collectors.toList());

    }
    public static Object printE1(List<Apartman>daireler){
                daireler.
                stream().
                filter(t->t.getKatSayi()<3).
                sorted(Comparator.comparing(Apartman::getKira)).limit(1).
                map(t->t.getKira()).
                collect(Collectors.toList());


        return null;
    }
}
