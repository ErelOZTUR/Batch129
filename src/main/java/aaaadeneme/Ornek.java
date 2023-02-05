package aaaadeneme;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        //clear()Map içinde bütün değerleri siler..
        // get(Object key) Anahtara karşılık gelen objeyi getirir.
        // put (Object key,Object value) Anahtar-değer ikilisini kayıt eder.
        Scanner scan=new Scanner(System.in);
        Map<String, String> hastalar = new HashMap<>();

        hastalar.put("111", "Warren, Traven, Allerji");
        hastalar.put("222", "Petanow, William, Bas agrisi");
        hastalar.put("333", "Sophia, George, Diabet");
        hastalar.put("444", "Emma, Tristan, Soguk alginligi");
        hastalar.put("555", "Darian, Luis, Migren");
        hastalar.put("666", "Peter, Cole, Kalp Hastaliklari");
        System.out.print("Silmek istediginiz hastanin ID numarasi : ");
        String silID = scan.nextLine();
        String silinecekValue = hastalar.get(silID);
        String sonucValue = hastalar.remove(silID);
        boolean kontrol = silinecekValue.equalsIgnoreCase(sonucValue);
        if (kontrol) {
            System.out.println("Kayit silindi.");
        } else System.out.println("Bulunamadi.");
    }
}
