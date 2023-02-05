package aaaadeneme;

import java.util.*;

public class VeriBankasi<Nilson> {
    public static void doktorIsimleri() {
        Doktor doktor=new Doktor();
        //clear()Map içinde bütün değerleri siler..
        // get(Object key) Anahtara karşılık gelen objeyi getirir.
        // put (Object key,Object value) Anahtar-değer ikilisini kayıt eder.

        HashMap<String,String> doctor=new HashMap<String,String>();
        doctor.put("Allergist", "Wilson, Avery");
        doctor.put("Norolog", "John, Abel");
        doctor.put("Genel cerrah", "Robert, Erik");
        doctor.put("Cocuk doktoru", "Marry, Jacob");
        doctor.put("Dahiliye", "Alan, Pedro");
        doctor.put("Kardiolog", "Mahesh, Tristen");

}
}
//  ArrayList<String> doctorIsimleri = { "Nilson", "John", "Robert", "Marry", "Alan", "Mahesh" };
//  ArrayList<String> doctorSoyIsimleri= { "Avery", "Abel", "Erik", "Jacob", "Pedro", "Tristen"};
//  ArrayList<String> unvanlar = { "Allergist", "Norolog", "Genel cerrah", "Cocuk doktoru",
//    "Dahiliye", "Kardiolog" };
//  ArrayList<String> hastaIsimleri = { "Warren", "Petanow", "Sophia", "Emma", "Darian",
//   "Peter" };
//  ArrayList<String> hastaSoyIsimleri= { "Traven", "William", "George", "Tristan", "Luis",
//        "Cole"};
//  ArrayList<String> durumlar= { "Allerji", "Bas agrisi", "Diabet", "Soguk alginligi", "Migren",
//        "Kalp hastaliklari"};


// int [] hastaIDleri = {111,222,333,444,555,666}
